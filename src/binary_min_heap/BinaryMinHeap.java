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
        return array;
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

    void insert(int value){

    }

    void deleteByValue(){

    }
}
