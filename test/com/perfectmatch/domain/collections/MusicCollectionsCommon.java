package com.perfectmatch.domain.collections;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import com.perfectmatch.domain.BobAlbum;
import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;

/**
 * Music Collections Common
 */
public final class MusicCollectionsCommon {


    /**
     *
     */
    private static final String ONE_LOVE = "One Love";

    /**
     *
     */
    private static final String REDEMPTION_SONG = "Redemption Song";
    /**
     *
     */
    public static final String NO_WOMAN_NO_CRY = "No Woman No Cry";

    /**
    *
    */
    public static final String BOB_MARLEY = "Bob Marley";

    /**
     *
     */
    public static final Music MUSIC_ONE_LOVE = new Music(BOB_MARLEY, ONE_LOVE, MusicStyle.HOUSE);

    /**
     *
     */
    public static final Music MUSIC_REDMPTION_SONG = new Music(BOB_MARLEY, REDEMPTION_SONG, MusicStyle.HOUSE);

    /**
     *
     */
    public static final Music MUSIC_NO_WOMAN_NO_CRY = new Music(BOB_MARLEY, NO_WOMAN_NO_CRY, MusicStyle.HOUSE);

    public static List<Music> geBobArrayList() {

        List<Music> listOfMusics = new ArrayList<>();

        listOfMusics.add(MUSIC_NO_WOMAN_NO_CRY);
        listOfMusics.add(MUSIC_REDMPTION_SONG);
        listOfMusics.add(MUSIC_ONE_LOVE);

        return listOfMusics;
    }

    public static List<Music> geBobCopyOnArrayList() {

        List<Music> listOfMusics = new CopyOnWriteArrayList<>();

        listOfMusics.add(MUSIC_NO_WOMAN_NO_CRY);
        listOfMusics.add(MUSIC_REDMPTION_SONG);
        listOfMusics.add(MUSIC_ONE_LOVE);

        return listOfMusics;
    }

    public static List<Music> geBobLinkedList() {

        List<Music> listOfMusics = new LinkedList<>();

        listOfMusics.add(MUSIC_NO_WOMAN_NO_CRY);
        listOfMusics.add(MUSIC_REDMPTION_SONG);
        listOfMusics.add(MUSIC_ONE_LOVE);

        return listOfMusics;
    }

    public static Set<Music> geBobHashSetCollection() {

        Set<Music> setOfMusics = new HashSet<>();

        setOfMusics.add(MUSIC_NO_WOMAN_NO_CRY);
        setOfMusics.add(MUSIC_REDMPTION_SONG);
        setOfMusics.add(MUSIC_ONE_LOVE);

        return setOfMusics;
    }

    public static Set<BobAlbum> geBobEmptyEnumSetCollection() {

        // EnumSupplier
        return EnumSet.noneOf(BobAlbum.class);

    }

}
