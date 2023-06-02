package exam7_GenericMethod;

public class BoxApp {

    public static <T extends Number> void swapBox(Box<T> obj1, Box<T> obj2)
    {
        Box<T> tmpBox = BoxFactory.makeBox(null);
        tmpBox.set(obj1.get());
        obj1.set(obj2.get());
        obj2.set(tmpBox.get());
    }

    public static void swapBox2(int num, int num2)
    {
        int num3 = 0;
        num3 = num;
        num = num2;
        num2 = num3;

        System.out.println(num);
        System.out.println(num2);
    }

    public static void main(String[] args) throws Exception{
        
        Box<Integer> box1 = BoxFactory.makeBox(10);
        Box<Integer> box2 = BoxFactory.makeBox(20);

        System.out.println("box1 = " + box1);
        System.out.println("box2 = " + box2);

        // 두 객체를 바꿔주는 함수
        swapBox(box1, box2);
        System.out.println("box1 = " + box1);
        System.out.println("box2 = " + box2);

        int num = 10;
        int num2 = 20;
        swapBox2(num, num2);
        System.out.println(num);
        System.out.println(num2);

    }
}
