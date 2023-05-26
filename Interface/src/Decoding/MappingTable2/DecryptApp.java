package Decoding.MappingTable2;

import java.util.Scanner;

public class DecryptApp {

    public static final int DECRYPT_BY_MAPPING = 1;
    public static final int DECRYPT_BY_ASCII = 2;
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userInputCode;
        int userInputNum;
        Boolean result;
        String decData;

        System.out.println("------------------------------------");
        System.out.println("암호데이터 복호화 방식을 선택하세요.");
        System.out.println("------------------------------------");
        System.out.printf("1. 매핑테이블 2. 계산(아스키코드) > ");
        userInputNum = Integer.parseInt(scan.nextLine());
        
        // 1. 매핑테이블
        if (userInputNum == DECRYPT_BY_MAPPING)
        {
            // 대문자 - J BN B CPZA
            System.out.printf("복호화 할 암호데이터를 입력하세요 > ");
            userInputCode = scan.nextLine();
            result = CheckEncData.isAlphabetString(userInputCode);

            if (result == true)
            {
                // 대소문자 식별
                result = CheckEncData.isUpperCase(userInputCode);

                // 대문자-매핑테이블
                if (result == true)
                {
                    Decryptable decryption = new DecryptUpperCase();
                    decData = decryption.decrypt(userInputNum, userInputCode);
                    System.out.printf("result : %s\n", decData);
                }
                // 소문자-매핑테이블
                else if (result == false)
                {
                    Decryptable decryption = new DecryptLowerCase();
                    decData = decryption.decrypt(userInputNum, userInputCode);
                    System.out.printf("result : %s\n", decData);
                }
            }
            else if (result == false)
            {
                System.out.println("잘못된 입력입니다. 알파벳과 공백으로 이루어진 암호를 입력하세요.");
            }
        }

        // 2. 계산(아스키코드)
        else if (userInputNum == DECRYPT_BY_ASCII)
        {
            // 소문자 - j bn b cpza
            System.out.printf("복호화 할 암호데이터를 입력하세요 > ");
            userInputCode = scan.nextLine();
            result = CheckEncData.isAlphabetString(userInputCode);

            if (result == true)
            {
                // 대소문자 식별
                result = CheckEncData.isUpperCase(userInputCode);

                // 대문자-아스키코드
                if (result == true)
                {
                    Decryptable decryption = new DecryptUpperCase();
                    decData = decryption.decrypt(userInputNum, userInputCode);
                    System.out.printf("result : %s\n", decData);
                }
                // 소문자-아스키코드
                else if (result == false)
                {
                    Decryptable decryption = new DecryptLowerCase();
                    decData = decryption.decrypt(userInputNum, userInputCode);
                    System.out.printf("result : %s\n", decData);
                }
            }
            else if (result == false)
            {
                System.out.println("잘못된 입력입니다. 알파벳과 공백으로 이루어진 암호를 입력하세요.");
            }
        }
        else
        {
            System.out.println("잘못된 입력입니다. 1과 2중에 입력하세요.");
        }
    }
}
