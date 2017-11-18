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
package com.perfectmatch.domain.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

import com.perfectmatch.domain.Music;
import com.perfectmatch.domain.MusicStyle;

/**
 * List Wrapper with Music type checked
 */
public class MyListWrapper implements List<Music> {

    /**
     *
     */
    private static final String LIST_PARAM_SHOULD_NOT_BE_NULL = "List param should not be null";

    private static final String LIST_PARAM_SHOULD_NOT_BE_NULL_AND_TYPE_MUSIC = "List param should not be null OR type Music object";


    private static final String BOB_MARLEY = "Bob Marley";

    private List<Music> list;

    public MyListWrapper(List<Music> list) {
        if (Objects.isNull(list)) {
            throw new IllegalArgumentException(LIST_PARAM_SHOULD_NOT_BE_NULL);
        }
        this.list = list;
    }

    public static void main(String[] args) {


        List<Music> listOfMusics = new ArrayList<>();

        // support fast (generally constant time) random access
        RandomAccess random = (ArrayList<Music>) listOfMusics;

        Music bob = new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE);

        // duplicates allowed - insert at the end
        listOfMusics.add(new Music(BOB_MARLEY, "No Woman No Cry", MusicStyle.HOUSE));
        listOfMusics.add(new Music(BOB_MARLEY, "Redemption Song", MusicStyle.HOUSE));
        listOfMusics.add(new Music(BOB_MARLEY, "One Love", MusicStyle.HOUSE));

        boolean bool = listOfMusics.contains(bob); // uses equals to find the
                                                   // correct element

        Iterator<Music> it = listOfMusics.iterator();

        ListIterator<Music> listIt = listOfMusics.listIterator();

        listOfMusics.equals(null); // order of the element is relevant and for
                                   // each element the equals is used to compare
                                   // the elements

        listOfMusics.set(0, bob);

    }



    /*
     * (non-Javadoc)
     *
     * @see java.util.List#size()
     */
    @Override
    public int size() {
        return this.list.size();
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#contains(java.lang.Object)
     */
    @Override
    public boolean contains(Object o) {

        if (Objects.isNull(o) || !(o instanceof Music)) {
            throw new IllegalArgumentException(LIST_PARAM_SHOULD_NOT_BE_NULL_AND_TYPE_MUSIC);
        }
        return this.list.contains(o);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#iterator()
     */
    @Override
    public Iterator<Music> iterator() {

        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#toArray()
     */
    @Override
    public Object[] toArray() {

        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#toArray(java.lang.Object[])
     */
    @Override
    public <T> T[] toArray(T[] a) {

        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#add(java.lang.Object)
     */
    @Override
    public boolean add(Music e) {

        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#remove(java.lang.Object)
     */
    @Override
    public boolean remove(Object o) {

        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#containsAll(java.util.Collection)
     */
    @Override
    public boolean containsAll(Collection<?> c) {

        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#addAll(java.util.Collection)
     */
    @Override
    public boolean addAll(Collection<? extends Music> c) {

        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#addAll(int, java.util.Collection)
     */
    @Override
    public boolean addAll(int index, Collection<? extends Music> c) {

        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#removeAll(java.util.Collection)
     */
    @Override
    public boolean removeAll(Collection<?> c) {

        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#retainAll(java.util.Collection)
     */
    @Override
    public boolean retainAll(Collection<?> c) {

        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#clear()
     */
    @Override
    public void clear() {

        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#get(int)
     */
    @Override
    public Music get(int index) {

        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#set(int, java.lang.Object)
     */
    @Override
    public Music set(int index, Music element) {

        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#add(int, java.lang.Object)
     */
    @Override
    public void add(int index, Music element) {

        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#remove(int)
     */
    @Override
    public Music remove(int index) {

        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#indexOf(java.lang.Object)
     */
    @Override
    public int indexOf(Object o) {

        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#lastIndexOf(java.lang.Object)
     */
    @Override
    public int lastIndexOf(Object o) {

        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#listIterator()
     */
    @Override
    public ListIterator<Music> listIterator() {

        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#listIterator(int)
     */
    @Override
    public ListIterator<Music> listIterator(int index) {

        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.util.List#subList(int, int)
     */
    @Override
    public List<Music> subList(int fromIndex, int toIndex) {

        // TODO Auto-generated method stub
        return null;
    }

}

