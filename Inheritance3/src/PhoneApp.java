public class PhoneApp {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("model01", "black");
        // System.out.println(smartPhone.model);   // null
        smartPhone.model = "mmm";
        System.out.println(Phone.vendor);
        System.out.println(smartPhone.vendor);   // 삼성전자

        // smartPhone.ring1();

        // 상위 객체의 참조값으로 하위 객체를 참조할 수 있다.
        Phone phone = new SmartPhone();
        
        // 오버라이딩 된 경우 오버라이딩 된 함수가 호출된다.
        phone.ring(); 
    }
}