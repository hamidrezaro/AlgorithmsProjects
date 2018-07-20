package com.DataStructures.Stack;

public class Main {

    public static void main (String[] args){
        Stack s = new Stack();
        s.push("hamid");
        s.push("reza");
        s.push("roodabeh");
        s.push("is");
        s.push("king");

        s.show();


        s.pop();
        s.pop();
        s.pop();

        s.show();

    }


}
