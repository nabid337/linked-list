package merge_sort;

public class MergeSort {
    void sort(int arr[], int left, int right){
        if(left < right){
            System.out.println("before middle : "  );
            int middle = (left + right) / 2;
            System.out.println("after middle : " + middle );

            System.out.println("before sort(arr,left, middle); "+ left + " , " +  middle);
            sort(arr,left, middle);
           // System.out.println("after sort(arr,left, middle); "+ left + " , " + right + " , "+ middle);
            var temp = middle +1;
            System.out.println("before sort(arr, middle+1, right);" +  temp  + " , "+ right);
            sort(arr, middle+1, right);
            System.out.println("after sort(arr, middle+1, right);"  + temp  + " , "+ right);
        }
    }
}
