package com.DataStructures.Stack;

public class StackWithArray {

    private int size;
    private int length;
    private int indexPointer;
    private String[] values;

    StackWithArray(){
        length = 5;
        indexPointer = 0;
        size = 0;
        values = new String[length];
    }

    public void push(String _value){

        if(indexPointer > (length-1)){
            length = 2*length;
            String[] temp_array = new String[length];
            indexPointer = 0;
            for(String s : values){
                if(s != null)
                    temp_array[indexPointer++] = s;
            }
            values = new String[length];
            values = temp_array;
        }

        values[indexPointer] = _value;
        size++;
        indexPointer++;
    }

    public String pop(){
        if(isEmpty())
            return null;
        String res = values[indexPointer-1];
        values[indexPointer-1] = null;
        indexPointer--;
        size--;
        return res;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void show(){
        for(String s : values){
            if(s != null)
                System.out.println(s);
        }
    }

}
