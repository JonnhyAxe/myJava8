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

import java.util.Set;

/**
 * This represents an Music that is one of the pair to have a perfect match
 *
 */
public class Music implements Comparable<Music> {

    private String artist;

    /**
     * @param artist
     * @param musicName
     * @param style
     */
    public Music(String artist, String musicName, MusicStyle style) {
        super();
        this.artist = artist;
        this.musicName = musicName;
        this.style = style;
    }

    private String musicName;

    private Set<String> remixers;

    private MusicStyle style;

    /**
     * @return the style
     */
    public MusicStyle getStyle() {

        return style;
    }

    /**
     * @param style
     *            the style to set
     */
    public void setStyle(MusicStyle style) {

        this.style = style;
    }

    /**
     * @return the artist
     */
    public String getArtist() {

        return artist;
    }

    /**
     * @param artist
     *            the artist to set
     */
    public void setArtist(String artist) {

        this.artist = artist;
    }

    /**
     * @return the musicName
     */
    public String getMusicName() {

        return musicName;
    }

    /**
     * @param musicName
     *            the musicName to set
     */
    public void setMusicName(String musicName) {

        this.musicName = musicName;
    }

    /**
     * @return the remixers
     */
    public Set<String> getRemixers() {

        return remixers;
    }

    /**
     * @param remixers
     *            the remixers to set
     */
    public void setRemixers(Set<String> remixers) {

        this.remixers = remixers;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + (artist == null ? 0 : artist.hashCode());
        result = prime * result + (musicName == null ? 0 : musicName.hashCode());
        result = prime * result + (style == null ? 0 : style.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Music other = (Music) obj;
        if (artist == null) {
            if (other.artist != null) {
                return false;
            }
        }
        else if (!artist.equals(other.artist)) {
            return false;
        }
        if (musicName == null) {
            if (other.musicName != null) {
                return false;
            }
        }
        else if (!musicName.equals(other.musicName)) {
            return false;
        }
        if (style != other.style) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        return "[" + this.artist + ", " + this.musicName + ", " + style.name() + "]";
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Music o) {

        return this.artist.compareToIgnoreCase(o.getArtist()) + this.musicName.compareToIgnoreCase(o.getMusicName());
    }

}
