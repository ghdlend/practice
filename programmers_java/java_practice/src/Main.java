import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "";
        String output = "";
        int tmp;

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        for(int i =0; i < input.length();i++){
            tmp = (int)input.charAt(i);
            if((65 <=tmp)&&(tmp <= 90)){
                output += (char)(tmp + 32);
            }
            else if((97 <= tmp) && (tmp <= 122)){
                output += (char)(tmp - 32);
            }
            else{
                output += (char)tmp;
            }
        }
        System.out.println("변환된 문자열 : " + output);
    }
}