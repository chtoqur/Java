public class Array {
    public static void main(String[] args) throws Exception {
        
        // 정석코드
        // str = 참조값
        String str = new String("abc");

        // 슈가코드
        String b = "bbb";

        // strArray = 참조배열
        String[] strArray = new String[] {
            "이지우",
            "나쥰식",
            "최이서",
            "나왕돈",
            "연홍시"
        };

        for (String name : strArray)
        {
            System.out.println(name);
        }

        System.out.println("---------------");
        
        for (int i = 0; i < strArray.length; i++)
        {
            System.out.println(strArray[i]);
        }

    }
}
