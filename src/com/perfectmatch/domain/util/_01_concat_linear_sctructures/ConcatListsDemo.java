
package com.perfectmatch.domain.util._01_concat_linear_sctructures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;

/**
 * <class description>
 */
public class ConcatListsDemo {

    /**
     *
     */
    private static final String BOB_MARLEY = "Bob Marley";

    public static void main(String[] args) {

        List<Music> list1 = new ArrayList<>();
        List<Music> list2 = new ArrayList<>();

        list1.add(new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE));
        list1.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));
        list1.add(new Music(BOB_MARLEY, "One Love", MusicStyle.HOUSE));

        list2.add(new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE));
        list2.add(new Music(BOB_MARLEY, "Is This Love", MusicStyle.HOUSE));
        list2.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));

        // This stream contains all elements of first stream followed by all
        // elements of second stream.
        List<Music> list = Stream.concat(list1.stream(), list2.stream())
                .filter(b -> b.getArtist().equals(BOB_MARLEY))
                .peek(System.out::println)
                .collect(Collectors.toList());
        list.forEach(b -> System.out.println(b.getArtist() + ", " + b.getMusicName()));

        // Remove duplicates using distinct()
        System.out.println("--Remove duplicates using distinct()--");
        list = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
        list.forEach(b -> System.out.println(b.getArtist() + ", " + b.getMusicName()));
    }

}
