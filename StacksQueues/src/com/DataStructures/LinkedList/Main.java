package com.DataStructures.LinkedList;
import com.DataStructures.Stack.Stack;

public class Main {


    static public void main(String[] arga){


        Stack<Integer>  s = new Stack<Integer>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        s.pop();
        s.pop();

        for(int i : s){
            System.out.println(i);
        }






    }


}
