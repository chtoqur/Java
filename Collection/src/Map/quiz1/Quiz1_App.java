package Map.quiz1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Quiz1_App {
    public static void main(String[] args) {
        
        // Student 번호(int), 이름으로 구성된 key-value가 존재
        // 이를 map자료구조에 5개 넣고
        // 이를 iterator로 순회하는 코드를 작성해보세요.

        Map<Integer, String> map = new HashMap<>();

        // 번호, 이름
        map.put(0001, "정성훈");
        map.put(0002, "이지우");
        map.put(0003, "김동욱");
        map.put(0004, "박지은");
        map.put(0005, "박연수");

        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iter = keySet.iterator();
        
        int k;

        while(iter.hasNext())
        {
            k = iter.next();
            System.out.printf("key : %d, value : %s\n", k, map.get(k));
        }
    }
}
