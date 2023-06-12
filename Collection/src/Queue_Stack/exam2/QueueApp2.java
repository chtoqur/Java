package Queue_Stack.exam2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueApp2 {
    public static void main(String[] args) throws Exception {
        
        // 임의의 String 4개를 stack에 집어넣고 빼는 코드를 만들어보세요.

        // 1. 스택 생성 ==> Deque
        Deque<String> deque = new LinkedList<>();
        // ArrayDeque : 환형큐 구현
        // Deque<String> deque = new ArrayDeque<>();

        // 2. push
        // 스택 구현
        deque.offerFirst("ab");
        deque.offerFirst("cd");
        deque.offerFirst("ef");
        deque.offerFirst("gh");
        deque.offerFirst("ij");

        System.out.println("first 데이터 : " + deque.peekFirst()); // "ij"

        // 3. pop
        System.out.println("pop 데이터 : " + deque.pollFirst());   // ij
        System.out.println("pop 데이터 : " + deque.pollLast());    // ab
        System.out.println("pop 데이터 : " + deque.pollLast());    // cd
        System.out.println("pop 데이터 : " + deque.pollLast());    // ef
        System.out.println("pop 데이터 : " + deque.pollLast());    // gh
        System.out.println("pop 데이터 : " + deque.pollLast());    // null
    }
}
