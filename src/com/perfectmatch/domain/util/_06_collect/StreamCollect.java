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
public class StreamCollect {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Mukesh", "Vishal", "Amar");
        String result = list.parallelStream().collect(StringBuilder::new,
                (response, element) -> response.append(" ").append(element),
                (response1, response2) -> response1.append(",").append(response2.toString()))
                .toString();
        System.out.println("Result: " + result);

    }
}