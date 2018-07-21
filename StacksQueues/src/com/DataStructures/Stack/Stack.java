package com.DataStructures.Stack;
import java.util.Iterator;

import com.DataStructures.LinkedList.LinkedList;
import com.DataStructures.LinkedList.Node;

public class Stack<Item> implements Iterable<Item>{


    // Iterable and Iterator
    public class ListIterator implements Iterator<Item>{

        private Node<Item> current = list.getHead();

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

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    // end Iterable and Iterator

    private LinkedList<Item> list;

    public Stack(){
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
