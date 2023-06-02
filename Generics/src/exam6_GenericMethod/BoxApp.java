package exam6_GenericMethod;

public class BoxApp {
    public static void main(String[] args) throws Exception{
        
        // Box<String> box = BoxFactory.makeBox(new String("abc"));
        Box<Integer> box2 = BoxFactory.makeBox(123);
        System.out.println(box2);

        System.out.println("---------------------");
        
        // 임시변수를 선언하지 않으면 makeBox에서 사용하는
        // T가 어떤 타입인지 알 수 없음 ==> 슈가코드
        // BoxFactory.makeBox(new String("abc"));
        // 원본코드
        // BoxFactory.<String>makeBox(new String("abc"));

        // 임시변수를 선언하지 않아도 상관없음
        // int a = add(4, 5);
        // add(4, 5);
    }
}
