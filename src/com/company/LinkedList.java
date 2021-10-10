package com.company;

import static com.company.Node.insert;
import static com.company.Node.printlist;

public class LinkedList {
   Node head ;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
  list = insert(list,56);
  list = insert(list,30);
  list = insert(list,70);

   printlist(list);
    }
}
