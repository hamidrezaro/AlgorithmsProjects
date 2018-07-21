package com.DataStructures.LinkedList;

public class Node<Item> {

    private Node<Item> next;
    private Item value;


    Node(){

        this.next = null;
        this.value = null;

    }

    Node(Item _value){
        this.value = _value;
        this.next = null;
    }

    public Node(Item _value, Node<Item> _next){
        this.value = _value;
        this.next = _next;
    }


    public Node<Item> getNext(){
        return this.next;
    }


    public Item getValue() {
        return value;
    }

    public void setNext(Node<Item> next) {
        this.next = next;
    }

    public boolean hasNext(){
        return (this.next != null);
    }

    public void setValue(Item _value){
        this.value = _value;
    }

}
