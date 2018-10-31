package com.exlibris.java8;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface Action<T> {
    void doAction(T t);
}
