package Decoding.MappingTable;

import Decoding.Try.decryptLowerCase;

public class Resolve implements Decryptable {
    
    // 대소문자 식별 클래스
    // 리졸브를 통해 DecryptUpperCase / DecryptLowerCase로 전달

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
    @Override
    public String decryptByASCII(String encData)
    {
        result = isUpperCase(encData);

        if (result == true)
        {
            DecryptUpperCase decryptor = new DecryptUpperCase();
            decData = decryptor.decryptByASCII(encData);
            return getDecData();
        }

        DecryptLowerCase decryptor = new DecryptLowerCase();
        decData = decryptor.decryptByASCII(encData);
        return getDecData();
    }

    // 2. 매핑 테이블을 통해 복호화();
    @Override
    public String decryptByTable(String encData)
    {
        result = isUpperCase(encData);

        if (result == true)
        {
            DecryptUpperCase decryptor = new DecryptUpperCase();
            decData = decryptor.decryptByTable(encData);
            return getDecData();
        }

        DecryptLowerCase decryptor = new DecryptLowerCase();
        decData = decryptor.decryptByTable(encData);
        return getDecData();
    }

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
