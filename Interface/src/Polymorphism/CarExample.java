package Polymorphism;

public class CarExample {
    public static void main(String[] args) {
        
        Car myCar = new Car();
        myCar.run();

        // 외부에서 객체를 만들어서 그냥 집어넣어버리는 것
        myCar.tire = new KumhoTire();
        myCar.tire2 = new KumhoTire();
        myCar.run();

    }
}