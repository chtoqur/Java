package exam4;

public class Box2<T extends Number> {
    
    public T fruit;

    public Box2()
    {
        fruit = null;
    }   

    public Box2(T fruit)
    {
        this.fruit = fruit;
    }

    @Override
    public String toString()
    {
        return fruit.toString();
    }

    public T getfruit() {
        return this.fruit;
    }

    public void set(T fruit) {
        this.fruit = fruit;
    }

    public int getIntValue()
    {
        return fruit.intValue();
    }

}
