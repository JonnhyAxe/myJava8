package com.perfectmatch.domain.collections.arraylist;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;
import com.perfectmatch.domain.collections.MusicCollectionsCommon;

/**
 * My List Wrapper Test Suite
 *
 */
public class MyListWrapperContainsMusicTest {


    /**
     *
     */
    private static final String LIST_DOES_NOT_HAVE = "List does not have ";

    private List<Music> list;

    @Before
    public void setUp() {

        list = new ArrayList<Music>(0);
    }

    @Test
    public void ArrayListOfMusicContains() {

        // Given
        list = MusicCollectionsCommon.geBobCollection();

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
        list = MusicCollectionsCommon.geBobCollection();

        Object bob = new Object();

        // When
        boolean contiansBobObject = list.contains(bob);

        // Then - do not throw ClassCastException
        assertTrue(contiansBobObject == false);
    }

    @Test
    public void ArrayListOfMusicDoNotHaveStringAndDoNotThrowClassCast() {

        // Given
        list = MusicCollectionsCommon.geBobCollection();

        // When
        boolean contiansBobMarley = list.contains(MusicCollectionsCommon.BOB_MARLEY);

        // Then - do not throw ClassCastException
        assertTrue(contiansBobMarley == false);
    }

    @Test
    public void ArrayListOfMusicDoNotHaveNull() {

        // Given
        list = MusicCollectionsCommon.geBobCollection();

        // When
        boolean contiansBobMarley = list.contains(null);

        // Then - do not throw NullPointerException
        assertTrue(contiansBobMarley == false);
    }

}
