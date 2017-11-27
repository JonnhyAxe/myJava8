package com.perfectmatch.domain.collections.set.enumSet;

import java.util.EnumSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.perfectmatch.domain.BobAlbum;

/**
 * <class description>
 *
 */
public class MyEnumSetContainsMusicTest extends MyEnumsetBaseTest {

    /**
    *
    */
    private static final String THE_LIST_SHOULD_CONTAINS = "The list should contains ";

    @Test
    public void shouldContainsOneLoveMusic() {

        Set<BobAlbum> album = EnumSet.allOf(BobAlbum.class);

        // When
        boolean addedBob = album.contains(BobAlbum.MUSIC_ONE_LOVE);

        // Then
        Assert.assertTrue(THE_LIST_SHOULD_CONTAINS + BobAlbum.MUSIC_ONE_LOVE.getMusic().getMusicName(), addedBob);
    }
}
