package binary_min_heap;

public class Main {
    public static void main(String args[]){
        System.out.println("hello world");
        BinaryMinHeap minHeap = new BinaryMinHeap(10);
        System.out.println(minHeap.getCapacity());
        System.out.println(minHeap.getArray()[1]);
    }
}
