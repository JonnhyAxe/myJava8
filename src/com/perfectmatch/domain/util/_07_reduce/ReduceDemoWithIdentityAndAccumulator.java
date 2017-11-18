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
public class ReduceDemoWithIdentityAndAccumulator {

    public static void main(String[] args) {

        int[] array = { 23, 43, 56, 97, 32 };
        // Set start value. Result will be start value + sum of array.
        int startValue = 100;
        int sum = Arrays.stream(array).reduce(startValue, (x, y) -> x + y);
        System.out.println(sum);
        sum = Arrays.stream(array).reduce(startValue, Integer::sum);
        System.out.println(sum);
        sum = Arrays.stream(array).reduce(startValue, StatisticsUtility::addIntData);
        System.out.println(sum);
    }
}
