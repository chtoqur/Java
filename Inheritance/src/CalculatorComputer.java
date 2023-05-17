public class CalculatorComputer extends Calculator {
    
    @Override
    public double areaCircle(double r)
    {
        System.out.println("Computer 객체의 오버라이딩 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
