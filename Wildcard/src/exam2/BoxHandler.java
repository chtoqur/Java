package exam2;

public class BoxHandler {
    
    // 와일드카드의 개념을 적용
    // extends를 써서 set을 못하게!

    public static <T> void moveBox(Box<? super T> box1, Box<? extends T> box2)
    {
        box1.set(box2.get());
    }

    public static <T> void checkBox(Box<? extends T> box)
    {
        T t = box.get();
        System.out.println(t);
    }

    public static <T> void inBox(Box<? super T> box, T obj)
    {
        box.set(obj);
    }
}