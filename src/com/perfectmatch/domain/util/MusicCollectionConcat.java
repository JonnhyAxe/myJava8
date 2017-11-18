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
package com.perfectmatch.domain.util;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <class description>
 *
 */
public class MusicCollectionConcat {


    public static <T> Set<T> concat(Set<T> samples1, Set<T> samples2) {

        return Stream.concat(samples1.stream(), samples2.stream()).collect(Collectors.toSet());


    }

}
