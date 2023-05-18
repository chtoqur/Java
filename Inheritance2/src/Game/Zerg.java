package Game;

public class Zerg extends Unit {
    
    @Override
    public void attack()
    {
        System.out.println("공격 : 침뱉기");
    }

    public void move(int speed)
    {
        System.out.printf("걷기 속도 : %d\n", speed + 1);
    }

}
