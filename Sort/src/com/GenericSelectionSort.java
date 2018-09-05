package com;

public class GenericSelectionSort {

    public static void sort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            Comparable temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}