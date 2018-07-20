package com.DataStructures.Stack;

public class Main {

    public static void main (String[] args){
        StackWithArray sw = new StackWithArray();

        sw.push("1");
        sw.push("2");
        sw.push("3");
        sw.push("4");
        sw.push("5");
        sw.push("6");
        sw.push("7");
        sw.push("8");


        sw.show();

        sw.pop();
        sw.pop();
        sw.pop();

        sw.show();


    }


}
