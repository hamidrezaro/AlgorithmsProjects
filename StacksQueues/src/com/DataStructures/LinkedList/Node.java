package com.DataStructures.LinkedList;

public class Node {

    private Node next;
    private String value;


    Node(){

        this.next = null;
        this.value = null;

    }

    Node(String _value){
        this.value = _value;
        this.next = null;
    }

    Node (String _value, Node _next){
        this.value = _value;
        this.next = _next;
    }


    public Node getNext(){
        return this.next;
    }


    public String getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean hasNext(){
        return (this.next != null);
    }

    public void setValue(String _value){
        this.value = _value;
    }

}
