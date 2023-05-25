package Decoding.MappingTable2;

public class DistinguishCase {

    public DistinguishCase()
    {}
    
    // 올바른 알파벳 문자열인지 확인
    public static Boolean isAlphabetString(String encData)
    {
        char[] code;
        code = encData.toCharArray();

        if((code.length == 0) || (code == null))
        {
            return false;
        }

        for (int i = 0; i < code.length; i++)
        {
            if (Character.isAlphabetic(code[i]))
            {
                // 'A'(65)보다 작거나, 'z'(122)보다 클 때
                if ((code[i] < (char)65) || (code[i] > (char)122))
                {
                    return false;
                }
                // 'Z'(90)-'a'(97) 사이의 값일 때 = 알파벳X
                else if((code[i] > (char)90) && (code[i] < (char)97))
                {
                    return false;
                }
            }
        }
        return true;
    }

    // 대문자/소문자 문자열 식별
    public static Boolean isUpperCase(String encData)
    {
        char[] code;
        code = encData.toCharArray();

        for (int i = 0; i < code.length; i++)
        {
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


}
