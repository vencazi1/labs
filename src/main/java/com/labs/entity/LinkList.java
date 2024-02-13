package com.labs.entity;

public class LinkList<T> {
    private Node<T> head;
    private Node<T> tail;

    public LinkList(T data) {
        Node<T> node = new Node<>(data);
        head = node;
        tail = node;
    }

    public LinkList add(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        return this;
    }

    public void add(LinkList<T> linkList) {
        if (head == null) {
            head = linkList.head;
            tail = linkList.tail;
        } else {
            tail.setNext(linkList.head);
            tail = linkList.tail;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
}
