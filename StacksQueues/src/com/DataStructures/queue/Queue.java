package com.DataStructures.queue;

import com.DataStructures.LinkedList.LinkedList;

public class Queue {

    private LinkedList list;

    Queue(){
        list = new LinkedList();
    }

    public void enqueue(String _value){

        list.insertEnd(_value);
    }

    public String dequeue(){

        return list.popFront();
    }

    public boolean isEmpty(){

        return list.isEmpty();
    }


}
