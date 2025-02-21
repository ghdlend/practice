public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int target = 20;

        int result = linearSearch(numbers,target);

        if(result != -1){
            System.out.print("찾는값은 : "+ target + "이고 위치는 " + (result+1));
        }
        else{
            System.out.println("찾는 값은:"+target+"없습니다.");
        }
    }
}
