package Map.exam2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exam2 {
    public static void main(String[] args) throws Exception {
        
        Map<String, String> map = new HashMap<>();

        // ID, 이름
        // 집어넣기
        map.put("jsh", "정성훈");
        map.put("ljw", "이지우");
        map.put("kdw", "김동욱");

        Set<String> keySet = map.keySet();
        
        for (String key : keySet)
        {
            System.out.printf("Key : %s, Value : %s\n", key, map.get(key));
        }

        
    }
}
