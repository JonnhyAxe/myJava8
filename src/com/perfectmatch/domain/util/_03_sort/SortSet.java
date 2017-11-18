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


import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;
public class SortSet {

    private static final String BOB_MARLEY = "Bob Marley";

    public static void main(String[] args) {

        Set<Music> set = new HashSet<>();

        set.add(new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE));
        set.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));
        set.add(new Music(BOB_MARLEY, "One Love", MusicStyle.TECH_HOUSE));

        System.out.println("---Natural Sorting by Name---");
        set.stream().sorted().forEach(e -> System.out.println("Name:" + e.getArtist() + ", Musin Name: " + e.getMusicName() + ", Style:" + e.getStyle().name()));

        System.out.println("---Natural Sorting by Name in reverse order---");
        set.stream().sorted(Comparator.reverseOrder())
                .forEach(e -> System.out.println("Name:" + e.getArtist() + ", Musin Name: " + e.getMusicName() + ", Style:" + e.getStyle().name()));

        System.out.println("---Sorting using Comparator by Music Name---");
        set.stream().sorted(Comparator.comparing(Music::getMusicName))
                .forEach(e -> System.out.println("Name:" + e.getArtist() + ", Musin Name: " + e.getMusicName() + ", Style:" + e.getStyle().name()));

        System.out.println("---Sorting using Comparator by Style in reverse order---");
        set.stream().sorted(Comparator.comparing(Music::getStyle).reversed())
                .forEach(e -> System.out.println("Name:" + e.getArtist() + ", Musin Name: " + e.getMusicName() + ", Style:" + e.getStyle().name()));
    }
}