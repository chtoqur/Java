import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        
        // Calendar = 자바가 가지고 있는 날짜/시간 객체, 오직 한개만 존재함
        // getInstance() = 이미 기존의 존재하는 객체의 참조값을 가져옴
        //                 일반적으로 싱글톤 객체에 사용함

        Week today = null;

        // Calendar 얻기
        Calendar cal = Calendar.getInstance();

        // 오늘의 요일 얻기(일(1)~토(7))
        int week = cal.get(Calendar.DAY_OF_WEEK);

        // 숫자를 열거 상수로 변환해서 변수에 대입
        switch(week) {
            case 1 : today = Week.SUNDAY;
            break;
            case 2 : today = Week.MONDAY;
            break;
            case 3 : today = Week.TUESDAY;
            break;
            case 4 : today = Week.WEDNESDAY;
            break;
            case 5 : today = Week.THURSDAY;
            break;
            case 6 : today = Week.FRIDAY;
            break;
            case 7 : today = Week.SATURDAY;
            break;
        }

        // 열거 타입 변수를 사용
        if (today == Week.SUNDAY)
        {
            System.out.println("일요일에는 축구를 합니다.");
        }
        else
        {
            System.out.println("자바를 공부합니다.");
        }
    }
}
