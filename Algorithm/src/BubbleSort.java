//import java.util.Arrays;
//
//public class BubbleSort {
//    public static void bubbleSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) { // 총 n-1번 반복
//            for (int j = 0; j < n - 1 - i; j++) { // 점점 비교 횟수 줄어듦
//                if (arr[j] > arr[j + 1]) { // 앞의 값이 크면 swap
//                    swap(arr, j, j + 1);
//                }
//            }
//        }
//    }
//
//    private static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {5, 3, 8, 4, 2};
//        System.out.println("정렬 전: " + Arrays.toString(numbers));
//
//        bubbleSort(numbers);
//
//        System.out.println("정렬 후: " + Arrays.toString(numbers));
//    }
//}
