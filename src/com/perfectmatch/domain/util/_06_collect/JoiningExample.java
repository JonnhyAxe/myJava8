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
package com.perfectmatch.domain.util._06_collect;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ram", "Shyam", "Shiv", "Mahesh");
        String result = list.stream().collect(Collectors.joining(", "));
        System.out.println("Joining Result: " + result);
    }
}