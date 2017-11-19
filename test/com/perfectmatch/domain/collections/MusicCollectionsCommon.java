package com.perfectmatch.domain.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;

/**
 * Music Collections Common
 */
public final class MusicCollectionsCommon {


    /**
     *
     */
    public static final String NO_WOMAN_NO_CRY = "No Woman No Cry";
    public static final String BOB_MARLEY = "Bob Marley";

    /**
     *
     */
    private static final Music MUSIC_3 = new Music(BOB_MARLEY, "One Love", MusicStyle.HOUSE);

    /**
     *
     */
    private static final Music MUSIC_2 = new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE);

    /**
     *
     */
    private static final Music MUSIC_1 = new Music(BOB_MARLEY, NO_WOMAN_NO_CRY, MusicStyle.HOUSE);

    public static List<Music> geBobCollection() {

        List<Music> listOfMusics = new ArrayList<>();

        listOfMusics.add(MUSIC_1);
        listOfMusics.add(MUSIC_2);
        listOfMusics.add(MUSIC_3);

        // boolean bool = listOfMusics.contains(bob);
        //
        // Iterator<Music> it = listOfMusics.iterator();
        //
        // ListIterator<Music> listIt = listOfMusics.listIterator();
        //
        // it = bobMusic.iterator();
        //
        // bobMusic.contains(bob);
        return listOfMusics;
    }

    public static Set<Music> geBobHashSetCollection() {

        Set<Music> setOfMusics = new HashSet<>();

        setOfMusics.add(MUSIC_1);
        setOfMusics.add(MUSIC_2);
        setOfMusics.add(MUSIC_3);

        return setOfMusics;
    }

}
