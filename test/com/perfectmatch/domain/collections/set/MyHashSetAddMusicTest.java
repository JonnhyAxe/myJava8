package com.perfectmatch.domain.collections.set;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.collections.MusicCollectionsCommon;

/**
 * The add() of the HashSet hash BigO(1) complexity because it uses hash code to
 * insert the element
 *
 */
public class MyHashSetAddMusicTest {

    /**
     *
     */
    private static final String SET_SHOULD_CONTAIN = "Set Should contain ";

    private Set<Music> set;

    @Before
    public void setUp() {

        set = new HashSet<>();
    }


    @Test
    public void addMusic() {

        // Given


        // When
        set.add(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY);
        set.add(MusicCollectionsCommon.MUSIC_REDMPTION_SONG);
        set.add(MusicCollectionsCommon.MUSIC_ONE_LOVE);

        // Then
        assertTrue(SET_SHOULD_CONTAIN + MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY.getMusicName(), set.contains(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY));
        assertTrue(SET_SHOULD_CONTAIN + MusicCollectionsCommon.MUSIC_REDMPTION_SONG.getMusicName(), set.contains(MusicCollectionsCommon.MUSIC_REDMPTION_SONG));
        assertTrue(SET_SHOULD_CONTAIN + MusicCollectionsCommon.MUSIC_ONE_LOVE.getMusicName(), set.contains(MusicCollectionsCommon.MUSIC_ONE_LOVE));
        assertTrue(set.size() == 3);


    }

    @Test
    public void getMusicByHash() {

        // Given

        // When
        set.add(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY);
        set.add(MusicCollectionsCommon.MUSIC_REDMPTION_SONG);
        set.add(MusicCollectionsCommon.MUSIC_ONE_LOVE);

        // TODO: add implementation relies on this particular expression to add
        // the element in the hash structure
        int i0 = 0 - 1 & MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY.hashCode();
        int i1 = 1 - 1 & MusicCollectionsCommon.MUSIC_REDMPTION_SONG.hashCode();
        int i2 = 2 - 1 & MusicCollectionsCommon.MUSIC_ONE_LOVE.hashCode();

        Music noWomanNoCry = set.stream().filter(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY::equals).findAny().orElse(null);
        Music[] list = set.toArray(new Music[] {}); // is this ordered by the
                                                    // insertion


        // Then
        assertTrue(set.size() == 3);

        assertTrue(set.contains(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY));

        assertTrue(Objects.nonNull(noWomanNoCry) ? noWomanNoCry.equals(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY) : false);

    }


}
