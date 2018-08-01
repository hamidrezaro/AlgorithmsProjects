package com;

public class Main {


    public static void main(String[] args){
        Integer[] nums = {1,2,3,4,5,6,7,8,9};
        Shuffle ss = new Shuffle();
        ss.shuffle(nums);

        for(long l : nums){
            System.out.println(l);
        }

    }


}
