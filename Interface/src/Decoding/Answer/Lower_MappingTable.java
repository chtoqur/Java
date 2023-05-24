package Decoding.Answer;

public class Lower_MappingTable implements Decryptable  {

    public static final int ALPHA = 26;
    private char[] encode;
    private char[] decode;


    private class 소문자매핑테이블
    {

    }

    소문자 매핑테이블 객체
    
    @Override
    계산으로복호화하기()
    {


    }

    @Override
    테이블로복호화하기()
    {


    }


    @Override
    public String decryption(String encData)
    {
        return encData;
    }

    public Lower_MappingTable()
    {
        char c = 'a';
        encode = new char[ALPHA];
        decode = new char[ALPHA];

        // encode 배열 초기화
        for (int i = 0; i < encode.length; i++)
        {
            encode[i] = c;
            c++;
        }

        // decode 배열 초기화
        decode[0] = 'z';
        c = 'a';
        for (int i = 1; i < decode.length; i++)
        {
            decode[i] = c;
            c++;
        }
    }

    public char decryption(char encChar)
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
