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
package com.perfectmatch.domain.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;

/**
 *
 */
public class MyList {

    private static final String BOB_MARLEY = "Bob Marley";

    public static void main(String[] args) {


        List<Music> listOfMusics = new ArrayList<>();

        // support fast (generally constant time) random access
        RandomAccess random = (ArrayList<Music>) listOfMusics;

        Music bob = new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE);

        // duplicates allowed - insert at the end
        listOfMusics.add(new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE));
        listOfMusics.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));
        listOfMusics.add(new Music(BOB_MARLEY, "One Love", MusicStyle.HOUSE));

        boolean bool = listOfMusics.contains(bob); // uses equals to find the
                                                   // correct element

        Iterator<Music> it = listOfMusics.iterator();

        ListIterator<Music> listIt = listOfMusics.listIterator();

        listOfMusics.equals(null); // order of the element is relevant and for
                                   // each element the equals is used to compare
                                   // the elements

        listOfMusics.set(0, bob);

    }

}

