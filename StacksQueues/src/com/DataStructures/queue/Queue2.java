package com.DataStructures.queue;

import com.DataStructures.LinkedList.Node;

import java.util.Iterator;

public class Queue2<Item> implements Iterable{

    private Node<Item> first, last;

    Queue2(){
        first = null;
        last = null;
    }

    @Override
    public Iterator iterator() {
        return new QueueIterator();
    }

    public class QueueIterator implements Iterator{

        private Node<Item> current = first;


        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {

            Item res = current.getValue();
            current = current.getNext();
            return res;

        }
    }

    public void enqueue(Item _value){



        if(this.isEmpty()){
            Node<Item> nptr = new Node<Item>(_value, null);
            last = first = nptr;
            return;
        }

        Node<Item> nptr = new Node<Item>(_value, null);
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
