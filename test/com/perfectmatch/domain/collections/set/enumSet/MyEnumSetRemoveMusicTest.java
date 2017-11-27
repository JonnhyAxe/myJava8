package com.perfectmatch.domain.collections.set.enumSet;

import static org.junit.Assert.assertEquals;

import java.util.EnumSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.perfectmatch.domain.BobAlbum;

/**
 * MyEnumSetRemoveMusicTest
 *
 */
public class MyEnumSetRemoveMusicTest extends MyEnumsetBaseTest {

    /**
    *
    */
    private static final String THE_ELEMENT_SHOULD_BE_REMOVED_TO_THE_LIST = "The element should be removed to the list";


    @Test
    public void shouldRemoveOneLoveMusic() {

        Set<BobAlbum> album = EnumSet.allOf(BobAlbum.class);
        int expectedize = album.size() - 1;

        // When
        boolean addedBob = album.remove(BobAlbum.MUSIC_ONE_LOVE);


        // Then
        Assert.assertTrue(THE_ELEMENT_SHOULD_BE_REMOVED_TO_THE_LIST, addedBob);
        assertEquals(expectedize, album.size());
    }

}
