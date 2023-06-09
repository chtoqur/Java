package List;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionApp2 {
    public static void main(String[] args) {
        
        // int가 아닌 래퍼클래스 Integer를 써야함
        LinkedList<Integer> list = new LinkedList<>();

        // 오토박싱(캐스팅)됨 = 객체 안에 필드를 집어넣는 것
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int val;

        // 초기화 후 다음 요소가 있는지 확인
        for (Iterator<Integer> iter = list.iterator(); iter.hasNext();)
        {
            val = iter.next();
            System.out.println(val);
        }

        System.out.println("--------------------");

        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
}
