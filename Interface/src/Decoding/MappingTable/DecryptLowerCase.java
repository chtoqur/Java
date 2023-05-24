package Decoding.MappingTable;

public class DecryptLowerCase implements Decryptable {

    // 정적 필드는 인스턴스 멤버 클래스(MappingTable) 내부에 사용하지 말 것
    public static final int ALPHA = 26;
    
    // 소문자 매핑테이블
    public class MappingTable {

        private char[] encode;
        private char[] decode;
    
        // 기본 생성자
        public MappingTable()
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
    
        public char decoding(char encChar)
        {
            char decChar = ' ';
            int index = -1;
    
            for (int i = 0; i < encode.length; i++)
            {
                if (encode[i] == encChar)
                {
                    index = i;
                    break;
                }
            }
    
            if (index != -1)
            {
                decChar = decode[index];
            }
            return decChar;
        }
    }   // MappingTable Class end

    // 필드 영역
    MappingTable mtable;

    // 기본 생성자
    public DecryptLowerCase()
    {
        mtable = new MappingTable();
    }

    // 메소드 영역
    @Override
    public String decryptByTable(String encData)
    {
        char encChar = 0;        
        String decData = "";

        for (int i = 0; i < encData.length(); i++)
        {
            encChar = encData.charAt(i);

            //매핑테이블에서 찾는다.
            decData += mtable.decoding(encChar);
        }

        return decData;
    }

    @Override
    public String decryptByASCII(String encData)
    {
        char encChar = 0;
        String decData = "";

        for (int i = 0; i < encData.length(); i++)
        {
            encChar = encData.charAt(i);

            if (encChar == 'a')
            {
                decData += 'z';
            }
            else if (encChar == ' ')
            {
                decData += ' ';
            }
            else
            {
                //decData = decData + (char)(encChar - 1);
                decData = decData + (--encChar);
            }
        }
        return decData;
    }
}
