public class SmartPhoneExample {
    public static void main(String[] args) {
        
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
        // 부모 클래스 속성
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);
        // // 자식 클래스 속성
        // System.out.println("와이파이 상태 : " + myPhone.wifi);

        // myPhone.bell();
        // myPhone.sendVoice("여보세요");
        // myPhone.receiveVoice("전화 잘못걸었습니다.");
        // myPhone.sendVoice("끊겠습니다.");
        // myPhone.hangUp();

        // myPhone.setWifi(true);
        // myPhone.internet();
    }
}
