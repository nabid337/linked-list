package binary_min_heap;

public class BinaryMinHeap {
    int array[];
    int capacity;
    int heapSize;

    BinaryMinHeap(int capacity){
        this.array = new int[capacity];
        this.capacity = capacity;
        this.heapSize = 0;
    }

    int getCapacity(){
        return capacity;
    }

    int[] getArray(){
        return this.array;
    }

    int getParent(int i){
        return (i-1)/2;
    }

    int leftChild(int i){
        return 2*i + 1;
    }

    int rightChild(int i){
        return 2*i + 2;
    }

    int getMin(){
        return array[0];
    }

    void minHeapify(){

    }

    int extractMin(){
        return 0;
    }

    /*void swap(int parent, int value){
        int temp = parent;
        parent = value;
        value = temp;
    }*/
    void insert(int value){
        if(heapSize  == capacity) {
            System.out.println("capacity exceeded");
            return;
        }
        this.array[heapSize] = value;

        int parentPosition = getParent(heapSize);
        if(value < array[parentPosition]){
            int temp = array[parentPosition];
            array[parentPosition] = value;
            array[heapSize] = temp;
        }
        this.heapSize++;
    }

    void deleteByValue(){

    }

    void print() {
        for (int i = 0; i < array.length; i++) {
           // System.out.println(array[i]);
            System.out.printf(" " + array[i]);
        }
        System.out.println();
    }
}
