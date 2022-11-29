package com.zipcodewilmington.singlylinkedlist;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList sll;


//    add -- add an element to the list
    @Test
    public void testAdd() {
        sll = new SinglyLinkedList();
        sll.add(5);
        sll.add(6);

        sll.remove(5);
    }
//    remove -- remove an element (specified by numeric index) from the list
    @Test
    public void testRemove() {
        sll = new SinglyLinkedList();
        sll.add(5);
        sll.add(6);
        sll.remove(6);
        sll.remove(null);
        Assert.assertEquals(1, sll.size());
    }
//    contains -- returns true if the element is in the list, false otherwise
    @Test
    public void testContains() {
        sll = new SinglyLinkedList();
        sll.add(3);
        sll.remove(null);

        Assert.assertTrue(sll.contains(3));
    }
//    find -- returns the element's index if it is in the list, -1 otherwise
    @Test
    public void testFind() {
        sll = new SinglyLinkedList();
        sll.add("Ritter");
        sll.add("Sheba");
        sll.remove(null);

        Assert.assertEquals(0, sll.find("Ritter"));
    }
//    size -- returns the current size of the list
    @Test
    public void testSize() {
        sll = new SinglyLinkedList();
        sll.add(1);
        sll.add(2);
        sll.remove(null);
        Assert.assertEquals(2, sll.size());
    }
//    get -- returns the element at the specified index
    @Test
    public void testGet() {
        sll = new SinglyLinkedList();
        sll.add("Ritter");
        sll.add(42);
        sll.remove(null);
        Assert.assertEquals(42, sll.get(1));
    }
//    copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
    @Test
    public void testCopy() {
        sll = new SinglyLinkedList();
        sll.add("Ritter");
        sll.add(42);
        sll.remove(null);
        SinglyLinkedList sll2 = sll.copy();
        Assert.assertEquals(42, sll2.get(1));
    }
//    sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
    @Test
    public void testSort() {
        sll = new SinglyLinkedList();
        sll.add(42);
        sll.add("Marvin");
        sll.add("Deep Thought");
        sll.remove(null);
        sll.sort();
        Assert.assertEquals("Marvin", sll.get(2));
    }

}
