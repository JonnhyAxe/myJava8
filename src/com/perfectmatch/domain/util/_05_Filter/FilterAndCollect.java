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
import java.util.stream.Collectors;

public class FilterAndCollect {

    public static void main(String[] args) {

        List<User> list = User.getUsers();
        long count = list.stream().filter(u -> u.getName().endsWith("sh"))
                .collect(Collectors.counting());
        System.out.println("Number of users ending name with 'sh': " + count);
    }
}
