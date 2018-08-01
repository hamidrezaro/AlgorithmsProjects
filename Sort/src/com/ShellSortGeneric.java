package com;

public class ShellSortGeneric {

    public void sort(Comparable[] arr){
        int N = arr.length;
        int h = 1;
        while(h<N/3){
            h = 3*h + 1;
        }

        while(h>=1){
            for(int i = h; i < N; i++){
                for (int j = i; j >= h && arr[j].compareTo(arr[j - h]) < 0; j -= h)
                    swap(arr, j, j-h);
            }
            h = h/3;
        }
    }

    private void swap(Comparable[] arr, int i, int j){
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
