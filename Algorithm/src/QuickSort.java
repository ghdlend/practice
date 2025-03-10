import java.util.Arrays;
public class QuickSort {
    public static void quickSort(int[] arr, int left, int right){
        if(left >= right)return;

        int pivot = partition(arr,left,right);
        quickSort(arr,left,pivot -1);
        quickSort(arr,pivot + 1, right);
    }
    private static int partition(int[] arr,int left,int right){
        int pivot = arr[right];
        int i = left -1;

        for(int j =left; j < right;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,right);
        return i + 1;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] numbers = {5, 3, 8, 4, 2, 7, 1, 10};
        quickSort(numbers,0,numbers.length -1);
        System.out.println(Arrays.toString(numbers));
    }
}
