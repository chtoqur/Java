package exam3;

public class LambdaApp {
    public static void main(String[] args) {
        
        // 사람이 컴퓨터를 이용하여 두 수를 더하려고 하는 코드

        // 1. 주변정황을 이용해서 추론 후 람다식을 이용,
        //    임시객체를 만들어내는 방법
        Person p1 = new Person();
        // Calcuable 인터페이스를 참조해서 추론
        Calcuable cal1 = (a, b) -> { return Computer.calcAdd(a, b); };
        p1.action(cal1);

        // 2. 정적 메소드의 메소드 참조
        //    우항(Computer 클래스 내부의 calcAdd 함수)으로 가면
        //    (구현된)추상메서드를 대신하여 사용할 수 있는 별도의 메서드가 존재
        //    이 메서드를 통해 Calcuable 인터페이스를 구현한 임시객체를 만들 수 있음
        Calcuable cal2 = Computer :: calcAdd;
        p1.action(cal2);

        // 3. 인스턴스 메소드의 메소드 참조
        //    com 객체의 calcMul()를 참고해서 임시객체를 만들 수 있음
        Computer com = new Computer();
        p1.action(com::calcMul);
        // 아래와 동일한 코드
        p1.action(new Computer()::calcMul);
        
        
    }
}
