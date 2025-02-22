import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // push() - 요소 추가
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("스택: " + stack); // [10, 20, 30]

        // peek() - 최상위 요소 확인
        System.out.println("맨 위 요소: " + stack.peek()); // 30

        // pop() - 최상위 요소 제거
        stack.pop();
        System.out.println("pop 후 스택: " + stack); // [10, 20]

        // isEmpty() - 스택이 비었는지 확인
        System.out.println("스택이 비었나요? " + stack.isEmpty()); // false
    }
}
