package typing.exam13_2.rent;

public class HomeAgency implements Rentable<Home> {
    
    @Override
    public Home rent()
    {
        return new Home();
    }
}
