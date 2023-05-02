public class PrintString {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String str = "abc";

        // 1. 뒤의 값을 문자로 강제 캐스팅
        System.out.println("a값은 " + a);

        // 포맷 스트링 (형식을 지정할 수 있음)
        // 2. a가 첫번째 %d에, b가 두번째 %d에, c가 세번째 %s에 들어감
        System.out.printf("a값은 %x, b값은 %d, c값은 %s", a, b, str);

        // cf. %x = 16진수
    }
}
