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


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class FilterListOfInteger {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 12, 23, 44, 20, 10, 17, 8);
        System.out.println("---List with even Numbers---");

        List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        evenList.forEach(s -> System.out.print(s + " "));
        System.out.println("\n---List with odd Numbers---");

        List<Integer> oddList = list.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());
        oddList.forEach(s -> System.out.print(s + " "));
    }
}