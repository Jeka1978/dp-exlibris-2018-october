package com.exlibris.java8;

import lombok.SneakyThrows;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author Evgeny Borisov
 */
public class ListUtils {

    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Action<T> action) {
        for (T t : list) {
            action.doAction(t);
            Thread.sleep(delay);
        }
    }
    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> action) {
        for (T t : list) {
            action.accept(t);
            Thread.sleep(delay);
        }
    }

    public static <T> int countDuplicates(T t, List<T> list, Equalator<T> equalator) {
        int counter=0;
        for (T t1 : list) {
            if (equalator.equals(t,t1)) {
                counter++;
            }
        }
        return counter;
    }

}
