package com.DataStructures.queue;

import com.DataStructures.LinkedList.LinkedList;

public class Queue<Item> {

    private LinkedList<Item> list;

    Queue(){
        list = new LinkedList<Item>();
    }

    public void enqueue(Item _value){

        list.insertEnd(_value);
    }

    public Item dequeue(){

        return list.popFront();
    }

    public boolean isEmpty(){

        return list.isEmpty();
    }


}
