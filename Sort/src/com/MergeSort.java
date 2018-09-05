package com;

public class MergeSort {


    // ---------------- First Algorithm ---------------//
    public int[] sort1(int[] input){
        int N = input.length;

        // it means we are ready to start merging from bottom-up
        if (N == 1)
            return input;

        // halve the input array into two sub-arrays
        int mid = N/2;
        int[] a1 = new int[mid];
        int[] a2 = new int[N - mid];
        System.arraycopy(input, 0, a1, 0, mid);
        System.arraycopy(input, mid, a2, 0, N - mid);

        // merge the arrays together
        return merge(sort1(a1), sort1(a2));

    }



    private int[] merge(int[] a, int[] b){
        int K = a.length + b.length;
        int i = 0;
        int j = 0;
        int[] res = new int[K];
        for (int k = 0; k < K; k++){

            // first sub-array has ran out of elements
            if(i == (a.length) ){
                while (j != b.length){
                    res[k] = b[j++];
                    k++;
                }
                break;
            }
            // second sub-array has ran out of elements
            else if (j == (b.length)){
                while (i != a.length){
                    res[k] = a[i++];
                    k++;
                }
                break;
            }

            // an element from first array is smaller
            if (a[i] <= b[j]){
                res[k] = a[i++];

            }
            // an element from second array is smaller
            else{
                res[k] = b[j++];
            }
        }

        return res;

    }
    // ---------------- First Algorithm ---------------//




    // ---------------- Second Algorithm ---------------//
    private void sortArray(Comparable[] arr, Comparable[] aux, int lo, int hi){
        if(hi <= lo)
            return;
        int mid = lo + (hi - lo)/2;
        sortArray(arr, aux, lo, mid);
        sortArray(arr, aux, mid + 1, hi);
        merge(arr, aux, lo, mid, hi);
    }


    public void sort2(Comparable[] arr){
        Comparable[] aux = new Comparable[arr.length];
        sortArray(arr, aux, 0, arr.length - 1);
    }

    private void merge(Comparable[] arr, Comparable[] aux, int lo, int mid, int hi){
        for(int k = 0; k < arr.length; k++){
            aux[k] = arr[k];
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++){
            if (i > mid) arr[k] = aux[j++];
            else if (j > hi) arr[k] = aux[i++];
            else if (aux[i].compareTo(aux[j]) < 0) arr[k] = aux[i++];
            else arr[k] = aux[j++];
        }

    }
    // ---------------- Second Algorithm ---------------//

}
