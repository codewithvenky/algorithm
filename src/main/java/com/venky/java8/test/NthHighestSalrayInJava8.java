package com.venky.java8.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NthHighestSalrayInJava8 {
    public static void main(String[] args) {


int N=2; // n is effectivly n-1
        List<Employee> lists = Arrays.asList(
                new Employee("sahil01","22","IT",14000),
                new Employee("sahil02","21","IT",42000),
                new Employee("sahil03","23","IT",40088),
                new Employee("sahil04","12","IT",4023),
                new Employee("sahil05","32","IT",4066),
                new Employee("sahil06","42","IT",4111),
                new Employee("sahil07","32","IT",8897),
                new Employee("sahil08","22","HR",476),
                new Employee("sahil09","29","HR",4900),
                new Employee("sahil10","27","HR",401),
                new Employee("sahil11","21","HR",5054),
                new Employee("sahil12","28","HR",6454),
                new Employee("sahil13","21","HR",4540)
        );
      Optional<Employee> first = lists.stream().sorted((o1, o2) -> o2.getSalary() - o1.getSalary()).skip(N - 1).findFirst();
        System.out.println(first);
        Optional<Employee> first02 = lists.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(N - 1).findFirst();
      System.out.println(first02);
    }
}
