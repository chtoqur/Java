package Queue_Stack.exam1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) throws Exception {
        
        Queue<String> queue = new LinkedList<>();

        // offer() : 삽입
        queue.offer("이순신");
        queue.offer("안중근");
        queue.offer("전봉길");

        // peek() : 다음에 어떤 요소가 나올지 확인
        System.out.println("다음 데이터 : " + queue.peek());    // 이순신

        // poll() : 꺼내기
        queue.poll();
        System.out.println("다음 데이터 : " + queue.peek());    // 안중근

    }
}
