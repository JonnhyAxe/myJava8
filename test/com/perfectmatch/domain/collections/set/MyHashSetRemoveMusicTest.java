package com.perfectmatch.domain.collections.set;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.perfectmatch.domain.collections.MusicCollectionsCommon;
import com.perfectmatch.domain.collections.set.hashset.MyHashsetBaseTest;

/**
 * HashSet contains() has BigO(1) because it uses the hash code of the object to
 * find the specific entry
 *
 */
public class MyHashSetRemoveMusicTest extends MyHashsetBaseTest {

    /**
     *
     */
    private static final String SHOULD_HAVE_MUSIC = "Should have music ";

    /**
     *
     */
    private static final String COLLECTION_SHOULD_HAVE_SIZE_OF = "Collection should have size of ";

    @Test
    public void removeNoWomanNoCry() {

        // Given
        int initialSize = set.size();

        // When

        boolean containsNoWomanResult = set.contains(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY);
        boolean removeNoWomanResult = set.remove(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY);
        int index = set.size() - 1;
        int index2 = index & MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY.hashCode();
        // Then
        assertTrue(COLLECTION_SHOULD_HAVE_SIZE_OF + (initialSize - 1), containsNoWomanResult);
        assertTrue(SHOULD_HAVE_MUSIC + MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY.getMusicName(), removeNoWomanResult);
    }

}
