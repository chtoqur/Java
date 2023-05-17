public class InheritApp {
    public static void main(String[] args) throws Exception {

        Child ch = new Child();

        System.out.println(ch.parentMoney);     // 1000
        System.out.println(ch.childMoney);      // 100

    }
}
