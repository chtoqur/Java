package exam4;

public class Box<T extends Eatable> {
    
    public T fruit;

    public Box()
    {
        fruit = null;
    }   

    public Box(T fruit)
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

    public void eatFruit()
    {
        fruit.eat();
    }

}
