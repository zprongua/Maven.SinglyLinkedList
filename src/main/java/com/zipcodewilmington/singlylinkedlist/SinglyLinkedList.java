package com.zipcodewilmington.singlylinkedlist;

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
        Object[][] temp = new Object[size()+1][2];
        for (int i=0; i<size(); i++) {
            temp[i][0] = i;
            temp[i][1] = oa[i][1];
        }
        temp[size()][0] = size();
        temp[size()][1] = o;
//        remove(null);
        oa = temp;
//        for (int i=0; i<size(); i++) {
//            System.out.println(oa[i][1]);
//        }
    }

    public void remove(Object o) {
        Object[][] temp = new Object[size()-1][2];
        int j = 0;
        for (int i=0; i<size(); i++) {
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
        Object[][] temp = new Object[size()][2];
        for (int i=0; i<size(); i++) {
            temp[i][0] = i;
            temp[i][1] = oa[i][1];
        }
        return new SinglyLinkedList(temp);
    }

    public void sort() {
        int count = 0;
        Object[][] sorted = new Object[size()][2];
        while (count >= 0) {
            for (int i=0; i<size(); i++) {
                if (i < size() - 1) {
                    int o1 = String.valueOf(oa[i][1]).codePointAt(0);
                    int o2 = String.valueOf(oa[i+1][1]).codePointAt(0);
                    if (o1 <= o2) {
                        sorted[count][0] = count;
                        sorted[i][1] = oa[i][1];
                        count++;
                    }
                    else if (o1 > o2) {
                        if (sorted[i][1] == null) {
                            sorted[count][0] = count;
                            sorted[i][1] = oa[i + 1][1];
                            sorted[count + 1][0] = count + 1;
                            sorted[count + 1][1] = oa[i][1];
                        } else {
                            sorted[count+1][0] = count+1;
                            sorted[count+1][1] = sorted[count][1];
                            sorted[count][0] = count;
                            sorted[i][1] = oa[i + 1][1];
                        }
                        count++;
                    }
                }
                else if (i==size()){
                    count=0;
                }
                else count = -1;
            }
        }
        oa = sorted;
    }

    public void reverse() {
        Object[][] reverse = new Object[size()][2];
        int j = 0;
        for (int i=size()-1; i>=0; i--) {
            reverse[j][0] = j;
            reverse[j][1] = oa[i][1];
            j++;
        }
        oa = reverse;
    }

    public void slice(int i1, int i2) {
        Object[][] slice = new Object[i2-i1][2];
        int j=0;
        for (int i=i1; i<i2; i++) {
            slice[j][0] = j;
            slice[j][1] = oa[i][1];
            j++;
        }
        oa = slice;
    }
}