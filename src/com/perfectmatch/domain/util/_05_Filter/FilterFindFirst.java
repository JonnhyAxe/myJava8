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
package com.perfectmatch.domain.util._05_Filter;


import java.util.ArrayList;
import java.util.List;

public class FilterFindFirst {

    public static void main(String[] args) {

        List<User> list = User.getUsers();
        System.out.println("Using findFirst() ---");
        User user = list.stream().filter(u -> u.getName().endsWith("sh")).findFirst().orElse(null);

        System.out.println(user.getName());
        System.out.println("Using forEach() ---");
        list.stream().forEach(u -> System.out.println(u.getName()));
    }

}

class User {

    private int id;

    private String name;

    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    @Override
    public String toString() {

        return "Name " + name;
    }

    static List<User> getUsers() {

        List<User> list = new ArrayList<>();
        list.add(new User(1, "Dinesh", 20));
        list.add(new User(2, "Kamal", 15));
        list.add(new User(3, "Vijay", 25));
        list.add(new User(4, "Ramesh", 30));
        list.add(new User(5, "Mahesh", 18));
        return list;
    }
}