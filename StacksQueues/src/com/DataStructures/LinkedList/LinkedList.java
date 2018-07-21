package com.DataStructures.LinkedList;

public class LinkedList<Item> {

    private Node<Item> head;

    private int size;

    public LinkedList(){

        this.head = null;
        this.size = 0;

    }


    public void insertHead(Item _value){


        if(this.head == null) {
            head = new Node<Item>(_value, null);
            return;
        }

        Node<Item> nptr = new Node<Item>(head.getValue(), head.getNext());
        head.setValue(_value);
        head.setNext(nptr);
        size++;

    }

    public void insertEnd(Item _value){

        if(this.head == null){
            head = new Node<Item>(_value, null);
            size++;
            return;
        }

        Node<Item> temp = this.head;
        while(temp.hasNext())
            temp = temp.getNext();
        Node<Item> nptr = new Node<Item>(_value, null);
        temp.setNext(nptr);
        size++;

    }

    public Item popEnd(){

        if(this.head == null)
            return null;

        Node<Item> temp = head;
        Node<Item> holder = new Node<Item>();
        while(temp.hasNext()){
            holder = temp;
            temp = temp.getNext();
        }
        Item result = temp.getValue();
        holder.setNext(null);
        return result;

    }

    public Item popFront(){
        if(this.head == null)
            return null;
        Node<Item> newHead = head.getNext();
        Item result = this.head.getValue();
        this.head = newHead;
        size--;
        return result;
    }

    public void insertAtIndex(Item _value, int _index){
        if(_index < 0 || _index > (size-1))
            return;

        Node<Item> temp = head;
        for(int i = 0; i<_index-1; i++){
            temp = temp.getNext();
        }

        Node<Item> nptr = new Node<Item>(_value, temp.getNext());
        temp.setNext(nptr);

    }

    public void show() {

        if (this.isEmpty())
            return;

        Node<Item> temp = this.head;
        while(temp != null){
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }

    }

    public Node<Item> getHead(){return head;}

    public boolean isEmpty(){
        return this.head == null;
    }

    public int getSize(){
        return this.size;
    }

}
