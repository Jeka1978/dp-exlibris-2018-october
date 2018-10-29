package com.exlibris.multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public interface Mother {

    default void speak() {
        System.out.println("SON, WHERE ARE YOU!!!?");
    }
}
