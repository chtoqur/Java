package typing.exam13_2.rent;

public class CarAgency implements Rentable<Car> {
    
    @Override
    public Car rent()
    {
        return new Car();
    }
}
