package com.perfectmatch.domain.collections.list.arraylist;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;

/**
 * <class description>
 *
 */
public class MyArraylistAddByIndexMusicTest extends MyArraylistBaseTest {


    final String ONE_LOVE = "One Love";

    final String REDEMPTION_SONG = "Redemption Song";

    final String NO_WOMAN_NO_CRY = "No Woman No Cry";

    final String BOB_MARLEY = "Bob Marley";

    /**
    *
    */
    final Music MUSIC_3 = new Music(BOB_MARLEY, ONE_LOVE, MusicStyle.HOUSE);

    /**
    *
    */
    final Music MUSIC_2 = new Music(BOB_MARLEY, REDEMPTION_SONG, MusicStyle.HOUSE);

    /**
    *
    */
    final Music MUSIC_1 = new Music(BOB_MARLEY, NO_WOMAN_NO_CRY, MusicStyle.HOUSE);

    @Test
    public void addMusicByIndex() {

        // Given

        List<Music> myList = new ArrayList<>(3);

        // When
        myList.add(0, MUSIC_1);
        myList.add(1, MUSIC_2);
        myList.add(2, MUSIC_3);

        // Then
        assertEquals(MUSIC_1, myList.get(0));
        assertEquals(MUSIC_2, myList.get(1));
        assertEquals(MUSIC_3, myList.get(2));

    }

    @Test
    public void addMusicByIndexIncreasingCapacity() {

        // Given

        List<Music> myList = new ArrayList<>(2);

        // When
        myList.add(0, MUSIC_1);
        myList.add(1, MUSIC_2);
        myList.add(2, MUSIC_3);

        // Then
        assertEquals(MUSIC_1, myList.get(0));
        assertEquals(MUSIC_2, myList.get(1));
        assertEquals(MUSIC_3, myList.get(2));

    }
}
