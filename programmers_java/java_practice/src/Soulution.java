//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        String my_string = "He32knkrld";
//        String overwrite_string = "llowo";
//        int s = 2;
//
//        String result = sol.solution(my_string, overwrite_string, s);
//        System.out.println(result);
//    }
//}




class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer += my_string.substring(0, s);
        answer += overwrite_string;
        if (my_string.length() - answer.length() > 0)
            answer += my_string.substring(s + overwrite_string.length());
        return answer;

    }
}