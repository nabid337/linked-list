package binary_heap;

public class Main {
    public static void main(String args[]){
        System.out.println("hello world");
        BinaryMinHeap minHeap = new BinaryMinHeap(10);
        minHeap.insert(5);
       // minHeap.print();
        minHeap.insert(14);
       // minHeap.print();
        minHeap.insert(23);
      //  minHeap.print();
        minHeap.insert(1);
       // minHeap.print();
        minHeap.insert(41);
       // minHeap.print();
        minHeap.insert(87);
      //  minHeap.print();
        minHeap.insert(90);
       // minHeap.print();
        minHeap.insert(50);
       // minHeap.print();
        minHeap.insert(64);
      //  minHeap.print();
        minHeap.insert(2);
       // minHeap.print();

        int size = minHeap.heapSize;
        for(int i=0; i<size; i++){

            System.out.print(minHeap.extractMin() + " ");
        }



    }
}
