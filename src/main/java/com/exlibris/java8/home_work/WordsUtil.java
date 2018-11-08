package com.exlibris.java8.home_work;

import javafx.util.Pair;
import lombok.SneakyThrows;

import java.io.File;
import java.nio.file.Files;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

/**
 * @author Evgeny Borisov
 */
public class WordsUtil {

    private List<String> list = new ArrayList<>();

    @SneakyThrows
    public static void printMostPopular(File f) {
//        Files.lines(f.toPath())
//                .map(String::toLowerCase)
//                .flatMap(line -> Arrays.stream(line.split("\\s+")))  //stream of words NOW!!!
//                .map(word -> new Pair<>(word, 1))
//                .collect(groupingBy(Pair::getKey, counting()));
//

//        Files.lines(f.toPath())
//                .map(String::toLowerCase)
//                .flatMap(line -> Arrays.stream(line.split("\\s+")))  //stream of words NOW!!!
//                .collect(groupingBy(identity(),counting()))
//                .entrySet().stream()
//                .max(...)


        Optional<Map.Entry<Long, List<Map.Entry<String, Long>>>> optional = Files.lines(f.toPath())
                .map(String::toLowerCase)
                .flatMap(line -> Arrays.stream(line.split("\\s+")))  //stream of words NOW!!!
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .collect(groupingBy(Map.Entry::getValue))
                .entrySet().stream()
                .max(Map.Entry.comparingByKey());

        System.out.println(optional.get());//never do this, use orElse, orEsleThrow... ifPresent


    }

    public static void main(String[] args) {
        File file = new File("a.txt");
        printMostPopular(file);
    }
}



