package com.perfectmatch.domain.collections.list.arraylist;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;
import com.perfectmatch.domain.collections.MusicCollectionsCommon;

/**
 * My List Wrapper Test Suite
 *
 * BigO(n) in the worst case scenario to find the specific Object
 *
 * Accept null, Object and any type object to contains without throwing Exception
 *
 * Calls Music.equals() to find the specific element
 *
 */
public class MyArraylistContainsMusicTest extends MyArraylistBaseTest {

    /**
     *
     */
    private static final String LIST_DOES_NOT_HAVE = "List does not have ";

    @Test
    public void ArrayListOfMusicContains() {

        // Given
        Music bob = new Music(MusicCollectionsCommon.BOB_MARLEY, MusicCollectionsCommon.NO_WOMAN_NO_CRY, MusicStyle.HOUSE);

        // When
        // O(n) should traverse all the list in the case scenario
        // calls Music.equals
        boolean contiansNoWomanNoCry = list.contains(bob);

        // Then
        assertTrue(LIST_DOES_NOT_HAVE + MusicCollectionsCommon.NO_WOMAN_NO_CRY, contiansNoWomanNoCry);
    }


    @Test
    public void ArrayListOfMusicDoNotHaveObjectAndDoNotThrowClassCast() {

        // Given
        Object bob = new Object();

        // When
        boolean contiansBobObject = list.contains(bob);

        // Then - do not throw ClassCastException
        assertFalse(contiansBobObject);
    }

    @Test
    public void ArrayListOfMusicDoNotHaveStringAndDoNotThrowClassCast() {

        // Given

        // When
        boolean contiansBobMarley = list.contains(MusicCollectionsCommon.BOB_MARLEY);

        // Then - do not throw ClassCastException
        assertFalse(contiansBobMarley);
    }

    @Test
    public void ArrayListOfMusicDoNotHaveNull() {

        // Given

        // When
        boolean contiansBobMarley = list.contains(null);

        // Then - do not throw NullPointerException
        assertFalse(contiansBobMarley);
    }

}
