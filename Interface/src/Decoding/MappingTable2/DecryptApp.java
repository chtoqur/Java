package Decoding.MappingTable2;

import java.util.Scanner;

public class DecryptApp {

    public static final int DECRYPT_BY_MAPPING_TABLE = 1;
    public static final int DECRYPT_BY_ASCII = 2;
    
    public static void main(String[] args) {

        String upperData = "J BN B CPZA";
        String lowerData = "j bn b cpza";
        String decodedData = "";
        String decodedData2 = "";

        Resolve resolve = new Resolve();
        
        // 암호문을 복호화 한다.
        decodedData = resolve.decryptByTable(upperData);
        decodedData2 = resolve.decryptByTable(lowerData);
        // decodedData = resolve.decryptByASCII(upperData);
        // decodedData2 = resolve.decryptByASCII(lowerData);

        // 결과를 출력한다.
        System.out.println(decodedData);
        System.out.println(decodedData2);

        Scanner scan = new Scanner(System.in);
        String userInputCode;
        int userInputNum;
        Boolean result;

        System.out.println("------------------------------------");
        System.out.println("암호데이터 복호화 방식을 선택하세요.");
        System.out.println("------------------------------------");
        System.out.printf("1. 매핑테이블 2. 계산(아스키코드) > ");
        userInputNum = Integer.parseInt(scan.nextLine());
        
        // 1. 매핑테이블
        if (userInputNum == DECRYPT_BY_MAPPING_TABLE)
        {
            // 대문자 - J BN B CPZA
            System.out.printf("복호화 할 암호데이터를 입력하세요 > ");
            userInputCode = scan.nextLine();
            resolve.decryptByTable(userInputCode);
            
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

        // 2. 계산(아스키코드)
        else if (userInputNum == DECRYPT_BY_ASCII)
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

        else
        {
            System.out.println("잘못된 입력입니다. 1과 2중에 입력하세요.");
        }
    }
}
