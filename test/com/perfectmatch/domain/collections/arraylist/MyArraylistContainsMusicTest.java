package com.perfectmatch.domain.collections.arraylist;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
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
public class MyArraylistContainsMusicTest {


    /**
     *
     */
    private static final String LIST_DOES_NOT_HAVE = "List does not have ";

    private List<Music> list;

    @Before
    public void setUp() {

        list = MusicCollectionsCommon.geBobCollection();
    }

    @Test
    public void ArrayListOfMusicContains() {

        // Given
        Music bob = new Music(MusicCollectionsCommon.BOB_MARLEY, MusicCollectionsCommon.NO_WOMAN_NO_CRY, MusicStyle.HOUSE);

        // When
        // O(n) should traverse all the list in the case scenario
        // calls Music.equals
        boolean contiansNoWomanNoCry = list.contains(bob);

        // Then
        assertTrue(LIST_DOES_NOT_HAVE + MusicCollectionsCommon.NO_WOMAN_NO_CRY, contiansNoWomanNoCry == true);
    }


    @Test
    public void ArrayListOfMusicDoNotHaveObjectAndDoNotThrowClassCast() {

        // Given
        Object bob = new Object();

        // When
        boolean contiansBobObject = list.contains(bob);

        // Then - do not throw ClassCastException
        assertTrue(contiansBobObject == false);
    }

    @Test
    public void ArrayListOfMusicDoNotHaveStringAndDoNotThrowClassCast() {

        // Given

        // When
        boolean contiansBobMarley = list.contains(MusicCollectionsCommon.BOB_MARLEY);

        // Then - do not throw ClassCastException
        assertTrue(contiansBobMarley == false);
    }

    @Test
    public void ArrayListOfMusicDoNotHaveNull() {

        // Given

        // When
        boolean contiansBobMarley = list.contains(null);

        // Then - do not throw NullPointerException
        assertTrue(contiansBobMarley == false);
    }

}
