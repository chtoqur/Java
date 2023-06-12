package Map.exam1;

import java.util.HashMap;

public class Exam1_App {
    public static void main(String[] args) throws Exception {
        
        HashMap<Integer, String> map = new HashMap<>();

        // 집어넣기
        map.put(1, "정성훈");
        map.put(2, "이지우");
        map.put(3, "김동욱");
        map.put(4, "박지은");

        // 꺼내기
        System.out.println(map.get(3));
        System.out.println(map.get(4));

        // 지우기
        map.remove(1);
        System.out.println(map.get(1));     // null
    }
}
