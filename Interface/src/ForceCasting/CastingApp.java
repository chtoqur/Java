package ForceCasting;

public class CastingApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare();    // 불가능
        
        Bus bus = null;
        bus = (Bus)vehicle;
        // 원래 이 참조값은 버스를 참조하는 참조값과 같은 값이기 때문에 가능함
        bus.checkFare();

    }
}
