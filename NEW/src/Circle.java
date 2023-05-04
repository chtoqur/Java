// 1. 클래스 이름 지정
public class Circle {
    
    // 2. Attribute 도출
    private double radius;
    private double pi;
    
    // 4. 생성자
    public Circle()
    {
        this.pi = 3.14;
        radius = 0;
    }

    public Circle(double radius)
    {
        this.pi = 3.14;
        this.radius = radius;
    }
    
    // 3. Getter/Setter 생성
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    // 5. 메소드 추가
    public double getCircum()
    {
        return 2 * radius * pi;
    }

    public double getSize()
    {
        return pi * radius * radius;
    }

}
