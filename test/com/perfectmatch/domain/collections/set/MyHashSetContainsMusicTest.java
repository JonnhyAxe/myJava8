package com.perfectmatch.domain.collections.set;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.perfectmatch.domain.collections.MusicCollectionsCommon;

/**
 * HashSet contains() has BigO(1) because it uses the hash code of the object to
 * find the specific entry
 *
 */
public class MyHashSetContainsMusicTest extends MyHashSetBaseTest {


    @Test
    public void containsMusic1() {

        // Given


        // When
        boolean containsMusic = set.contains(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY);


        // Then
        assertTrue("The structure should have " + MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY.getArtist(), containsMusic);

    }

}
