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
package com.perfectmatch.domain.util._03_sort;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
public class SortMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(15, "Mahesh");
        map.put(10, "Suresh");
        map.put(30, "Nilesh");

        // cannot because java.util.HashMap$Node cannot be cast to
        // java.lang.Comparable
        // map.entrySet().stream().sorted()
        // .forEach(e -> System.out.println("Key: " + e.getKey() + ", Value: " +
        // e.getValue()));

        System.out.println("---Sort by Map Value---");
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(e -> System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue()));

        System.out.println("---Sort by Map Key---");
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue()));
    }
}