package Decoding;

import java.util.Scanner;

public class DecodeApp {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String userInputCode;
        int userInputNum;

        System.out.printf("암호데이터의 종류를 선택하세요.\n1. 대문자 2. 소문자 > ");
        userInputNum = Integer.parseInt(scan.nextLine());
        
        if (userInputNum == 1)
        {
            // 대문자
            CodeInterface program = new UpperCase();
            System.out.printf("복호화 할 암호데이터를 입력하세요 > ");
            userInputCode = scan.nextLine();
            program.decode(userInputCode);
        }
        else if (userInputNum == 2)
        {
            // 소문자
        }
        else
        {
            System.out.println("잘못된 입력입니다. 1과 2중에 입력하세요.");
        }

    }
}
