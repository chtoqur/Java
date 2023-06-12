package Queue_Stack.exam1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApp2 {
    public static void main(String[] args) throws Exception {
        
        Queue<String> queue = new LinkedList<>();

        // add() : 삽입
        queue.add("이순신");
        queue.add("안중근");
        queue.add("전봉길");

        // element() : 다음에 어떤 요소가 나올지 확인
        System.out.println("다음 데이터 : " + queue.element());    // 이순신
        // remove() : 꺼내기
        System.out.println("pop 데이터 : " + queue.remove());    // 이순신
        System.out.println("pop 데이터 : " + queue.remove());    // 안중근
        System.out.println("pop 데이터 : " + queue.remove());    // 전봉길
        System.out.println("----- 모든 데이터 remove -----");
        System.out.println("pop 데이터 : " + queue.remove());    // Error



    }
}
