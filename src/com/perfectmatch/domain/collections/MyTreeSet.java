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

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;

/**
 * <class description>
 *
 */
public class MyTreeSet {

    private static final String BOB_MARLEY = "Bob Marley";

    public static void main(String[] args) {

        Set<Music> setOfMusics = new TreeSet<>();
        Music bob = new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE);

        // uses the comparator (default if used the constructor with comparator)
        // or the object Comparable (natural order of the object) to determine
        // the order
        setOfMusics.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));
        setOfMusics.add(new Music(BOB_MARLEY, "One Love", MusicStyle.HOUSE));
        setOfMusics.add(new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE));

        boolean bool = setOfMusics.contains(bob);

        Iterator<Music> it = setOfMusics.iterator();

        // ListIterator<Music> listIt = setOfMusics.listIterator();

    }

}
