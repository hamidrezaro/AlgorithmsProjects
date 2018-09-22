public class MinBinaryHeap < Item extends Comparable<Item> > {

    private Item[] heap;
    private int N;

    public MinBinaryHeap(int MAX_CAP){
        heap = (Item[]) new Comparable[MAX_CAP + 1];
        N = 0;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    private void swap(Item[] it, int i, int j){
        Item temp = it[i];
        it[i] = it[j];
        it[j] = temp;
    }

    private void moveUp(int k){
        while ( k > 1 && heap[k].compareTo(heap[k/2]) < 0){
            swap(heap, k, k/2);
            k = k/2;
        }
    }

    public void insert(Item item){
        heap[++N] = item;
        moveUp(N);
    }

    private void moveDown(int k){

        while (2*k <= N){
            int j = 2*k;
            if (heap[j].compareTo(heap[j+1]) < 0)
                j++;
            if (j <= N && heap[k].compareTo(heap[j]) > 0)
                swap(heap, j, k);
            if (heap[k].compareTo(heap[j]) <= 0)
                break;
            k = j;
        }
    }

    public Item delMin(){
        Item minItem = heap[1];
        swap(heap, 1, N);
        moveDown(1);
        heap[N--] = null;
        return minItem;
    }

}
