/*
 * Copyright 2017 by Brisa Inovação e Tecnologia S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Brisa, SA ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with Brisa.
 */
package com.perfectmatch.domain.util._04_map;


import java.util.Arrays;
import java.util.List;
public class MapToIntDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, 20);
        Employee e2 = new Employee(2, 15);
        Employee e3 = new Employee(3, 30);
        List<Employee> list = Arrays.asList(e1, e2, e3);
        int sum = list.stream().mapToInt(e -> e.getAge()).sum();
        System.out.println("Sum: " + sum);
    }
}

class Employee {

    private int id;

    private int age;

    public Employee(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public int getId() {

        return id;
    }

    public int getAge() {

        return age;
    }
}