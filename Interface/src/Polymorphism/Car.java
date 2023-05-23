package Polymorphism;

public class Car {
    
    // Tire tire1 = new HankookTire();
    // Tire tire2 = new HankookTire();
    
    public Tire tire;
    public Tire tire2;

    public Car()
    {
        tire = new HankookTire();
        tire2 = new HankookTire();
    }

    void run()
    {
        tire.roll();
        tire2.roll();
    }
}
