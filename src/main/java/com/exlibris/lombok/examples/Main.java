package com.exlibris.lombok.examples;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import java.time.LocalDate;
import java.util.HashMap;

/**
 * @author Evgeny Borisov
 */
public class Main {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate tomorrow = now.plusDays(1);
        LocalDate localDate = now.withYear(1978);


        Employee avner = Employee.builder().name("Avner").beer("Tuborg",1).beer("Leff",4)

                .salary(30000).bonus(1000).beer("Goldstar",3).build();
        System.out.println("avner = " + avner);
        Employee vered = avner.withName("Vered").withSalary(40000);
        System.out.println("vered = " + vered);
    }
}






