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
package com.perfectmatch.domain.util._00_functional_interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;
import com.perfectmatch.domain.Sample;

/**
 * Functional interface with a method that receives one value and returns
 * another
 *
 */
public class MyFunction {

    private static final String BOB_MARLEY = "Bob Marley";

    public static void main(String[] args) {

        Function<Music, Sample> musicToSample = (music) -> new Sample(music.getMusicName(), music.getStyle());

        Function<Sample, String> sampleToString = (sample) -> sample.toString();

        List<Music> listOfMusics = new ArrayList<>();

        listOfMusics.add(new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE));
        listOfMusics.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));
        listOfMusics.add(new Music(BOB_MARLEY, "One Love", MusicStyle.HOUSE));

        listOfMusics.stream().map(musicToSample).forEach(s -> System.out.println(s.getId() + ", " + s.getStyle()));

        listOfMusics.stream().map(musicToSample).map(sampleToString).forEach(s -> System.out.println(s));

        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 40000);
        salaries.put("Freddy", 30000);
        salaries.put("Samuel", 50000);

        salaries.replaceAll((name, oldValue) -> name.equals("Freddy") ? oldValue : oldValue + 10000);

        salaries.entrySet().stream().forEach(e -> System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue()));

    }

    Function<Music, Sample> mapPersonToJob = new Function<Music, Sample>() {

        @Override
        public Sample apply(Music music) {

            return new Sample(music.getMusicName(), music.getStyle());
        }

    };
}

