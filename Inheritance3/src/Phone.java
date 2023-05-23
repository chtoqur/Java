public class Phone {

    public static String vendor = "삼성전자";
    public String model;    // 모델명
    public String color;    // 색상

    public Phone()
    {
        System.out.println("Phone-Constructor");
    }

    public Phone(String model, String color)
    {
        this.model = model;
        this.color = color;
        System.out.println("Phone-Overloading Constructor");
    }

    public void ring()
    {
        System.out.println("따르릉 따르릉~");
    }
}
