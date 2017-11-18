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
package com.perfectmatch.domain.util._07_reduce;

import java.util.Arrays;
import java.util.List;

/**
 * <class description>
 *
 */
public class ReduceDemoWithIdentityAndAccumulatorAndCombiner {

    public static void main(String[] args) {

        List<Integer> list2 = Arrays.asList(2, 3, 4);
        // Here result will be 2*2 + 2*3 + 2*4 that is 18.
        int res = list2.parallelStream().reduce(2, (s1, s2) -> s1 * s2, (p, q) -> p + q);
        System.out.println(res);

        List<String> list1 = Arrays.asList("Mohan", "Sohan", "Ramesh");
        String result = list1.parallelStream().reduce("-", (s1, s2) -> s1 + s2, (p, q) -> p + q);
        System.out.println(result);
    }
}
