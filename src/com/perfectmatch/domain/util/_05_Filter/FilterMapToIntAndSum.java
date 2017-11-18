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


import java.util.List;

public class FilterMapToIntAndSum {

    public static void main(String[] args) {

        List<User> list = User.getUsers();
        System.out.println("--- Sum of age between the user id 2 and 4 ---");
        int sum = list.stream().filter(u -> u.getId() >= 2 && u.getId() <= 4)
                .mapToInt(u -> u.getAge()).sum();

        int sum2 = list.stream().filter(u -> u.getId() >= 2 && u.getId() <= 4)
                .mapToInt(u -> u.getAge()).reduce(0, Integer::sum);

        System.out.println("Sum1: " + sum);
        System.out.println("Sum2: " + sum2);
    }
}