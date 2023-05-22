public class SmartPhone extends Phone {

    public String model;
    
    public SmartPhone()
    {
        System.out.println("SmartPhone-Constructor");
    }

    public SmartPhone(String model, String color)
    {
        // 상위 클래스의 초기화, 즉 생성자를 명시적으로 호출
        super(model, color);
        System.out.println("SmartPhone-Overloading Constructor");
    }

    // 오버라이딩
    @Override
    public void ring()
    {
        System.out.println("Attention~~~~~");
    }
}
