package com.exlibris.quoters;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//        context.close();
    }
}
