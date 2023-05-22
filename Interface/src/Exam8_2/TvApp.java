package Exam8_2;

public class TvApp {
    public static void main(String[] args) {
        
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();    // TV를 켭니다.
        rc.setVolume(15);   // 최대 볼륨 10으로 강제 설정
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        // rc = new Audio();
        // rc.turnOn();    // Audio를 켭니다.
        // rc.setVolume(5);
        // rc.turnOff();

        // System.out.println("리모콘 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
        // System.out.println("리모콘 최소 볼륨 : " + RemoteControl.MIN_VOLUME);

    }
}
