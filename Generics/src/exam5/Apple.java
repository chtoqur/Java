package exam5;

public class Apple extends Plants implements Eatable  {

    public Apple()
    {
        
    }
    
    @Override
    public void eat()
    {
        System.out.println("사과를 먹습니다.");
    }
}
