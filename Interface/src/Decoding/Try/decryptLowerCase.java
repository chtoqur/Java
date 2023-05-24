package Decoding.Try;

// 소문자
public class decryptLowerCase implements Decryptable {
    
    private char[] code;
    String decodedText;

    public decryptLowerCase()
    {
        code = null;
        decodedText = "";
    }

    // Getter
    public char[] getCode() {
        return this.code;
    }

    // Getter
    public String getDecodedText() {
        return this.decodedText;
    }

    // 오버라이딩 메소드
    @Override
    public boolean decryption(String text)
    {
        // String을 char[]로 변환
        code = text.toCharArray();
        
        if((code.length == 0) || (code == null))
        {
            return false;
        }

        for(int i = 0; i < code.length; i++)
        {
            // 알파벳인 경우만 복호화, 공백 제외
            if(Character.isAlphabetic(code[i]))
            {
                // (예외) A인 경우 Z로 변환
                if (code[i] == 'a')
                {
                    code[i] = 'z';
                }
                else if ((code[i] < 'a') || (code[i] > 'z'))
                {
                    return false;
                }
                else
                {
                    code[i]--;
                }
            }
        }
        return true;
    }

    public boolean print()
    {
        decodedText = new String(getCode());
        System.out.println(decodedText);
        return true;
    }
}
