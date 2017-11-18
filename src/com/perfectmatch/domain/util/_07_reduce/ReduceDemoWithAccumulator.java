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

/**
 * <class description>
 *
 */

class StatisticsUtility {

    public static int addIntData(int num1, int num2) {

        return num1 + num2;
    }
}

public class ReduceDemoWithAccumulator {

    public static void main(String[] args) {

        int[] array = { 23, 43, 56, 97, 32 };
        Arrays.stream(array).reduce((x, y) -> x + y).ifPresent(s -> System.out.println(s));
        Arrays.stream(array).reduce(Integer::sum).ifPresent(s -> System.out.println(s));
        Arrays.stream(array).reduce(StatisticsUtility::addIntData).ifPresent(s -> System.out.println(s));
    }

}
