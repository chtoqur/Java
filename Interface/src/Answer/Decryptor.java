package Answer;

public class Decryptor {

    MappingTable mtable;

    public Decryptor()
    {
        mtable = new MappingTable();

    }

    public String decrypt2(String encData)
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

    public String decrypt1(String encData)
    {
        //암호문    : J BN B CPZA 
        //평문      : I AM A BOYZ
        // char는 영문자의 경우 ASCII코드를 기반으로 한다.
        // 따라서
        // A    --> Z
        // ' '  --> ' '
        // B~Z  --> -1

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
