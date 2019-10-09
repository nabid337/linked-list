package binary_min_heap;

public class BinaryMinHeap {
    int array[];
    int capacity;
    int heapSize;

    BinaryMinHeap(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.heapSize = 0;
    }

    int getCapacity() {
        return capacity;
    }

    int[] getArray() {
        return this.array;
    }

    int getParent(int i) {
        return (i - 1) / 2;
    }

    int leftChild(int i) {
        return 2 * i + 1;
    }

    int rightChild(int i) {
        return 2 * i + 2;
    }

    int getMin() {
        return array[0];
    }

    void minHeapify(int i) {

        int left = leftChild(i);
        int right = rightChild(i);
        int smallest;
        if (left <= heapSize && right <= heapSize) {
            int rightVal = right<array.length? array[right]: 500;
            if (array[left] < rightVal) {
                smallest = array[left];
                array[i] = smallest;
                i = left;
            } else if (rightVal < array[left]) {
                smallest = rightVal;
                array[i] = smallest;
                i = right;
            }
            minHeapify(i);
        }


    }

    int extractMin() {
        int min = array[0];
       // heapSize--;
        minHeapify(0);
        heapSize--;
        return min;
    }

    void swap(int parentPos, int valuePos) {
        int temp = array[parentPos];
        array[parentPos] = array[valuePos];
        array[valuePos] = temp;
    }

    void insert(int value) {
        if (heapSize == capacity) {
            System.out.println("capacity exceeded");
            return;
        }
        this.array[heapSize] = value;
        int i = heapSize;

        int parentPosition = getParent(heapSize);
        while (i != 0 && value < array[parentPosition]) {
            swap(parentPosition, i);
            i = parentPosition;
            parentPosition = getParent(parentPosition);
        }
        /*if(value < array[parentPosition]){
            swap(parentPosition, heapSize);
        }*/
        this.heapSize++;
    }

    void deleteByValue() {

    }

    void print() {
        for (int i = 0; i < heapSize; i++) {
            // System.out.println(array[i]);
            System.out.printf(" " + array[i]);
        }
        System.out.println();
    }
}
