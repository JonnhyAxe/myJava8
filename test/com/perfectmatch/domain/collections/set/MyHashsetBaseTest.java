package com.perfectmatch.domain.collections.set;

import java.util.Set;

import org.junit.Before;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.collections.MusicCollectionsCommon;

/**
 * Base class to reuse Commons data structures
 *
 * Set do not accept null values
 *
 */
public class MyHashsetBaseTest {

    protected Set<Music> set;

    @Before
    public void setUp() {

        set = MusicCollectionsCommon.geBobHashSetCollection();
    }

}
