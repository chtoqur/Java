public class SubStringExample {
    public static void main(String[] args) throws Exception {

        // substring은 원본 데이터를 건드리는 것이 아님
        // 원본 데이터와 분리된 곳에 복사되어 위치함

        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0,6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}
