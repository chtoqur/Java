package Decoding.Answer;

public class Upper_MappingTable implements Decryptable  {

    public static final int ALPHA = 26;
    private char[] encode;
    private char[] decode;


    public Upper_MappingTable()
    {
        char c = 'A';
        encode = new char[ALPHA];
        decode = new char[ALPHA];

        // encode 배열 초기화
        for (int i = 0; i < encode.length; i++)
        {
            encode[i] = c;
            c++;
        }

        // decode 배열 초기화
        decode[0] = 'Z';
        c = 'A';
        for (int i = 1; i < decode.length; i++)
        {
            decode[i] = c;
            c++;
        }
    }

    public String decryption(char encChar)
    {
        char decChar = ' ';
        int index = -1;

        for (int i = 0; i < encode.length; i++)
        {
            if(encode[i] == encChar)
            {
                index = i;
                break;
            }
        }

        // 공백 리턴
        if (index != -1)
        {
            decChar = decode[index];
        }

        return decChar;
    }
}
