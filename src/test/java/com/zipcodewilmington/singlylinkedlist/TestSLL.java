package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class TestSLL {
    @Test
    public void testSLLadd() {
        SLL<Integer> sll = new SLL<>();
        Node node = new Node<>(5);
        sll.add(5);


        Assert.assertEquals(node.getData(), sll.get(0));
    }

    @Test
    public void testSLLremove() {
        SLL<Integer> sll = new SLL<>();
        sll.add(5);
        sll.add(7);
        sll.add(1);
        sll.remove(sll.find(5));

        Assert.assertEquals(new Node(7).getData(), sll.get(0));
    }

    @Test
    public void testSLLcopy() {
        SLL<Integer> sll = new SLL<>();
        sll.add(5).add(7).add(1);

        SLL<Integer> sll2 = sll.copy();
        Assert.assertEquals(3, sll.size());
    }

    @Test
    public void testSLLcontains() {
        SLL<Integer> sll = new SLL<>();
        sll.add(5).add(7).add(1);

        Assert.assertTrue(sll.contains(7));
    }

    @Test
    public void testSLLsort() {
        SLL<Integer> sll = new SLL<>();
        sll.add(5).add(7).add(1);
        Comparator<Integer> comparator = (o1, o2) -> (int) (o2 - o1);
        sll.sort(comparator);
        System.out.println(sll.get(0));
    }
}
