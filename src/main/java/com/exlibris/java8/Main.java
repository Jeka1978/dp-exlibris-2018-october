package com.exlibris.java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        Stream<Employee> stream = Stream.of(new Employee(10),new Employee(10), new Employee(13), new Employee(50));

        Map<Integer, List<Employee>> map = stream.collect(groupingBy(Employee::getSalary));
        System.out.println(map);
//        Map<Boolean, List<Employee>> map = stream.collect(partitioningBy(emp -> emp.getSalary() > 10));

//        System.out.println(map);

      /*  Map<Integer, Employee> map = stream.collect(toMap(Employee::getSalary,
                emp -> emp,(employee, employee2) ->employee ));
        System.out.println(map);*/


//        System.out.println(stream.mapToInt(Employee::getSalary).sum());


        /*Stream<Employee> stream = Stream.of(new Employee(12), new Employee(13), new Employee(50));
        Optional<Integer> optional = stream.map(Employee::getSalary).reduce(Integer::sum);
        System.out.println(optional.orElse(0));*/

       /* IntStream.iterate(1, i -> ++i).filter(value -> value > 10)
                .limit(5).forEach(System.out::println);
*/
       /* List<String> strings = Arrays.asList("Java", "java", "JAVA", "scALA");
        Stream<String> stream = strings.stream().unordered().filter(s -> s.startsWith("j"));
        stream.forEach(System.out::println);
        stream.filter(s->s.endsWith("a"));*/

    }
}
