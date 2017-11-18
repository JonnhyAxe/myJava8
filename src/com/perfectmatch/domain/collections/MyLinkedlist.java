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

import java.util.AbstractSequentialList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;

/**
 * <class description>
 *
 */
public class MyLinkedlist {

    private static final String BOB_MARLEY = "Bob Marley";

    public static void main(String[] args) {

        List<Music> listOfMusics = new LinkedList<>();

        // A linear collection that supports element insertion and removal at
        // both ends.
        AbstractSequentialList<Music> seqList = (LinkedList<Music>) listOfMusics;

        Music bob = new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE);

        // duplicates allowed - insert at the end
        listOfMusics.add(new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE));
        listOfMusics.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));
        listOfMusics.add(new Music(BOB_MARLEY, "One Love", MusicStyle.HOUSE));

        boolean bool = listOfMusics.contains(bob); // uses equals to find the
                                                   // correct element



        AbstractSequentialList<Music> seq = (LinkedList<Music>) listOfMusics;
        seq.get(1); // use LinkedList<>().listIterator(1) that get the element
                    // sequentially (worst case O(N))

        // A linear collection that supports element insertion and removal at
        // both ends.
        Deque<Music> musicDeq = (Deque<Music>) listOfMusics;
        musicDeq.getFirst();
        musicDeq.getLast();

        musicDeq.peekFirst();
        musicDeq.peekLast();


        Iterator<Music> it = listOfMusics.iterator();

        ListIterator<Music> listIt = listOfMusics.listIterator();

        listOfMusics.equals(null);

    }

}
