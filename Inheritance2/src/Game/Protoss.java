package Game;

public class Protoss extends Unit {

    @Override
    public void attack()
    {
        System.out.println("공격 : 칼로 베기");
    }

    public void move(int speed)
    {
        System.out.printf("달리기 속도 : %d\n", speed * 2);
    }
}
