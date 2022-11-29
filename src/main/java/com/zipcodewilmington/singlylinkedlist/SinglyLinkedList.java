package com.zipcodewilmington.singlylinkedlist;

import java.util.Arrays;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Object[][] oa;

    public SinglyLinkedList() {
        oa = new Object[1][2];
    }

    public SinglyLinkedList(Object[][] oda) {
        oa = oda;
    }


    public void add(Object o) {
        Object[][] temp = new Object[oa.length+1][2];
        for (int i=0; i<oa.length; i++) {
            temp[i][0] = i;
            temp[i][1] = oa[i][1];
        }
        temp[oa.length][0] = oa.length;
        temp[oa.length][1] = o;
//        remove(null);
        oa = temp;
//        for (int i=0; i<size(); i++) {
//            System.out.println(oa[i][1]);
//        }
    }

    public void remove(Object o) {
        Object[][] temp = new Object[oa.length-1][2];
        int j = 0;
        for (int i=0; i<oa.length; i++) {
            Object t = oa[i][1];
            try {
                if (!t.equals(o)) {
                    temp[j][0] = j;
                    temp[j][1] = oa[i][1];
                    j++;
                }
            } catch (NullPointerException e) {
                continue;
            }
        }
        oa = temp;
//        for (int i=0; i<size(); i++) {
//            System.out.println(oa[i][1]);
//        }
//        for (int i=0; i<oa.length; i++) {
//            if (oa[i][1].equals(null)) remove(null);
//        }
    }

    public int size() {
        return oa.length;
    }

    public boolean contains(Object o) {
        for (int i=0; i<size(); i++) {
            if (oa[i][1].equals(o)) return true;
        }
        return false;
    }

    public int find(Object o) {
        for (int i=0; i<size(); i++) {
            if (oa[i][1].equals(o)) return i;
        }
        return -1;
    }

    public Object get(int o) {
        return oa[o][1];
    }

    public SinglyLinkedList copy() {
        Object[][] temp = new Object[oa.length][2];
        for (int i=0; i<oa.length; i++) {
            temp[i][0] = i;
            temp[i][1] = oa[i][1];
        }
        return new SinglyLinkedList(temp);
    }

    public void sort() {
        int count = 0;
        Object[][] sorted = new Object[oa.length][2];
        while (count<oa.length) {
            
        }
    }
}
