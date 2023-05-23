package Decoding;

public class LowerCase implements CodeInterface {
    
    char[] code;
    int[] intCode;

    // 소문자
    @Override
    public boolean decode(String text)
    {
        // String을 char[]로 변환
        code = text.toCharArray();

        for(int i = 0; i < code.length; i++)
        {
            // 알파벳인 경우만 복호화, 공백 제외
            if(Character.isAlphabetic(code[i]))
            {
                // (예외) a인 경우 a로 변환
                if (code[i] == 'a')
                {
                    code[i] = 'z';
                }
                code[i]--;
            }
        }
        return true;
    }

    public boolean print()
    {
        String decodedText;
        decodedText = new String(code);
        System.out.println(decodedText);
        return true;
    }
}
