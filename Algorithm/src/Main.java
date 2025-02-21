import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("정렬 전 배열:");
        SelectionSort.printArray(arr);

        SelectionSort.selectionSort(arr);

        System.out.println("정렬 후 배열:");
        SelectionSort.printArray(arr);
    }
}