package List.quiz1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import java.util.Iterator;

public class QuizApp {
    public static void main(String[] args) throws Exception {
        
        // List에 집어넣고 출력하는 프로그램
        int[] data = {10, 20, 100, 54, 34, 0};

        // 리스트에 추가
        List<Integer> list = new LinkedList<>();
        
        for (int i = 0; i < data.length; i++)
        {
            list.add(data[i]);
        }
        
        // 리스트에 출력
        for (int num : list)
        {
            System.out.printf("%d ", num);
        }

        System.out.println();
        System.out.println("------ way2 ------");

        // 주의
        // primitive type은 불가능한 방법
        Integer[] data2 = {10, 20, 100, 54, 34, 0};

        // List 생성
        List<Integer> list2 = Arrays.asList(data2);

        for (int i = 0; i < list2.size(); i++)
        {
            System.out.printf("%d ", list2.get(i));
        }

        System.out.println();
        System.out.println("------------------");

        String[] data3 = {"ab", "cd", "ef"};
        List<String> list3 = Arrays.asList(data3);

        for (int i = 0; i < list3.size(); i++)
        {
            System.out.printf("%s ", list3.get(i));
        }

        System.out.println();
        System.out.println("-----Iterator-----");

        // 1. 반복자를 만든다.
        //    반복자는 해당 자료구조에 iterator() 메소드를 호출하여 얻는다.
        Iterator<Integer> iter = list.iterator();
        
        // 2. 반복자를 이용해서 데이터를 가지고 온다.
        while(iter.hasNext())
        {
            Integer ii = iter.next();
            System.out.println(ii);
        }

        Iterator<String> iter2 = list3.iterator();
        while(iter2.hasNext())
        {
            String ii = iter2.next();
            System.out.println(ii);
        }
    }
}
