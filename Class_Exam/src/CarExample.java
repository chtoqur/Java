import transport.Car;

public class CarExample {
    public static void main(String[] args) {
        
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setModel("자가용");
        System.out.printf("car1.company : %s\ncar1.model : %s",
                        car1.getCompany(), car1.getModel());
        
        System.out.println();
        System.out.println();

        car2.setModel("자가용");
        car2.setColor("빨강");

        System.out.printf("car2.company : %s\ncar2.model : %s\ncar2.color : %s",
                        car2.getCompany(), car2.getModel(), car2.getColor());

        System.out.println();
        System.out.println();

        car3.setModel("택시");
        car3.setColor("검정");
        car3.setMaxSpeed(200);

        System.out.printf("car3.company : %s\ncar3.model : %s\ncar3.color : %s\ncar3.maxSpeed : %d",
                        car3.getCompany(), car3.getModel(), car3.getColor(), car3.getMaxSpeed());

    }
}
