package com.exlibris.my_spring;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object wrapWithProxy(Object t, Class type) {
        boolean methodNeedsBenchmark = Arrays.stream(type.getMethods()).anyMatch(method -> method.isAnnotationPresent(Benchmark.class));
        if (type.isAnnotationPresent(Benchmark.class)||methodNeedsBenchmark) {
            if (type.getInterfaces().length == 0) {
               return Enhancer.create(type, (InvocationHandler) (o, method, args) -> BenchmarkProxyConfigurator.this.invoke(method, args, type, t));
            }
            return Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), (proxy, method, args) -> BenchmarkProxyConfigurator.this.invoke(method, args, type, t));
        }
        return t;
    }

    private Object invoke(Method method, Object[] args, Class type, Object t) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method classMethod = type.getMethod(method.getName(), method.getParameterTypes());
        if (type.isAnnotationPresent(Benchmark.class) || classMethod.isAnnotationPresent(Benchmark.class)) {
            System.out.println("************* BENCHMARK started for method " + method.getName());
            long start = System.nanoTime();
            Object retVal = method.invoke(t, args);
            long end = System.nanoTime();
            System.out.println(end - start);
            System.out.println("************* BENCHMARK ended for method " + method.getName());
            return retVal;
        }
        else {
            return method.invoke(t, args);
        }
    }
}
