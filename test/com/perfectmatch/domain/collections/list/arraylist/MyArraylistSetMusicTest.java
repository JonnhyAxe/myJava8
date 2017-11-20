package com.perfectmatch.domain.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;

/**
 * <class description>
 *
 */
public class MyArraylistSetMusicTest extends MyArraylistBaseTest {


    final String NO_WOMAN_NO_CRY = "No Woman No Cry";

    final String BOB_MARLEY = "Bob Marley";

    /**
    *
    */
    final Music MUSIC_1 = new Music(BOB_MARLEY, NO_WOMAN_NO_CRY, MusicStyle.HOUSE);

    @Test(expected = IndexOutOfBoundsException.class)
    public void setMusicByIndex() {

        // Given

        List<Music> myList = new ArrayList<>(3);

        // When
        myList.set(0, MUSIC_1);

        // Then


    }
}
