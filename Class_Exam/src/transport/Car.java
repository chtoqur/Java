package transport;
public class Car {
    
    private String company;
    private String model;
    private String color;
    private int maxSpeed;

    public Car()
    {
        company = "현대자동차";
        model = "";
        color = "";
        maxSpeed = 0;
    }

    public Car(String model, String color, int maxSpeed)
    {
        this.company = "현대자동차";
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getCompany()
    {
        return this.company;
    }

    public void setModel(String model)
    {
        this.model = model;
    }
    
    public String getModel()
    {
        return this.model;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    
    public String getColor()
    {
        return this.color;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
    
    public int getMaxSpeed()
    {
        return this.maxSpeed;
    }

}
