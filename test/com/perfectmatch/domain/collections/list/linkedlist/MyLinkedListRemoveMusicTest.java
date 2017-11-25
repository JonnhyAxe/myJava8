
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
 * Remove method of the linked list has Big(n) complexity
 *
 * Remove the element needs traversal to find the specific element
 *
 * LinkedidList implements Deque that has the removeLast and removeFirst
 * methods. They use the last and first Node reference of the linkedList,
 * therefore the operation are constant time
 *
 */
public class MyLinkedListRemoveMusicTest extends MyLinkedListBaseTest {

    /**
     *
     */
    private static final String THE_SIZE_OF_THE_LIST_SHOULD_BE_3 = "The size of the list should be 3";

    @Test
    public void addBobMusic() {

        // Given

        // When
        list.remove(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY);
        list.remove(MusicCollectionsCommon.MUSIC_ONE_LOVE);
        list.remove(MusicCollectionsCommon.MUSIC_REDMPTION_SONG);

        // Then
        assertTrue(THE_SIZE_OF_THE_LIST_SHOULD_BE_3, list.isEmpty());
    }

    @Test
    public void testRemoveFirstDequeLinkedInApiImplementation() {

        // Given
        List<Music> linkedlist = new LinkedList<>();
        Deque<Music> deque = (Deque<Music>) linkedlist;

        // When
        deque.addFirst(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY);
        Music noWomanNoCry = deque.removeFirst();
        // Then
        Assert.assertEquals("Musics SHOULD be equal " + MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY.getMusicName(), MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY,
                noWomanNoCry);

    }

    @Test
    public void testRemoveLastDequeLinkedInApiImplementation() {

        // When
        List<Music> linkedlist = new LinkedList<>();
        Deque<Music> deque = (Deque<Music>) linkedlist;

        deque.addLast(MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY);

        // Given
        Music noWomanNoCry = deque.removeLast();


        // Then
        Assert.assertEquals("Musics SHOULD be equal " + MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY.getMusicName(), MusicCollectionsCommon.MUSIC_NO_WOMAN_NO_CRY,
                noWomanNoCry);
    }

}
