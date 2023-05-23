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
        intCode = new int[code.length];

        for(int i = 0; i < code.length; i++)
        {
            if (intCode[i] == 97)
            {
                intCode[i] = 122;
            }

            intCode[i] = (int)code[i] - 1;
        }

        for (int i = 0; i < intCode.length; i++)
        {
            code[i] = (char)intCode[i];
        }

        System.out.println(String.valueOf(code));
        return true;
    }
}
