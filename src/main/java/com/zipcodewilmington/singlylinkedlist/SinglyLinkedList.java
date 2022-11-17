package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Object[][] oa;

    public SinglyLinkedList(int size) {
        oa = new Object[size][2];
    }

    public void add(Object o) {
        Object[][] temp = new Object[oa.length][2];
        for (int i=0; i<oa.length; i++) {
            temp[i][1] = oa[i][1];
        }
        temp[oa.length][1] = o;
        oa = temp;
    }
}
