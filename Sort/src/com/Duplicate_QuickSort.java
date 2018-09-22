package com;

public class Duplicate_QuickSort {

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void sort(int[] arr, int lo, int hi){
        if(lo <=hi)
            return;

        int i, lt, gt;
        i = lt = lo;
        gt = hi;

        while(true){
            if (arr[i] == arr[lt])
                i++;
            if (arr[i] < arr[lt]){
                swap(arr, i++, lt++);

            }
            if (arr[i] > arr[lt]){
                swap(arr, i, gt--);
            }
            if(i>=gt)
                break;
        }

        sort(arr, lo, lt - 1);
        sort(arr, lt + 1, hi);
    }
}
