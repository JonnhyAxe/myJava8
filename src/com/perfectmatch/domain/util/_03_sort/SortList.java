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
package com.perfectmatch.domain.util._03_sort;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;
public class SortList {

    private static final String BOB_MARLEY = "Bob Marley";

    public static void main(String[] args) {

        List<Music> list = new ArrayList<>();

        list.add(new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE));
        list.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));
        list.add(new Music(BOB_MARLEY, "One Love", MusicStyle.TECH_HOUSE));

        // Sorted by

        System.out.println("---Natural Sorting by Name---");
        List<Music> slist = list.stream().sorted().collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Name:" + e.getArtist() + ", Musin Name: " + e.getMusicName() + ", Style:" + e.getStyle().name()));

        System.out.println("---Natural Sorting by Name in reverse order---");
        slist = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Name:" + e.getArtist() + ", Musin Name: " + e.getMusicName() + ", Style:" + e.getStyle().name()));

        System.out.println("---Sorting using Comparator by Music Name---");
        slist = list.stream().sorted(Comparator.comparing(Music::getMusicName)).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Name:" + e.getArtist() + ", Musin Name: " + e.getMusicName() + ", Style:" + e.getStyle().name()));

        System.out.println("---Sorting using Comparator by Style with reverse order---");
        slist = list.stream().sorted(Comparator.comparing(Music::getStyle).reversed()).collect(Collectors.toList());
        slist.forEach(e -> System.out.println("Name:" + e.getArtist() + ", Musin Name: " + e.getMusicName() + ", Style:" + e.getStyle().name()));
    }
}
