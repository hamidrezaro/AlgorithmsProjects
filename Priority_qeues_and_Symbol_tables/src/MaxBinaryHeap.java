/***
 *
 * Author : Hamid Reza Roodabeh
 *
 *  Binary Heap.
 * Each node has a value associated with it. each parent has at most two children, both equal or smaller than the parent.
 * The height of the heap is at most [log2(N)], with N being the number of elements.
 * Indexing of array starts from 1, and children of node k are at positions 2k and 2k + 1
 * The parent of node k is at position k//2
 *
 *
 */


public class MaxBinaryHeap<Item extends Comparable<Item>>{

    private Item[] heap;
    private int size;

    public MaxBinaryHeap(int MAX_CAP){
        size = 0;
        heap = (Item[]) new Comparable[MAX_CAP + 1];
    }


    /***
     * inserting an item in its right position
     * @param x : item to be inserted
     */
    public void insert(Item x){
        heap[++size] = x;
        moveUp(size);
    }


    /***
     * removes the largest element and rearranges the heap. at most of 2log2(N) order
     * @return largest element in the heap
     */
    public Item delMax(){
        Item maxItem = heap[1];
        swap(heap, 1, size);
        moveDown(1);
        heap[size] = null;
        size--;
        return maxItem;
    }


    /***
     * child at position n, is greater than it's parent, so we move it up
     * @param k : index of child
     */
    private void moveUp(int k){
        while (k > 1 && heap[k].compareTo(heap[k/2]) > 0){
            swap(heap, k, k/2);
            k /= 2;
        }
    }


    /***
     * parent is less than is children, so it gets de-promoted
     * @param k : position of parent
     */
    private void moveDown(int k){

        while (2*k <= size){
            int j = 2*k;
            if(heap[j].compareTo(heap[j+1]) < 0)
                j++;
            if (j < size && heap[k].compareTo(heap[j]) < 0)
                swap(heap, k, j);
            if (heap[k].compareTo(heap[j]) >= 0)
                break;
            k = j;
        }
    }


    /***
     * swap two elements of an array
     * @param it : array
     * @param i : first element
     * @param j : seconf element
     */
    private void swap(Item[] it, int i, int j){
        Item temp = it[i];
        it[i] = it[j];
        it[j] = temp;
    }

    public boolean isEmpty(){
        return size == 0;
    }

}
