package Decoding.MappingTable;

public class DecryptApp {
    
    public static void main(String[] args) {

        String upperData = "J BN B CPZA";
        String lowerData = "j bn b cpza";
        String decodedData = "";
        String decodedData2 = "";

        Resolve resolve = new Resolve();
        
        // 암호문을 복호화 한다.
        decodedData = resolve.decryptByTable(upperData);
        decodedData2 = resolve.decryptByTable(lowerData);
        // decodedData = resolve.decryptByASCII(upperData);
        // decodedData2 = resolve.decryptByASCII(lowerData);

        // 결과를 출력한다.
        System.out.println(decodedData);
        System.out.println(decodedData2);


    }
}
