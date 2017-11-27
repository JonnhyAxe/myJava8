package com.perfectmatch.domain.collections.set.enumSet;

import java.util.Set;

import org.junit.Before;

import com.perfectmatch.domain.BobAlbum;
import com.perfectmatch.domain.collections.MusicCollectionsCommon;

/**
 * Base class to reuse Commons data structures
 *
 * Set do not accept null values
 *
 * add/remove/contains are BigO(1)
 *
 *
 *
 */
public class MyEnumsetBaseTest {

    protected Set<BobAlbum> set;

    @Before
    public void setUp() {

        set = MusicCollectionsCommon.geBobEmptyEnumSetCollection();
    }


}
