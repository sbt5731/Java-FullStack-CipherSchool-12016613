package com.saurabhjava;

import java.util.Arrays;
import java.util.stream.Stream;

class Employee{
    String name;
    Employee(String name) {
        this.name = name;
    }
}

public class oops2 {
    public static void main(String[] args){
        Employee e1 = new Employee("Jack");
        Employee e2 = new Employee("Harry");
        Employee e3 = new Employee("Venessa");
        Employee[] employees = new Employee[]{e1,e2,e3};
        Stream<Employee> empStream= Arrays.stream(employees);
        empStream.forEach(e->System.out.println("Employee name: "+e.name));

    }
}
