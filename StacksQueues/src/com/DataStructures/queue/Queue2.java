package com.DataStructures.queue;

import com.DataStructures.LinkedList.Node;

public class Queue2<Item> {

    private Node<Item> first, last;

    Queue2(){
        first = null;
        last = null;
    }

    public void enqueue(Item _value){



        if(this.isEmpty()){
            Node nptr = new Node<Item>(_value, null);
            last = first = nptr;
            return;
        }

        Node nptr = new Node<Item>(_value, null);
        last.setNext(nptr);
        last = nptr;

    }

    public Item dequeue(){

        if(isEmpty())
            return null;

        Item res = first.getValue();

        first = first.getNext();
        if(isEmpty())
            last = null;

        return res;
    }

    public boolean isEmpty(){
        return first == null;
    }

}
