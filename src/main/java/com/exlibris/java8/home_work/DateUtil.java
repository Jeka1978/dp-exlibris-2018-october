package com.exlibris.java8.home_work;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.DayOfWeek.*;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author Evgeny Borisov
 */
public class DateUtil {
    public static void printFriday13(int startYear, int endYear) {
        LocalDate startDate = LocalDate.of(startYear, 1, 13);
        LocalDate endDate = LocalDate.of(endYear, 12, 13);
        Stream.iterate(startDate, date -> date.plusMonths(1))
                .limit(ChronoUnit.MONTHS.between(startDate,endDate))
                .filter(date -> date.getDayOfWeek()==FRIDAY)
                .collect(groupingBy(LocalDate::getYear,counting()))
                .entrySet().stream()
                .sorted((x, y) ->Long.compare(y.getValue(),x.getValue()))
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
        printFriday13(1900,2018);
    }
}
