package com.zipcodewilmington.singlylinkedlist;

public class Node<E extends Comparable<E>> implements Comparable<Node<E>> {
    private E data;
    private Node next;

    public Node(E data, Node next) {
        this.data = data;
        this.next = null;
    }

    public Node(E data) {
        this.data = data;
        this.next = null;
    }

    public Node<E> getNext() {
        return next;
    }

    public E getData() {
        return this.data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(E data) {
        this.data = data;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    @Override
    public int compareTo(Node<E> o) {
        return this.data.compareTo(o.data);
    }
}
