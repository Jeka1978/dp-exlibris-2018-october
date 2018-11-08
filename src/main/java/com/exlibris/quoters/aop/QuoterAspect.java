package com.exlibris.quoters.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class QuoterAspect {

//    @After("@annotation(Deprecated)")

    @Pointcut("execution(* com.exlibris..*.*(..))")
    public void allBusinessMethods(){}




    @Around("allBusinessMethods()&& @annotation(com.exlibris.my_spring.Benchmark)")
    public Object doWithBenchmark(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("*********BBBB******");
        Object retVal = pjp.proceed();
        System.out.println("*********BBBB******");
        return retVal;
    }

    @Before("execution(* com.exlibris..*.say*(..))")
    public void handleSayMethods(JoinPoint jp){
        String simpleName = jp.getTarget().getClass().getSimpleName();
        System.out.println("this is quote "+simpleName+" : ");
    }

}
