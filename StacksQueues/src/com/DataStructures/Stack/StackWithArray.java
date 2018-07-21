package com.DataStructures.Stack;

public class StackWithArray<Item> {

    private int size;
    private int length;
    private int indexPointer;
    private Item[] values;

    StackWithArray(){
        length = 5;
        indexPointer = 0;
        size = 0;
        values = (Item[]) new Object[length];
    }

    public void push(Item _value){

        if(indexPointer > (length-1)){
            length = 2*length;
            Item[] temp_array = (Item[])new Object[length];
            indexPointer = 0;
            for(Item s : values){
                if(s != null)
                    temp_array[indexPointer++] = s;
            }
            values = (Item[])new Object[length];
            values = temp_array;
        }

        values[indexPointer] = _value;
        size++;
        indexPointer++;
    }

    public Item pop(){
        if(isEmpty())
            return null;

        if(size == length/4){
            Item[] temp = (Item[]) new Object[length/2];

            indexPointer = 0;
            for(Item s : values){
                if(s != null)
                    temp[indexPointer++] = s;
            }
            length = length/2;
            values = temp;
        }

        Item res = values[indexPointer-1];
        values[indexPointer-1] = null;
        indexPointer--;
        size--;
        return res;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void show(){
        for(Item s : values){
            if(s != null)
                System.out.println(s);
        }
    }

}
