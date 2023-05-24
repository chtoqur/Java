package Decoding.Answer;

public class Decryptor {

    // 클래스를 소유하고 있는 것
    // 객체의 인스턴스를 필드로 가지고 있으면 됨
    Upper_MappingTable mtable;
    Lower_MappingTable mtable2;
    private char[] code;
    // MappingTable(인스턴스 멤버 클래스) 내부에 정적 필드 사용하지 말 것
    public static final int ALPHA = 26;
    
    // 생성자
    public Decryptor()
    {
        mtable = new Upper_MappingTable();
        mtable2 = new Lower_MappingTable();
    }
    
    public class MappingTable_UPPER implements Decryptable {
        
        private char[] upper_encode;    // 대문자 복호화전
        private char[] upper_decode;    // 대문자 복호화후
    
        public MappingTable_UPPER()
        {
            char c = 'A';
            upper_encode = new char[ALPHA];
            upper_decode = new char[ALPHA];

            // encode 배열 초기화
            for (int i = 0; i < upper_encode.length; i++) 
            {
                upper_encode[i] = c;
                c++;
            }
    
            // decode 배열 초기화
            upper_decode[0] = 'Z';
            c = 'A';

            for (int i = 1; i < upper_decode.length; i++) 
            {
                upper_decode[i] = c;
                c++;
            }
        }
    
        // 대문자 decoding
        public char decoding(char encChar)
        {
            char decChar = ' ';
            int index = -1;
    
            for (int i = 0; i < upper_encode.length; i++)
            {
                if (upper_encode[i] == encChar)
                {
                    index = i;
                    break;
                }
            }
    
            if (index != -1)
            {
                decChar = upper_encode[index];
            }
            return decChar;
        }

        @Override
        public char decryption(char encChar)
        {
            char decChar = ' ';
            int index = -1;
    
            for (int i = 0; i < upper_encode.length; i++)
            {
                if (upper_encode[i] == encChar)
                {
                    index = i;
                    break;
                }
    
            }
    
            if (index != -1)
            {
                decChar = upper_decode[index];
    
            }
    
            return decChar;
        }

    }

    public class MappingTable_LOWER implements Decryptable {
        
        private char[] lower_encode;    // 소문자 복호화전
        private char[] lower_decode;    // 대문자 복호화후

        public MappingTable_LOWER()
        {
            char c = 'a';

            lower_encode = new char[ALPHA];
            lower_decode = new char[ALPHA];
    
            // encode 배열 초기화
            for (int i = 0; i < lower_encode.length; i++) 
            {
                lower_encode[i] = c;
                c++;
            }
    
            // decode 배열 초기화
            lower_decode[0] = 'z';
            c = 'a';

            for (int i = 1; i < lower_decode.length; i++) 
            {
                lower_decode[i] = c;
                c++;
            }
        }

        @Override
        public char decryption(char encChar)
        {
            char decChar = ' ';
            int index = -1;
    
            for (int i = 0; i < lower_encode.length; i++)
            {
                if (lower_encode[i] == encChar)
                {
                    index = i;
                    break;
                }
    
            }
    
            if (index != -1)
            {
                decChar = lower_decode[index];
    
            }
            return decChar;
        }
    }

    // @Override
    public String decrypt2(String encData)
    {
        char encChar = 0;
        String decData = "";

        for(int i = 0; i < encData.length(); i++)
        {
            encChar = encData.charAt(i);

            decData += mtable.decoding(encChar);
        }
        return decData;
    }

    // 대소문자 구별 함수
    public boolean isUpperCase(String encData)
    {
        code = encData.toCharArray();
        for (int i = 0; i < code.length; i++)
        {
            if ((code[i] < 'A') || (code[i] > 'Z'))
            {
                return false;
            }
        }
        return true;
    } 
}