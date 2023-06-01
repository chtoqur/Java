package exam2;

public class Box<T> {
    
    private T fruit;

    public void set(T fruit)
    {
        this.fruit = fruit;
    }

    public T get()
    {
        return fruit;
    }
}
