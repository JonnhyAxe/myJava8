package com.perfectmatch.domain.collections.arraylist;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.perfectmatch.domain.Music;

/**
 * Test Suite for toArray() overloaded methods of the ArrayList
 *
 * ArrayList is implemented with Object[]
 *
 */
public class MyArraylistToArrayMusicTest extends MyArraylistBaseTest {


    /**
     *
     */
    private static final String LIST_DO_NOT_CONTAIN_ELEMENT = "List do not contain element ";

    @Test
    public void ArrayListToArrayOfObjects() {

        // Given

        // When

        // O(n) should traverse all the list
        Object[] listToArray = list.toArray();


        // List is backed by the array
        Music musicBobMarleyToBob = (Music) listToArray[0];
        musicBobMarleyToBob.setArtist("Bob");


        // Then
        for (Object music : listToArray) {
            assertTrue(LIST_DO_NOT_CONTAIN_ELEMENT + music.toString(), list.contains(music));
        }
    }

    @Test
    public void ArrayListToArrayOfMusic() {

        // Given

        // When

        // O(n) should traverse all the list
        Music[] listToArray = list.toArray(new Music[] {});

        // List is backed by the array
        Music musicBobMarleyToBob = listToArray[0];
        musicBobMarleyToBob.setArtist("Bob");

        // Then
        for (Object music : listToArray) {
            assertTrue(LIST_DO_NOT_CONTAIN_ELEMENT + music.toString(), list.contains(music));
        }
    }

    @Test(expected = NullPointerException.class)
    public void ArrayListToArrayOfMusicExpectedNullPointerException() {

        // Given

        // When

        // O(n) should traverse all the list
        Music[] listToArray = list.toArray(null);

        // Then
        // @Test(expected = NullPointerException.class)

    }

    @Test(expected = ArrayStoreException.class)
    public void ArrayListToArrayOfMusicExpectedArrayStoreException() {

        // Given
        String[] arrayOfStrings = new String[]{};

        // When
        String[] listToArray = list.toArray(arrayOfStrings);

        // Then
        // @Test(expected = ArrayStoreException.class)
    }

}
