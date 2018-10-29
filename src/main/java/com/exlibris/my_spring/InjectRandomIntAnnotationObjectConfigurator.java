package com.exlibris.my_spring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class InjectRandomIntAnnotationObjectConfigurator implements ObjectConfigurator {
    private Random random = new Random();
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                field.setAccessible(true);

                field.set(t, random.nextInt(max - min) + min);
            }
        }

    }
}
