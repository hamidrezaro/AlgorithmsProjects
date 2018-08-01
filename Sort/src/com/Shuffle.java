package com;

import java.util.Random;

public class Shuffle {

    public void shuffle(Comparable[] arr){
        int N = arr.length;
        if (N < 2){
            return;
        }
        for (int i = 1; i < N; i++){
            Random rand = new Random();
            int r = rand.nextInt(i+1);
            swap(arr, i, r);
        }
    }

    private void swap(Comparable[] arr, int i, int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
