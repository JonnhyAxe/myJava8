package com.perfectmatch.domain.collections;

import java.util.ArrayList;
import java.util.List;

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

    public static List<Music> geBobCollection() {

        List<Music> listOfMusics = new ArrayList<>();

        listOfMusics.add(new Music(BOB_MARLEY, NO_WOMAN_NO_CRY, MusicStyle.HOUSE));
        listOfMusics.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));
        listOfMusics.add(new Music(BOB_MARLEY, "One Love", MusicStyle.HOUSE));

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

}
