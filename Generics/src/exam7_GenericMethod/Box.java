package exam7_GenericMethod;

public class Box<T extends Number> {

    public Box()
    {

    }
    
    private T obj;

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
