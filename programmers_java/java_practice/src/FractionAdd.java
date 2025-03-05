//import java.util.Arrays;
//
//class FractionAdd {
//    public int[] fractionAdd(int denum1, int num1, int denum2, int num2) {
//        int answer[] = new int[2];
//        int num = num1*num2;
//        int denum = num1*denum2 + num2*denum1;
//        int max = 1;
//
//        for(int i = 1;i<=num && i<=denum;i++){
//            if(num%i == 0 && denum%i == 0){
//                max = i;
//            }
//        }
//        answer[0] = denum/max;
//        answer[1] = num/max;
//        return answer;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        FractionAdd fraction = new FractionAdd();   // Solution 객체 생성
//        int[] result = fraction.fractionAdd(1, 2, 3, 4); // 분수 1/2 + 3/4 계산
//
//        System.out.println(Arrays.toString(result)); // 결과 출력
//    }
//}
