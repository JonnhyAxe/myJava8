/*
 * Copyright 2017 by Brisa Inovação e Tecnologia S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Brisa, SA ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with Brisa.
 */
package com.perfectmatch.domain;


/**
 * Bob Album Enum
 *
 */
public enum BobAlbum {

    NO_WOMAN_NO_CRY(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY), MUSIC_REDMPTION_SONG(MusicCollectionsCommon.MUSIC_REDMPTION_SONG), MUSIC_ONE_LOVE(
            MusicCollectionsCommon.MUSIC_ONE_LOVE);

    BobAlbum(Music music) {
        this.music = music;
    }

    private Music music;

    /**
     * @return the music
     */
    public Music getMusic() {

        return music;
    }

}
