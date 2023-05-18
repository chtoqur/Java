package Game;
public class Terran extends Unit {
    
    @Override
    public void attack()
    {
        System.out.println("공격 : 총쏘기");
    }

    public void move(int speed)
    {
        System.out.printf("걷기 속도 : %d\n", speed);
    }

}
