package com;

public class SelectionSort {

    public void sortArray(long[] arr, int lo, int hi){
        while(lo < hi){
            long min = 100000;
            int min_id = -1;
            for(int i = lo; i < hi; i++){
                if(arr[i] < min){
                    min = arr[i];
                    min_id = i;
                }
            }

            arr[min_id] = arr[lo];
            arr[lo++] = min;
        }
    }

}
