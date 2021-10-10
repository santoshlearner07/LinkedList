package com.company;

class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
        next = null;

    }

    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) { // if Linked empty make new node head
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printlist(LinkedList list) {
        Node currNode = list.head;
        System.out.printf("My Node ");
        while (currNode != null) {
            System.out.print("->" + currNode.data);
            currNode = currNode.next;
        }
    }
}

