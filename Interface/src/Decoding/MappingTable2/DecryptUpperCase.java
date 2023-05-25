package Decoding.MappingTable2;

public class DecryptUpperCase implements Decryptable {

    // 인스턴스 멤버 클래스(MappingTable)의 정적 필드
    public static final int ALPHA = 26;

    public static final int DECRYPT_BY_MAPPING = 1;
    public static final int DECRYPT_BY_ASCII = 2;

    // 대문자 매핑테이블
    public class UpperMappingTable {

        private char[] encode;
        private char[] decode;
    
        // 기본 생성자
        public UpperMappingTable()
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
    UpperMappingTable mtable;
    String decData;

    // 기본 생성자
    public DecryptUpperCase()
    {
        mtable = new UpperMappingTable();
        decData = "";
    }

    // Getter
    public String getDecData()
    {
        return this.decData;
    }

    // 메소드 영역
    @Override
    public String decrypt(int select, String encData)
    {
        if (select == DECRYPT_BY_MAPPING)
        {
            decData = decryptByTable(encData);
            return getDecData();
        }
        else if(select == DECRYPT_BY_ASCII)
        {
            decData = decryptByASCII(encData);
            return getDecData();
        }
        else
        {
            return null;
        }
    }

    // 매핑테이블
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

    // 아스키코드
    public String decryptByASCII(String encData)
    {
        char encChar = 0;
        String decData = "";

        for (int i = 0; i < encData.length(); i++)
        {
            encChar = encData.charAt(i);

            if (encChar == 'A')
            {
                decData += 'Z';
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
