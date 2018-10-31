package com.exlibris.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "java", "JAVA", "scALA");
        int duplicates = ListUtils.countDuplicates("java", strings, (t1, t2) -> t1.equalsIgnoreCase(t2));
        System.out.println("duplicates = " + duplicates);
    }
}
