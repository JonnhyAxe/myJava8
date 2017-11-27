package com.perfectmatch.domain.collections.list.copyOnWriteArrayList;

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
 * CopyOnWrire use ReentrantLock lock and arrayCopy to create a new fresh array
 * to each write operation (overloaded add. remove, set)
 *
 */
public class MyArraylistAddMusicTest extends MyCopyOnArrayListBaseTest {


    /**
     *
     */
    private static final String BOB_MUSIC_INSTANCE_SHOULD_BE_EQUAL = "Bob Music instance SHOULD be equal";

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
    public void ArrayListOfMusicAddsNewMusicAtTheEnd() {

        // Given
        Music bob = new Music(MusicCollectionsCommon.BOB_MARLEY, MusicCollectionsCommon.NO_WOMAN_NO_CRY, MusicStyle.HOUSE);

        // When
        boolean addedBob = list.add(bob);
        Music addedBobMusic = list.get(list.size() - 1);

        // Then
        assertTrue(THE_ELEMENT_SHOULD_BE_ADDED_TO_THE_LIST, addedBob);
        assertTrue(BOB_MUSIC_INSTANCE_SHOULD_BE_EQUAL, bob.equals(addedBobMusic));
    }

    @Test
    public void ArrayListOfMusicAddsNewMusicAtSpecificposition() {

        // Given
        Music bob = new Music(MusicCollectionsCommon.BOB_MARLEY, MusicCollectionsCommon.NO_WOMAN_NO_CRY, MusicStyle.HOUSE);

        // When
        list.add(0, bob);
        Music addedBobMusic = list.get(0);

        // Then
        assertTrue(BOB_MUSIC_INSTANCE_SHOULD_BE_EQUAL, bob.equals(addedBobMusic));
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
