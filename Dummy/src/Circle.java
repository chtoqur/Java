public class Circle {
    
    final public static double pi = 3.14;
    final public int MAX = 10;
    public double radius;

    // public double getSize()
    // {
    //     for (int i = 0; i < MAX; i++)
    //     {
    //         // 코드
    //     }
    //     return radius * radius * 2;
    // }

    // static method
    // 원래 함수는 instruction의 집합

    public static double getCircum()
    {
        return 0;
    }

    public double getSize()
    {
        return ppow(radius) * Circle.pi;
    }

    private double ppow(double val)
    {
        return val * val;
    }
}
