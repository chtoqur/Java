package Polymorphism2;

public class Taxi implements Vehicle {
    
    @Override
    public void run()
    {
        System.out.println("택시가 달립니다.");
    }

    public void check()
    {
        System.out.println("손님이 내렸는지 확인");
    }
}
