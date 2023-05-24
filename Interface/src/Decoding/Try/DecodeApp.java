package Decoding.Try;

import java.util.Scanner;

public class DecodeApp {
    
    public static final int UPPER_CASE = 1;
    public static final int LOWER_CASE = 2;
    public static final int MIX_CASE = 3;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String userInputCode;
        int userInputNum;
        Boolean result;

        System.out.println("--------------------------------");
        System.out.println("암호데이터의 종류를 선택하세요.");
        System.out.println("--------------------------------");
        System.out.printf("1. 대문자 2. 소문자 3. 대소문자 혼합 > ");
        userInputNum = Integer.parseInt(scan.nextLine());
        
        if (userInputNum == UPPER_CASE)
        {
            // 대문자 - J BN B CPZA
            Decryptable program = new decryptUpperCase();
            System.out.printf("복호화 할 암호데이터를 입력하세요 > ");
            userInputCode = scan.nextLine();
            result = program.decryption(userInputCode);
            
            if (result == true)
            {
                // 클래스에만 존재하는 print 메서드 사용하기 위해 캐스팅
                // program이 원래 가지고 있던 참조값은 클래스를 가르키고 있기 때문에
                // 클래스형으로 캐스팅이 가능하다
                decryptUpperCase upperCase = null;
                upperCase = (decryptUpperCase)program;
                upperCase.print();
            }
            else if (result == false)
            {
                System.out.println("잘못된 암호입니다. 알파벳 대문자와 공백으로 이루어진 암호를 입력하세요.");
            }

        }
        else if (userInputNum == LOWER_CASE)
        {
            // 소문자 - j bn b cpza
            Decryptable program = new decryptLowerCase();
            System.out.printf("복호화 할 암호데이터를 입력하세요 > ");
            userInputCode = scan.nextLine();
            result = program.decryption(userInputCode);
            
            if (result == true)
            {
                decryptLowerCase lowerCase = null;
                lowerCase = (decryptLowerCase)program;
                lowerCase.print();
            }
            else if (result == false)
            {
                System.out.println("잘못된 암호입니다. 알파벳 소문자와 공백으로 이루어진 암호를 입력하세요.");
            }
        }

        else if (userInputNum == MIX_CASE)
        {
            // 대소문자 - J BN b cpza
            Decryptable program = new decryptMixedCase();
            System.out.printf("복호화 할 암호데이터를 입력하세요 > ");
            userInputCode = scan.nextLine();
            result = program.decryption(userInputCode);
            
            if (result == true)
            {
                decryptMixedCase mixCase = null;
                  = (decryptMixedCase)program;
                mixCase.print();
            }
            else if (result == false)
            {
                System.out.println("잘못된 암호입니다. 알파벳 소문자와 공백으로 이루어진 암호를 입력하세요.");
            }
        }

        else
        {
            System.out.println("잘못된 입력입니다. 1과 2중에 입력하세요.");
        }

    }
}
