package com.perfectmatch.domain.collections.set.enumSet;

import static org.junit.Assert.assertEquals;

import java.util.EnumSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.perfectmatch.domain.BobAlbum;

/**
 * My EnumSet Add Music Test
 *
 */
public class MyEnumSetAddMusicTest extends MyEnumsetBaseTest {

    /**
    *
    */
    private static final String THE_ELEMENT_SHOULD_NOT_BE_ADDED_TO_THE_LIST = "The element should NOT be added to the list";

    /**
    *
    */
    private static final String THE_ELEMENT_SHOULD_BE_ADDED_TO_THE_LIST = "The element should be added to the list";

    @Test
    public void shouldAddOneLoveMusic() {

        // When
        boolean addedBob = set.add(BobAlbum.MUSIC_ONE_LOVE); // uses the  ordinal of the enum

        // Then
        Assert.assertTrue(THE_ELEMENT_SHOULD_BE_ADDED_TO_THE_LIST, addedBob);
        assertEquals(1, set.size());
    }

    @Test
    public void shouldNotBeAddOneLoveMusic() {

        Set<BobAlbum> album = EnumSet.allOf(BobAlbum.class);
        int expectedize = album.size();

        // When
        boolean addedBob = album.add(BobAlbum.MUSIC_ONE_LOVE); // uses the
                                                               // ordinal of the
                                                               // enum

        // Then
        Assert.assertFalse(THE_ELEMENT_SHOULD_NOT_BE_ADDED_TO_THE_LIST, addedBob);
        assertEquals(expectedize, album.size());
    }

}
