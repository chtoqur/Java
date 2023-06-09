package Set.exam3;

import java.util.Objects;

public class Student {
    
    private String name;        // 이름
    private String address;     // 주소
    private int    number;      // 번호
    private String staff;       // 반장("leader"), 스탭("staff")... 일반학생은 ""
    
    @Override
    public int hashCode()
    {
        // way1
        return (name.hashCode() + address.hashCode()) % 5;

        // way2
        // 적은 양의 데이터를 처리하는 경우 사용 가능한 방법
        // return Objects.hash(name, address);
    }
}
