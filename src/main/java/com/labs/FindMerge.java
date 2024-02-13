package com.labs;

import com.labs.entity.LinkList;
import com.labs.entity.Node;

import java.util.*;

public class FindMerge {
    LinkList<Integer> l1;
    LinkList<Integer> l2;

    public FindMerge(LinkList<Integer> l1, LinkList<Integer> l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public Node<Integer> findMerge() {
        Map<Node, Node> map = new HashMap<>();
        Node<Integer> temp = l1.getHead();
        while(temp != null) {
            map.put(temp, temp);
            temp = temp.getNext();
        }
        temp = l2.getHead();
        while(temp != null) {
            Node<Integer> foundNode = map.get(temp);
            if (foundNode != null) {
                return foundNode;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public static void main(String[] args) {
        LinkList<Integer> l1 = new LinkList<>(10).add(20).add(30).add(40).add(50);
        LinkList<Integer> l2 = new LinkList<>(100).add(200);
        LinkList<Integer> l3 = new LinkList<>(1000).add(2000).add(3000).add(4000).add(5000);
        l1.add(l3);
        //l2.add(l3);
        FindMerge findMerge = new FindMerge(l1, l2);
        Node<Integer> found = findMerge.findMerge();
        if (found != null) {
            System.out.println("found = " + found.getData());
        } else {
            System.out.println("No merge found");
        }
    }
}
