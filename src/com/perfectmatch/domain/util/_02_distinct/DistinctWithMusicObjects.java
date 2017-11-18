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

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;

/**
 * <class description>
 *
 */
public class DistinctWithMusicObjects {

    private static final String BOB_MARLEY = "Bob Marley";

    public static void main(String[] args) {

        List<Music> list1 = new ArrayList<>();

        list1.add(new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE));
        list1.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));
        list1.add(new Music(BOB_MARLEY, "One Love", MusicStyle.HOUSE));
        list1.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));

        long l = list1.stream().distinct().count();
        System.out.println("No. of distinct Musics:" + l);
        list1.stream().distinct().forEach(b -> System.out.println(b.getArtist() + "," + b.getMusicName()));
    }

}
