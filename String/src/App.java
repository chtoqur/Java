public class App {
    public static void main(String[] args) throws Exception {

        String name1 = "이순신";
        String name2 = new String("이순신");
        
        System.out.println(name1);
        System.out.println(name2);

        // 두 개가 잡힌 메모리 위치, 참조값은 다름
        if (name1 == name2)
        {
            System.out.println("같다");
        }
        else
        {
            System.out.println("다르다");
        }
        
        String name3 = "이순신";

        if (name1 == name3)
        {
            System.out.println("같다");
        }

        String name4 = new String("이순신");
        
        if (name2 == name4)
        {
            System.out.println("같다");
        }
        else
        {
            System.out.println("다르다");
        }


        if(name1.equals(name2))
        {
            System.out.println("같다");
        }
        else
        {
            System.out.println("다르다");
        }

        System.out.println(name1.charAt(1));
        System.out.println(name1.length());
    }
}