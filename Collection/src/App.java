import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        LinkedList<String> list3 = new LinkedList<>();
        
        list.add("김동욱");
        list.add("박지은");
        list.add("박연수");

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println("---- after remove ----");

        list.remove(0);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println("---- enhanced for문 ----");

        // enhanced for문
        for (String name : list)
        {
            System.out.println(name);
        }
    }
}
