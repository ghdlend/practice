public class BinarySearch {
    public static int binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length -1;
         while(left <= right){
             int mid = (left + right) / 2;
             if(arr[mid] == target) {
                 return mid;
             }else if(arr[mid] < target){
                 left = mid + 1;
             }else{
                 right =mid - 1;
             }
         }
         return -1;
    }
    public static void main(String[] args){
        int[] numbers = {1, 3, 5, 6, 9, 11};
        int target = 5;
        int result = binarySearch(numbers,target);
        if(result != -1){
            System.out.println("찾은 위치: " + (result+1));
        }else{
            System.out.println("값을 찾을 수 없음");
        }
    }
}
