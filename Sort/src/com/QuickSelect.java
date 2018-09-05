package com;

public class QuickSelect {
    public static Comparable select(Comparable[] arr, int k){
        Shuffle sh = new Shuffle();

        sh.shuffle(arr);
        int lo = 0, hi = arr.length - 1;
        while (hi < lo) {
            int j = QuickSort.partition(arr, lo, hi);
            if (k < j)
                hi = j - 1;
            else if (k > j)
                lo = j + 1;
            else
                return arr[k];
        }
        return arr[k];
    }
}
