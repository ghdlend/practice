//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {64, 25, 12, 22, 11};
//
//        System.out.println("정렬 전 배열:");
//        SelectionSort.printArray(arr);
//
//        SelectionSort.selectionSort(arr);
//
//        System.out.println("정렬 후 배열:");
//        SelectionSort.printArray(arr);
//    }
//}
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }


    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
