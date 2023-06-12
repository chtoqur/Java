package Map.exam1;

import java.util.HashMap;

public class Exam2 {
    public static void main(String[] args) throws Exception {
        
        HashMap<String, String> map = new HashMap<>();

        // ID, 이름
        // 집어넣기
        map.put("jsh", "정성훈");
        map.put("ljw", "이지우");
        map.put("kdw", "김동욱");

        // 꺼내기
        // way1 : key-value 형식으로 꺼내기
        System.out.println(map.entrySet());

        System.out.println("---------------");

        // way2
        System.out.println(map.get("jsh"));
        System.out.println(map.get("ljw"));
        System.out.println(map.get("kdw"));

        // 지우기
        // map.remove(1);
        // System.out.println(map.get(1));     // null
    }
}
