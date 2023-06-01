package exam5;

public class Orange extends Plants implements Eatable  {

    public Orange()
    {

    }
    
    @Override
    public void eat()
    {
        System.out.println("오렌지를 먹습니다.");
    }
}
