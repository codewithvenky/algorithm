package com.venky.oracle.pkg16;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String neighborhood;
    private int salary;

    public Employee(String name, String neighborhood, int salary) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List< Employee > roster = new ArrayList< >();
        roster.add(new Employee("John", "Park", 10000));
        roster.add(new Employee("Jane", "Park", 20000));
        roster.add(new Employee("Joe", "Park", 30000));
        roster.add(new Employee("Jack", "Park", 40000));
        roster.add(new Employee("Jill", "Test", 50000));
        roster.add(new Employee("Jana", "Test", 60000));
        roster.add(new Employee("Juan", "tree", 70000));
        Predicate< Employee > p = e -> e.getSalary() > 30000;
        Function <Employee, Optional < String >> f =e -> Optional.ofNullable(e.getNeighborhood());

        //OPTION A its ture
        Map< String, List < Employee >> rl = roster.stream()
        .collect(Collectors.groupingBy(Employee::getNeighborhood,
                Collectors.filtering(p, Collectors.toList())));
       // System.out.println(rl);
        //Option B is the compilation error
      //  Map < Optional < String > , List < Employee >> r3 = roster.stream().filter(p).collect(Collectors.groupingBy(p));
        //Option  C This option is alos true
        Map < Optional < String > , List < Employee >> r4 = roster.stream().collect(Collectors.groupingBy(f, Collectors.filtering(p, Collectors.toList())));
       // System.out.println(r4);

        //Optoin D   Compilation error
/*        Map < String, List < Employee >> r2 = roster.stream().filter(p)
                .collect(Collectors.groupingBy(f, Employee::getNeighborhood));*/


        //Option E
  /*      Map < Optional < String > , List < Employee >> r5 = roster.stream()
                .collect(Collectors.groupingBy(Employee::getNeighborhood,
                        Collectors.filtering(p, Collectors.tolist()))));*/

    }

}


//Solution is A or C is true
