package Decoding.Try2;

public interface Decryptable 
{
    // 1. 계산(아스키 코드)으로 복호화();
    String decryptByASCII(String encData);

    // 2. 매핑 테이블을 통해 복호화();
    String decryptByTable(String encData);

    // 복호화 메서드
    // String decrypt(String encData);
}
