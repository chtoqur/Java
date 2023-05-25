package Decoding.Try2;

import Decoding.Try.decryptLowerCase;

public class Resolve {
    
    // 대소문자 식별 클래스
    // 리졸브를 통해 DecryptUpperCase / DecryptLowerCase 호출

    private char[] code;
    private boolean result;
    private String decData;

    // 기본 생성자
    public Resolve()
    {
        code = null;
        result = false;
        decData = "";
    }

    // Getter
    public char[] getCode() {
        return this.code;
    }

    public boolean getResult() {
        return this.result;
    }

    public String getDecData() {
        return this.decData;
    }

    // 1. 계산(아스키 코드)으로 복호화();
    public String decryptByASCII(String encData)
    {
        // 대소문자 판별 메소드 실행
        result = isUpperCase(encData);

        // 대문자
        if (result == true)
        {
            DecryptUpperCase decryptor = new DecryptUpperCase();
            decData = decryptor.decryptByASCII(encData);
            return getDecData();
        }

        // 소문자
        DecryptLowerCase decryptor = new DecryptLowerCase();
        decData = decryptor.decryptByASCII(encData);
        return getDecData();
    }

    // 2. 매핑 테이블을 통해 복호화();
    public String decryptByTable(String encData)
    {
        // 대소문자 판별 메소드 실행
        result = isUpperCase(encData);

        // 대문자
        if (result == true)
        {
            DecryptUpperCase decryptor = new DecryptUpperCase();
            decData = decryptor.decryptByTable(encData);
            return getDecData();
        }

        // 소문자
        DecryptLowerCase decryptor = new DecryptLowerCase();
        decData = decryptor.decryptByTable(encData);
        return getDecData();
    }

    // 대소문자 식별 메소드
    public Boolean isUpperCase(String encData)
    {
        // encData를 char[]로 변환
        code = encData.toCharArray();

        for (int i = 0; i < code.length; i++)
        {
            // 알파벳인 경우에만 검사
            if (Character.isAlphabetic(code[i]))
            {
                if (Character.isUpperCase(code[i]))
                {
                    continue;
                }                   
                else if (Character.isLowerCase(code[i]))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public Boolean isLowerCase(String encData)
    {
        // encData를 char[]로 변환
        code = encData.toCharArray();

        for (int i = 0; i < code.length; i++)
        {
            // 알파벳인 경우에만 검사
            if (Character.isAlphabetic(code[i]))
            {
                if (Character.isLowerCase(code[i]))
                {
                    continue;
                }                   
                else if (Character.isUpperCase(code[i]))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
