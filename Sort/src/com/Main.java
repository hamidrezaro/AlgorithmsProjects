package com;

public class Main {


    public static void main(String[] args){

        MergeSort m = new MergeSort();

        int[] a = {4,2,6,9,1,5,7};
        int[] b = {3,1,5,88,3,102,11,4,6};

        int[] c = m.sort1(b);

        for(int i : c){
            System.out.print(i);
            System.out.print("\n");
        }

    }


}
