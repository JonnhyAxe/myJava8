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
package com.perfectmatch.domain.util._02_distinct;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;

/**
 * <class description>
 *
 */
public class DistinctByProperty {

    private static final String BOB_MARLEY = "Bob Marley";

    public static void main(String[] args) {

        List<Music> list1 = new ArrayList<>();

        list1.add(new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE));
        list1.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));
        list1.add(new Music(BOB_MARLEY, "One Love", MusicStyle.HOUSE));
        list1.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));

        list1.stream().filter(distinctByKey(b -> b.getMusicName())).peek(m -> System.out.println(m))
                .forEach(b -> System.out.println(b.getArtist() + "," + b.getMusicName()));
    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {

        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

}
