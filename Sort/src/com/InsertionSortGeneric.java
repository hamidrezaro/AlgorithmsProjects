package com;

public class InsertionSortGeneric {

    public void sort(Comparable[] arr){
        int N = arr.length;
        for(int i = 0; i < N; i++){

            for(int j = i; j > 0; j--){
                if(arr[j].compareTo(arr[j-1]) < 0){
                    this.swap(arr,j, j-1);
                }
                else break;

            }
        }
    }

    private void swap(Comparable[] arr, int i, int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
