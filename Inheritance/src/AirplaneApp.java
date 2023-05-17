public class AirplaneApp {
    public static void main(String[] args) {
        
        AirplaneSuperSonic as = new AirplaneSuperSonic();
        as.takeOff();
        as.fly();
        as.flyMode = AirplaneSuperSonic.SUPERSONIC;
        as.fly();
        as.flyMode = AirplaneSuperSonic.NORMAL;
        as.fly();
        as.land();
        
    }
}
