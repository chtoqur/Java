package exam5;

public class Box <T extends Plants & Eatable> {
    
    public T plant;

    public Box()
    {
    }

    public Box(T plant)
    {
        this.plant = plant;
    }

    public T getPlant()
    {
        return this.plant;
    }

    public void set(T plant)
    {
        this.plant = plant;
    }

    // 상속 메서드
    public void wateringPlants()
    {
        plant.watering();
    }

    // 인터페이스 구현 메서드
    public void eatPlants()
    {
        plant.eat();
    }

    public void makeEnergy()
    {
        System.out.printf("make energy : %d\n", plant.getEnergy());
    }
}
