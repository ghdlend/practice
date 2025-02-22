import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // enqueue() - 요소 추가
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("큐: " + queue); // [10, 20, 30]

        // peek() - 첫 번째 요소 확인
        System.out.println("맨 앞 요소: " + queue.peek()); // 10

        // dequeue() - 첫 번째 요소 제거
        queue.poll();
        System.out.println("poll 후 큐: " + queue); // [20, 30]

        // isEmpty() - 큐가 비었는지 확인
        System.out.println("큐가 비었나요? " + queue.isEmpty()); // false
    }
}
