package com.exlibris.java8.home_work;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;
import java.util.Map;

import static com.exlibris.java8.home_work.Seniority.JUNIOR;
import static com.exlibris.java8.home_work.Seniority.MIDDLE;
import static com.exlibris.java8.home_work.Seniority.SENIOUR;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtilTest {

    public static final String LANISTER = "Lanister";
    private List<Employee> employees;

    @Before
    public void setUp() throws Exception {
        employees = asList(
                new Employee("John Connor", 35000),
                new Employee("Sara Connor", 50000),
                new Employee(LANISTER, 18000),
                new Employee("Frodo", 1000),
                new Employee("Sam", 1000)
        );
    }

    @Test
    public void groupBySeniority() {
        Map<Seniority, List<Employee>> map = EmployeeUtil.groupBySeniority(employees);
        Assert.assertEquals(2,map.get(JUNIOR).size());
        Assert.assertEquals(1,map.get(MIDDLE).size());
        Assert.assertEquals(2,map.get(SENIOUR).size());
        Assert.assertEquals(LANISTER,map.get(MIDDLE).get(0).getName());
    }

    @After
    public void tearDown() throws Exception {

    }
}


