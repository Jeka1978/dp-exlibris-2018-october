package com.exlibris.java8.home_work;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtil {
    public static Map<Seniority, List<Employee>> groupBySeniority(List<Employee> employees) {
        Map<Seniority, List<Employee>> map = employees.stream().collect(groupingBy(Seniority::bySalary));
        return map;
    }
}
