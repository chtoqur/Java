package exam7_GenericMethod;

public class BoxFactory<T> {

    public BoxFactory()
    {

    }

    static int count;
    
    // 수정된 부분
    public static <T extends Number> Box<T> makeBox(T obj)
    {
        Box<T> box = new Box<>();
        box.set(obj);
        
        BoxFactory.count++;
        return box;
    }

    public int getCount()
    {
        return BoxFactory.count;
    }
}
