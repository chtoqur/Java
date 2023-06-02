package exam8_Inheritance;

public class Box<T> {
    
    // 같은 패키지로 제한
    protected T obj;

    public Box()
    {

    }

    public Box(T obj)
    {
        this.obj = obj;
    }

    public void set(T obj)
    {
        this.obj = obj;
    }

    public T get()
    {
        return obj;
    }

    @Override
    public String toString()
    {
        return obj.toString();
    }
}
