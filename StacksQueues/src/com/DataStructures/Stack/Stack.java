package com.DataStructures.Stack;

import com.DataStructures.LinkedList.LinkedList;

public class Stack<Item> {

    private LinkedList<Item> list;

    Stack(){
        list = new LinkedList<Item>();
    }

    public void push(Item _value){
        list.insertEnd(_value);
    }

    public Item pop(){
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
