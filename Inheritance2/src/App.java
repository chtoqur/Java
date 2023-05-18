public class App {
    public static void main(String[] args) throws Exception {

        Child c1 = new Child();
        Parent p1 = new Parent();

        // Child 객체를 만들어서 Parent에 집어넣은 것
        Parent p2 = new Child();

        // Parent 객체를 만들어서 Child에 집어넣은 것
        // Child c2 = new Parent();

        c1.changeCar("newCar");



        // // 1. public 필드 ==> 접근 가능
        // ch.pub = 10;
        // System.out.println(ch.pub);

        // // 2. private 필드 ==> 접근 불가능
        // ch.pri = 10; // ==> error

        // // 3. protected 필드 ==> 접근 불가능
        // ch.pro = 10;

    }
}
