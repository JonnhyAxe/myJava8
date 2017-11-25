package com.perfectmatch.domain.collections.list.linkedlist;

import java.util.List;

import org.junit.Before;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.collections.MusicCollectionsCommon;

/**
 * Base class to reuse Commons data structures
 *
 * LinkedList accept null values and are added to end of the list
 *
 * add/remove first/last are BigO(1)
 *
 * contains/remove is BigO(n)
 *
 * Get/Set are BigO(n) in the worst case scenario
 */
public class MyLinkedListBaseTest {

    protected List<Music> list;

    @Before
    public void setUp() {

        list = MusicCollectionsCommon.geBobLinkedList();
    }

}
