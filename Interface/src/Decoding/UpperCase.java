package Decoding;

public class UpperCase implements CodeInterface {

    char[] code;
    int[] intCode;

    // 대문자
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
                // (예외) A인 경우 Z로 변환
                if (code[i] == 'A')
                {
                    code[i] = 'Z';
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
