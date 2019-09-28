package merge_sort;

public class MergeSort {
    void sort(int arr[], int left, int right){
        if(left < right){
            System.out.println("int middle = (left + right) / 2;");
            int middle = (left + right) / 2;

            System.out.println("sort(arr,left, middle);");
            sort(arr,left, middle);

            System.out.println("sort(arr, middle+1, right);");
            sort(arr, middle+1, right);
        }
    }
}
