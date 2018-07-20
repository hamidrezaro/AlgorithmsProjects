package com.DataStructures.Stack;

import com.DataStructures.LinkedList.LinkedList;

public class Stack {

    private LinkedList list;

    Stack(){
        list = new LinkedList();
    }

    public void push(String _value){
        list.insertEnd(_value);
    }

    public String pop(){
        return list.popEnd();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize()
    {
        return list.getSize();
    }

    public void show(){
        list.show();
    }


}
