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
        intCode = new int[code.length];

        for(int i = 0; i < code.length; i++)
        {
            if (intCode[i] == 65)
            {
                intCode[i] = 90;
            }

            intCode[i] = (int)code[i] - 1;
        }

        return true;
    }
}
