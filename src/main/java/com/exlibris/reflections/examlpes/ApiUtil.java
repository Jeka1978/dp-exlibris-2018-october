package com.exlibris.reflections.examlpes;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Evgeny Borisov
 */
public class ApiUtil {


    @SneakyThrows
    public static Class getClass(String className) {
        return Class.forName(className);
    }

    @SneakyThrows
    public static Object createObjectFromClass(Class type) {
        if (!Modifier.isAbstract(type.getModifiers())) {
            return type.newInstance();
        }
        throw new RuntimeException("is abstract");
    }

    @SneakyThrows
    public static void runAllTestMethods(Object o) {
        Method[] methods = o.getClass().getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("test")) {
                method.invoke(o);
            }
        }
    }

    public static void printApi(Object o) {
        Class<?> type = o.getClass();
        Field[] fields = type.getDeclaredFields();
        System.out.println("fields:");
        for (Field field : fields) {
            System.out.println(field.getName());
        }


        System.out.println("Methods:");

        Method[] methods = type.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }


    }

    public static void main(String[] args) {
        Class type = getClass("com.exlibris.reflections.examlpes.MyTest");
        Object object = createObjectFromClass(type);

        runAllTestMethods(object);
//        printApi(java);



    }
}
