package Quiz.no9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        // 최고 점수를 받은 아이디
        String name = null;
        // 최고 점수 스코어
        int maxScore = 0;
        // 점수 합계
        int totalScore = 0;

        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();

        int num;
        String str;
        
        while(iter.hasNext())
        {
            str = iter.next();
            num = map.get(str);
            
            if (num > maxScore)
            {
                maxScore = num;
                name = str;
            }
            totalScore = totalScore + num;
        }
        totalScore = totalScore / map.size();

        System.out.println("평균 점수: " + totalScore);
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
    }
}
