package com.perfectmatch.domain.collections.arraylist;

import java.util.List;

import org.junit.Before;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.collections.MusicCollectionsCommon;

/**
 * Base class to reuse Commons data structures
 *
 */
public class MyArraylistBaseTest {

    protected List<Music> list;

    @Before
    public void setUp() {

        list = MusicCollectionsCommon.geBobCollection();
    }

}
