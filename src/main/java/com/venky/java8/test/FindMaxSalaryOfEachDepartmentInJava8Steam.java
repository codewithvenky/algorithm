package com.venky.java8.test;

import java.util.*;
import java.util.stream.Collectors;

public class FindMaxSalaryOfEachDepartmentInJava8Steam {
    public static void main(String[] args) {

              List<com.venky.java8.test.Employee> lists = Arrays.asList(
                new com.venky.java8.test.Employee("sahil01","22","IT",14000),
                new com.venky.java8.test.Employee("sahil02","21","IT",42000),
                new com.venky.java8.test.Employee("sahil03","23","IT",40088),
                new com.venky.java8.test.Employee("sahil04","12","IT",4023),
                new com.venky.java8.test.Employee("sahil05","32","IT",4066),
                new com.venky.java8.test.Employee("sahil06","42","IT",4111),
                new com.venky.java8.test.Employee("sahil07","32","IT",8897),
                new com.venky.java8.test.Employee("sahil08","22","HR",476),
                new com.venky.java8.test.Employee("sahil09","29","HR",4900),
                new com.venky.java8.test.Employee("sahil10","27","HR",401),
                new com.venky.java8.test.Employee("sahil11","21","HR",5054),
                new com.venky.java8.test.Employee("sahil12","28","HR",6454),
                new com.venky.java8.test.Employee("sahil13","21","HR",4540)
                );

        Map<String, com.venky.java8.test.Employee> collect = lists.stream().collect(Collectors.groupingBy(e -> e.getDept(), Collectors.collectingAndThen(Collectors.maxBy((o1, o2) -> o1.getSalary() - o2.getSalary()), Optional::get)));

        System.out.println(collect);

        Map<String, com.venky.java8.test.Employee> collect01 = lists.stream().collect(Collectors.groupingBy(e -> e.getDept(), Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(com.venky.java8.test.Employee::getSalary)), Optional::get)));

        System.out.println(collect01);

    }
}
