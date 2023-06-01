package exam4;

public class Apple implements Eatable {
    
    @Override
    public String toString()
    {
        return "I am an Apple.";
    }

    @Override
    public void eat()
    {
        System.out.println("eating Apple");
    }
}
