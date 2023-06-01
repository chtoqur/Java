package exam4;

import exam5.Plants;

public class Box3<T extends Number & Plants> {
    
    public T fruit;

    public Box3()
    {
        fruit = null;
    }   

    public Box3(T fruit)
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
