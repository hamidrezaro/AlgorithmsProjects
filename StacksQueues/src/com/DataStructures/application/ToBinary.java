package com.DataStructures.application;

import com.DataStructures.Stack.Stack;

public class ToBinary {

    private int n;

    ToBinary(int _n){
        this.n = _n;
    }

    public void setNumber(int _n){
        this.n = _n;
    }

    public void getBinary() {
        Stack<Integer> st = new Stack<>();
        while (n > 0) {
            st.push(n % 2);
            n = n / 2;
        }
        while(!st.isEmpty()){
            System.out.print(Integer.toString(st.pop()));
        }
    }


}
