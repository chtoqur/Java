package Decoding.Try;

// 대문자
public class decryptMixedCase implements Decryptable {
    
    private char[] code;
    String decodedText;

    public decryptMixedCase()
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

    // 인터페이스 메소드 오버라이딩
    @Override
    public boolean decryption(String text)
    {
        // String을 char[]로 변환
        code = text.toCharArray();

        // 아무것도 입력되지 않은 경우
        if((code.length == 0) || (code == null))
        {
            return false;
        }

        for(int i = 0; i < code.length; i++)
        {
            // 알파벳인 경우만 복호화, 공백 제외
            if(Character.isAlphabetic(code[i]))
            {
                if ((code[i] >= 'A') && (code[i] <= 'Z'))
                {
                    if (code[i] == 'A')
                    {
                        code[i] = 'Z';
                    }
                    else
                    {
                        code[i]--;
                    }
                }

                else if ((code[i] >= 'a') && (code[i] <= 'z'))
                {
                    if (code[i] == 'a')
                    {
                        code[i] = 'z';
                    }
                    else
                    {
                        code[i]--;
                    }
                }

                else if ((code[i] < 'A') || (code[i] > 'Z') || (code[i] < 'a') || (code[i] > 'z'))
                {
                    return false;
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
