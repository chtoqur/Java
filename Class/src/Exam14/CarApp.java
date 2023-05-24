package Exam14;

public class CarApp {
    public static void main(String[] args) {
        
        Car car = new Car();
        car.run();

        System.out.println("---눈이 오네!!---");
        car.changeTire();
        car.run();
        
    }
}
