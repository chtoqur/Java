package exam6_GenericMethod;

public class Box<T extends Number> {
    
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
