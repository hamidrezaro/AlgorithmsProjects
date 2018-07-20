package com.DataStructures.LinkedList;

public class Main {


    static public void main(String[] arga){
        LinkedList ll = new LinkedList();
        ll.insertEnd("hamid");
        ll.insertEnd("reza");
        ll.insertEnd("roodabeh");
        ll.insertEnd("is");
        ll.insertEnd("king");

        ll.show();


        System.out.print("\n\n\n");

        String s1 = ll.popEnd();
        String s2 = ll.popEnd();
        String s3 = ll.popEnd();

        ll.show();


        System.out.print("\n\n\n");


        ll.insertHead("hamid1");
        ll.insertHead("hamid2");
        ll.insertHead("hamid3");

        ll.show();

        System.out.print("\n\n\n");


        ll.popFront();
        ll.popFront();

        ll.show();




    }


}
