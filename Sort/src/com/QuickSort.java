package com;

public class QuickSort {


    private static void swap(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int partition(Comparable[] a, int lo, int hi){
        int i = lo;
        int j = hi + 1;

        while( true ){

            while(a[++i].compareTo(a[lo])<0)
                if(i == hi)
                    break;

            while(a[--j].compareTo(a[lo]) > 0)
                if(j == lo)
                    break;

            if(i >=j)
                break;

            swap(a, i, j);
        }
        swap(a, lo, j);
        return j;

    }

    private static void sort(Comparable[] arr){
        Shuffle sh = new Shuffle();
        sh.shuffle(arr);
        sort(arr, 0, arr.length - 1);
    }

    private static void sort (Comparable[] arr, int lo, int hi){
        if(hi <= lo) return;
        int j = partition(arr, lo, hi);
        sort(arr, lo, j-1);
        sort(arr, j+1, hi);
    }

    public static void main(String[] args){
        Integer[] a = {1,1,1,1,2,3,2,2,2,2};
        sort(a);
        for (int s : a){
            System.out.print(String.valueOf(s) + ' ');
        }
    }

}
