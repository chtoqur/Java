import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // 데이터를 사용자로부터 입력받는다.

        // heap에 scanner라는 객체를 만들어서 참조값을 받아오는 것
        // [System.in = 키보드]를 scan하는 객체를 heap에 생성
        Scanner scan = new Scanner(System.in);

        // int inputValue = scan.nextInt();
        // nextLIne = enter키 입력까지의 한 줄을 받아오는 것
        String inputStr = scan.nextLine();

        // System.out.println("input value = " + inputValue);
        System.out.println("input string = " + inputStr);
        
        // 읽어온 문자열을 숫자로 변환한다.
        int val = Integer.parseInt(inputStr);
        
        // 100을 더한 후 출력해준다.
        val = val + 100;
        System.out.println(val);
    }
}
