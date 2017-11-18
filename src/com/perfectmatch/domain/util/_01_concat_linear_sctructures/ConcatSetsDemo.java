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
package com.perfectmatch.domain.util._01_concat_linear_sctructures;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;

/**
 * <class description>
 *
 */
public class ConcatSetsDemo {

    private static final String BOB_MARLEY = "Bob Marley";

    public static void main(String[] args) {

        Set<Music> set1 = new HashSet<>();
        Set<Music> set2 = new HashSet<>();

        Music music = new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE);
        System.out.println(music.hashCode());

        set1.add(music);
        set1.add(new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE));
        set1.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));
        set1.add(new Music(BOB_MARLEY, "One Love", MusicStyle.HOUSE));

        Music music2 = new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE);
        System.out.println(music2.hashCode());

        set2.add(music2);
        set2.add(new Music(BOB_MARLEY, "Is This Love", MusicStyle.HOUSE));
        set2.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));


        Set<Music> set = Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());
        set.forEach(b -> System.out.println(b.getArtist() + ", " + b.getMusicName() + ", " + b.hashCode()));
    }
}
