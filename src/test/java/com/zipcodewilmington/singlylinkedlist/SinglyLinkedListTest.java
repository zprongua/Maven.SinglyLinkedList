package com.zipcodewilmington.singlylinkedlist;

import org.testng.annotations.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList sll;

//    add -- add an element to the list
    @Test
    public void testAdd() {
        sll = new SinglyLinkedList(2);
        sll.add(5);
    }
//    remove -- remove an element (specified by numeric index) from the list
//    contains -- returns true if the element is in the list, false otherwise
//    find -- returns the element's index if it is in the list, -1 otherwise
//    size -- returns the current size of the list
//    get -- returns the element at the specified index
//    copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
//    sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)
}
