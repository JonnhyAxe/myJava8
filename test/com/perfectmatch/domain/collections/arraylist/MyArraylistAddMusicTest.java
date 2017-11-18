package com.perfectmatch.domain.collections.arraylist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;
import com.perfectmatch.domain.collections.MusicCollectionsCommon;

/**
 * MyArraylistAddMusicTest
 *
 * The add method has BigO(n) in the worst case scenario because when the
 * increasing the internal array capacity necessary
 *
 */
public class MyArraylistAddMusicTest extends MyArraylistBaseTest {


    /**
     *
     */
    private static final String THE_ELEMENT_SHOULD_BE_ADDED_TO_THE_LIST = "The element should be added to the list";

    @Test
    public void ArrayListOfMusicAddsNewMusic() {

        // Given
        Music bob = new Music(MusicCollectionsCommon.BOB_MARLEY, MusicCollectionsCommon.NO_WOMAN_NO_CRY, MusicStyle.HOUSE);
        int size = list.size();

        // When
        boolean addedBob = list.add(bob);

        // Then
        assertTrue(THE_ELEMENT_SHOULD_BE_ADDED_TO_THE_LIST, addedBob);
        assertEquals(size + 1, list.size());
    }


    @Test
    public void ArrayListOfMusicAddsNullMusic() {

        // Given
        int size = list.size();

        // When
        boolean addedBob = list.add(null);

        // Then
        assertTrue(THE_ELEMENT_SHOULD_BE_ADDED_TO_THE_LIST, addedBob);
        assertEquals(size + 1, list.size());
    }

}
