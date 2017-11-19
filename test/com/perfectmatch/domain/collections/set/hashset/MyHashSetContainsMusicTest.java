package com.perfectmatch.domain.collections.set.hashset;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;
import com.perfectmatch.domain.collections.MusicCollectionsCommon;

/**
 * <class description>
 *
 */
public class MyHashSetContainsMusicTest extends MyHashsetBaseTest {


    /**
    *
    */
    private static final String LIST_DOES_NOT_HAVE = "List does not have ";

    @Test
    public void HashSetOfMusicContains() {

        // Given
        Music bob = new Music(MusicCollectionsCommon.BOB_MARLEY, MusicCollectionsCommon.NO_WOMAN_NO_CRY, MusicStyle.HOUSE);

        // When
        // O(1) because it uses the hash
        // calls Music.equals
        boolean containsNoWomanNoCry = set.contains(bob);

        // Then
        assertTrue(LIST_DOES_NOT_HAVE + MusicCollectionsCommon.NO_WOMAN_NO_CRY, containsNoWomanNoCry);
    }

    @Test
    public void HashSetOfMusicDoNotHaveObjectAndDoNotThrowClassCast() {

        // Given
        Object bob = new Object();

        // When
        boolean containsBobObject = set.contains(bob);

        // Then - do not throw ClassCastException
        assertTrue(containsBobObject == false);
    }

    @Test
    public void HashSetOfMusicDoNotHaveStringAndDoNotThrowClassCast() {

        // Given

        // When
        boolean containsBobMarley = set.contains(MusicCollectionsCommon.BOB_MARLEY);

        // Then - do not throw ClassCastException
        assertFalse(containsBobMarley);
    }

    @Test
    public void HashSetOfMusicDoNotHaveNull() {

        // Given

        // When
        boolean containsBobMarley = set.contains(null);

        // Then - do not throw NullPointerException
        assertFalse(containsBobMarley);
    }

}
