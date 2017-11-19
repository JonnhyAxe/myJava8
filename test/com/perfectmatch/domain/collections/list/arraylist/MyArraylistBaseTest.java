package com.perfectmatch.domain.collections.list.arraylist;

import java.util.List;

import org.junit.Before;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.collections.MusicCollectionsCommon;

/**
 * Base class to reuse Commons data structures
 *
 * ArrayList accept null values and are added to end of the list (array in the
 * case of the ArrayList implementation)
 *
 * Get/Set are BigO(1)
 *
 * Add/Remove are BigO(n) in the worst case scenario
 */
public class MyArraylistBaseTest {

    protected List<Music> list;

    @Before
    public void setUp() {

        list = MusicCollectionsCommon.geBobCollection();
    }

}
