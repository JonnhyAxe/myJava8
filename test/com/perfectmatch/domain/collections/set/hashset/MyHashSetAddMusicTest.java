package com.perfectmatch.domain.collections.set.hashset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;
import com.perfectmatch.domain.collections.MusicCollectionsCommon;

/**
 * My HashSet AddMusicTest
 *
 * add() hash BigO(1) and calls hash() implementation of the key
 *
 * add() accepts null element
 *
 */
public class MyHashSetAddMusicTest extends MyHashsetBaseTest {

    /**
     *
     */
    private static final String THE_ELEMENT_SHOULD_NOT_BE_ADDED_TO_THE_LIST = "The element should NOT be added to the list";

    /**
    *
    */
    private static final String THE_ELEMENT_SHOULD_BE_ADDED_TO_THE_LIST = "The element should be added to the list";

    @Test
    public void HashSetOfMusicAddsNewMusic() {

        // Given
        Music bob = new Music(MusicCollectionsCommon.BOB_MARLEY, MusicCollectionsCommon.NO_WOMAN_NO_CRY, MusicStyle.HOUSE);
        int size = set.size();

        // When
        boolean addedBob = set.add(bob); // call hash() to determine if the
                                         // element exists

        // Then
        assertFalse(THE_ELEMENT_SHOULD_NOT_BE_ADDED_TO_THE_LIST, addedBob);
        assertEquals(size, set.size());
    }

    @Test
    public void HasSetOfMusicAddsNullMusic() {

        // Given

        // When
        boolean addedBob = set.add(null);

        // Then
        assertTrue(THE_ELEMENT_SHOULD_BE_ADDED_TO_THE_LIST, addedBob);
    }

}
