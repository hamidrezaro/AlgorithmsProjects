public class HeapSort {

    private Comparable[] a;

    public void sort(Comparable[] arr){

        // number of elements in the array
        int N = arr.length - 1;

        // heap construction
        for (int k = N/2; k >= 1; k--){
            sinkDown(arr, k, N);
        }
        for (int j = N; j >=1; j--){
            swap(arr, 1, j);
            sinkDown(arr, 1, --N);

        }
    }

    private void sinkDown(Comparable[] arr, int k, int N){
        while(2*k <= N){
            int j = 2*k;
            if (j < N && arr[j].compareTo(arr[j+1]) < 0)
                j++;
            if(arr[k].compareTo(arr[j]) >= 0)
                break;
            swap(arr, j, k);
            k = j;
        }
    }

    private void swap(Comparable[] it, int i, int j){
        Comparable temp = it[i];
        it[i] = it[j];
        it[j] = temp;
    }

    private void show(Comparable[] arr){
        for (Comparable i : arr)
            System.out.print(i + " ");
    }

}
