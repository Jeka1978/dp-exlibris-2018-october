package com.exlibris.java8.home_work;

import lombok.AllArgsConstructor;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public enum Seniority {
    JUNIOR(0, 10000), MIDDLE(10001, 20000), SENIOUR(20001, Integer.MAX_VALUE);
    private int min;
    private int max;

    public static Seniority bySalary(int salary) {
        return Arrays.stream(values())
                .filter(seniority -> seniority.min < salary && salary < seniority.max)
                .findAny().orElseThrow(() -> new IllegalStateException("salary is not in valid range"));
    }

    public static Seniority bySalary(Employee employee) {
        int salary = employee.getSalary();
        return Arrays.stream(values())
                .filter(seniority -> seniority.min < salary && salary < seniority.max)
                .findAny().orElseThrow(() -> new IllegalStateException("salary is not in valid range"));
    }

}
