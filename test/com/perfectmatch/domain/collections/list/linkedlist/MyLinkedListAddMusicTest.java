
package com.perfectmatch.domain.collections.list.linkedlist;

import static org.junit.Assert.assertTrue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.collections.MusicCollectionsCommon;

/**
 * Add method of the linked list has Big(1) complexity. LinkedList has a
 * reference to the fist and the last Node, therefore it can add new elements in
 * constant time complexity.
 *
 * Adds the element in the last position of the List, therefore is ordered by
 * insertion
 *
 * LinkedidList implements Deque that has the addLast and addFirst methods. They
 * use the last and first Node reference of the linkedList
 *
 */
public class MyLinkedListAddMusicTest {

    /**
     *
     */
    private static final String THE_SIZE_OF_THE_LIST_SHOULD_BE_3 = "The size of the list should be 3";

    @Test
    public void addBobMusics() {

        // Given
        List<Music> linkedlist = new LinkedList<>();

        // When
        addMusicsToList(linkedlist);

        // Then
        assertTrue(THE_SIZE_OF_THE_LIST_SHOULD_BE_3, linkedlist.size() == 3);
    }

    @Test
    public void testAddFirstDequeLinkedInApiImplementation() {

        // Given
        List<Music> linkedlist = new LinkedList<>();
        Deque<Music> deque = (Deque<Music>) linkedlist;

        addMusicsToList(linkedlist);

        // When
        deque.addFirst(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY);
        Music noWomanNoCry = deque.getFirst();
        // Then
        Assert.assertEquals("Musics SHOULD be equal " + MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY.getMusicName(), MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY,
                noWomanNoCry);

    }

    @Test
    public void testAddLastDequeLinkedInApiImplementation() {

        // When
        List<Music> linkedlist = new LinkedList<>();
        Deque<Music> deque = (Deque<Music>) linkedlist;

        addMusicsToList(linkedlist);
        deque.addLast(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY);

        // Given
        Music noWomanNoCry = deque.getLast();

        // Then
        Assert.assertEquals("Musics SHOULD be equal " + MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY.getMusicName(), MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY,
                noWomanNoCry);
    }

    /**
     * @param linkedlist
     */
    private void addMusicsToList(List<Music> linkedlist) {

        linkedlist.add(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY);
        linkedlist.add(MusicCollectionsCommon.MUSIC_ONE_LOVE);
        linkedlist.add(MusicCollectionsCommon.MUSIC_REDMPTION_SONG);
    }


}
