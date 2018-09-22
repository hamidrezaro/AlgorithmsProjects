/***

Author : Hamid Reza Roodabeh

Unordered Priority Queue using fixed size array
 insertion is linear time, where as removing the max is of order N
 suitable for small MAX_CAPACITY structures

 ***/

public class UnorderedPQ<Item extends Comparable<Item>> {

    private Item[] items;
    private int size;

    public UnorderedPQ(int MAX_CAPACITY){
        items = (Item[]) new Comparable[MAX_CAPACITY];
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insert(Item newItem){
        items[size++] = newItem;
    }

    public Item removeMax(){
        if (this.isEmpty())
            return null;
        int max_id = 0;
        for (int i = 0; i < size; i++){
            if (items[i].compareTo(items[max_id]) > 0)
                max_id = i;
        }
        swap(items, max_id, size - 1);
        size--;
        return items[size];
    }

    private void swap(Item[] it, int i, int j){
        Item temp = it[i];
        it[i] = it[j];
        it[j] = temp;
    }

}
