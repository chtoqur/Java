package exam12_5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class StringTest {

    public static void stringTest()
    {
        String orgMessage = "JAVA";
        byte[] arr1 = orgMessage.getBytes();
        String copyMessage = new String(arr1);
        System.out.println(copyMessage);    // JAVA
    }

    public static void stringBuilderTest()
    {
        // way1
        String data = new StringBuilder().append("DEF").toString();
        System.out.println(data);   // DEF

        // way2
        StringBuilder sb = new StringBuilder();
        sb = sb.append("DEF");
        String data2 = sb.toString();
        System.out.println(data2);  // DEF
    }

    public static void stringTokenTest()
    {
        // way1) split
        String data = "홍길동&이순신,유관순";
        String[] dataTokens = data.split("&|,");

        // way2) stringTokenizer
        StringTokenizer st = new StringTokenizer(data, "&|,");
        while(st.hasMoreTokens())
        {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
    
    public static void BoxingTest()
    {
        // 자바에서 제공하는 랩핑클래스(Wrapper)를 사용하면
        // 연산을 다양하고 편하게 사용할 수 있는 장점이 있다.

        // Boxing : 리터럴값을 래퍼에 저장하기 위한 문법
        Integer i = 10;

        // Unboxing : 래퍼안의 값을 프리미티브 타입에 저장하기 위한 문법
        int k = i;
        // System.out.println(k);
    }

    public static void DataFormatTest()
    {
        Date now = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));    // 2023-05-31

        System.out.println(now.getClass());     // class java.util.Date
    }
}
