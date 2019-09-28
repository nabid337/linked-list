package merge_sort;

public class Main {

    public static void main(String args[]){
        int array[] = {12, 10, 25, 5, 9, 18};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length -1);
        //System.out.println("merge");
    }
}
