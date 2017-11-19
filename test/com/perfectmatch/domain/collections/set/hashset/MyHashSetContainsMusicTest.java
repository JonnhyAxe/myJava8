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
    public void ArrayListOfMusicContains() {

        // Given
        Music bob = new Music(MusicCollectionsCommon.BOB_MARLEY, MusicCollectionsCommon.NO_WOMAN_NO_CRY, MusicStyle.HOUSE);

        // When
        // O(1) because it uses the hash
        // calls Music.equals
        boolean contiansNoWomanNoCry = set.contains(bob);

        // Then
        assertTrue(LIST_DOES_NOT_HAVE + MusicCollectionsCommon.NO_WOMAN_NO_CRY, contiansNoWomanNoCry);
    }

    @Test
    public void ArrayListOfMusicDoNotHaveObjectAndDoNotThrowClassCast() {

        // Given
        Object bob = new Object();

        // When
        boolean contiansBobObject = set.contains(bob);

        // Then - do not throw ClassCastException
        assertTrue(contiansBobObject == false);
    }

    @Test
    public void ArrayListOfMusicDoNotHaveStringAndDoNotThrowClassCast() {

        // Given

        // When
        boolean contiansBobMarley = set.contains(MusicCollectionsCommon.BOB_MARLEY);

        // Then - do not throw ClassCastException
        assertFalse(contiansBobMarley);
    }

    @Test
    public void ArrayListOfMusicDoNotHaveNull() {

        // Given

        // When
        boolean contiansBobMarley = set.contains(null);

        // Then - do not throw NullPointerException
        assertFalse(contiansBobMarley);
    }

}
