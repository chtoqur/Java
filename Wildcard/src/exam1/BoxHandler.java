package exam1;

public class BoxHandler {

    
    // box의 내용물을 확인하는 함수
    public static void popBox(Box<? extends Toy> box)
    {
        // popBox는 read-only, box를 읽을 뿐 건드리지는 않음
        Toy t = box.get();
        System.out.println(t);

        // box.set(new Toy()); ==> error
    }

    public static void pushBox(Box<? super Toy> box, Toy t)
    {
        box.set(t);
    }

    public static void pushBox(Box<? super RobotToy> box, RobotToy t)
    {
        box.set(t);
    }
}

// System.out.println(box.get());