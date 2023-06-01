package exam4;

public class Banana implements Eatable {
    
    @Override
    public String toString()
    {
        return "I am a Banana.";
    }

    @Override
    public void eat()
    {
        System.out.println("eating Banana");
    }
}
