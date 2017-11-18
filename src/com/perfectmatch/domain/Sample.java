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
 * <class description>
 *
 */
public class Sample {

    // Same as the name
    private String id;

    private MusicStyle style;

    /**
     * @param id
     * @param style
     */
    public Sample(String id, MusicStyle style) {
        super();
        this.id = id;
        this.style = style;
    }

    /**
     * @return the id
     */
    public String getId() {

        return id;
    }


    /**
     * @return the style
     */
    public MusicStyle getStyle() {

        return style;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        return "Sample [id=" + id + ", style=" + style + "]";
    }
}
