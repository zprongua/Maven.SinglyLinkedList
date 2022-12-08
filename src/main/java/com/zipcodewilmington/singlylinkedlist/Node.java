package com.zipcodewilmington.singlylinkedlist;

public class Node <E extends Comparable<E>> implements Comparable<Node<E>> {
//    int p;
//    node next;

    @Override
    public int compareTo(Node<E> o) {
        return 0;
    }

    public Node<E> getNext() {
        return new Node<E>();
    }

    public void setData(E data) {
    }

    public E getData() {
        return null;
    }

    public boolean hasNext() {
        return true;
    }

    public void setNext(Node<E> next) {
    }
}
