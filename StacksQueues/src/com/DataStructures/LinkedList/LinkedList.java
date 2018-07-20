package com.DataStructures.LinkedList;

public class LinkedList {

    private Node head;

    private int size;

    public LinkedList(){

        this.head = null;
        this.size = 0;

    }


    public void insertHead(String _value){


        if(this.head == null) {
            head = new Node(_value, null);
            return;
        }

        Node nptr = new Node(head.getValue(), head.getNext());
        head.setValue(_value);
        head.setNext(nptr);
        size++;

    }

    public void insertEnd(String _value){

        if(this.head == null){
            head = new Node(_value, null);
            size++;
            return;
        }

        Node temp = this.head;
        while(temp.hasNext())
            temp = temp.getNext();
        Node nptr = new Node(_value, null);
        temp.setNext(nptr);
        size++;

    }

    public String popEnd(){

        if(this.head == null)
            return null;

        Node temp = head;
        Node holder = new Node();
        while(temp.hasNext()){
            holder = temp;
            temp = temp.getNext();
        }
        String result = temp.getValue();
        holder.setNext(null);
        return result;

    }

    public String popFront(){
        if(this.head == null)
            return null;
        Node newHead = head.getNext();
        String result = this.head.getValue();
        this.head = newHead;
        size--;
        return result;
    }

    public void show() {

        if (this.isEmpty())
            return;

        Node temp = this.head;
        while(temp != null){
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }

    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public int getSize(){
        return this.size;
    }

}
