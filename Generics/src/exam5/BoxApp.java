package exam5;
public class BoxApp {
    public static void main(String[] args) throws Exception {

        Box<Apple> aBox = new Box<>(new Apple());
        aBox.eatPlants();
        aBox.makeEnergy();
        aBox.wateringPlants();

        Box<Orange> oBox = new Box<>(new Orange());
        oBox.eatPlants();
        oBox.makeEnergy();
        oBox.wateringPlants();

        // Eatable을 구현하지 않은 Mushroom은 상속 불가
        // Box<Mushroom> mBox = new Box<>(new Mushroom());
    }
}
