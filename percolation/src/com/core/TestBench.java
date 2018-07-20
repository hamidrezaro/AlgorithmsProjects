package com.core;

import java.util.Random;

public class TestBench {

    public static void main(String[] args){

        int N = 10;
        Board b = new Board(N);

        double result = 0;

        int randomNum_row;
        int randomNum_column;

//        for (int iter = 1; iter <= 50; iter++){
//            int N = 10;
//            Board b = new Board(N);
//            while(!b.percolates()){
//                //generate random row and column
//                Random rn = new Random();
//                int i = rn.nextInt() % N;
//                randomNum_row =  1 + i;
//                i = rn.nextInt() % N;
//                randomNum_column =  1 + i;
//
//                //open the slot
//                b.makeOpen(randomNum_row, randomNum_column);
//
//            }
//            System.out.println(((double)b.getOpenSlots())/(N*N));
//            result += ((double)b.getOpenSlots())/(N*N);
//        }
//
//        System.out.println(result/50.0);


        while(!b.percolates()){
            //generate random row and column
            Random rn = new Random();
            int i = rn.nextInt() % N;
            randomNum_row =  1 + i;
            i = rn.nextInt() % N;
            randomNum_column =  1 + i;
            if(randomNum_row>= 1 && randomNum_row <= N && randomNum_column >=1 && randomNum_column <= N){
                //open the slot
                b.makeOpen(randomNum_row, randomNum_column);
                b.displayBoard();
            }

        }
    }




}
