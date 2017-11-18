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

import java.util.function.IntFunction;
import java.util.stream.Stream;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;

/**
 * <class description>
 *
 */
public class ConcatArraysDemo {

    private static final String BOB_MARLEY = "Bob Marley";

    public static void main(String[] args) {

        Music[] bk1 = new Music[3];
        Music[] bk2 = new Music[3];

        bk1[0] = new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE);
        bk1[1] = new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE);
        bk1[2] = new Music(BOB_MARLEY, "One Love", MusicStyle.HOUSE);

        bk2[0] = new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE);
        bk2[1] = new Music(BOB_MARLEY, "Is This Love", MusicStyle.HOUSE);
        bk2[2] = new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE);

        System.out.println(bk1[0].hashCode());

        IntFunction<Music[]> toMusicArray = (book) -> new Music[book];
        Music[] bks = Stream.concat(Stream.of(bk1), Stream.of(bk2)).toArray(toMusicArray);
        for (Music b : bks) {
            System.out.println(b.getArtist() + ", " + b.getMusicName() + ", " + b.hashCode());
        }

        // Remove duplicates using distinct()
        System.out.println("--Remove duplicates using distinct()--");
        bks = Stream.concat(Stream.of(bk1), Stream.of(bk2)).distinct().toArray(b -> new Music[b]);
        for (Music b : bks) {
            System.out.println(b.getArtist() + ", " + b.getMusicName() + ", " + b.hashCode());
        }
    }

}
