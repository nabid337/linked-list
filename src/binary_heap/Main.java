package binary_heap;

public class Main {
    public static void main(String args[]){
        System.out.println("hello world");
        BinaryMinHeap minHeap = new BinaryMinHeap(10);
        int heapArray[] = {5,14,23,1,41,87,90,50,64,2};

        for(int i=0; i<heapArray.length; i++){
            minHeap.insert(heapArray[i]);
        }
        int size = minHeap.heapSize;
        for(int i=0; i<size; i++){

            System.out.print(minHeap.extractMin() + " ");
        }

        BinaryMaxHeap maxHeap = new BinaryMaxHeap(10);
        for(int i=0; i<heapArray.length; i++){
            maxHeap.insert(heapArray[i]);
        }

        int maxHeapsize = maxHeap.heapSize;
        for(int i=0; i<maxHeapsize; i++){
            System.out.print(maxHeap.extractMax() + " ");
        }




    }
}
