package Quiz;

public class PeopleApp {
    public static void main(String[] args) {
        
        // People ppApp;
        // ppApp = new Work();

        // ppApp.addPeople("이서", "문예창작", "1111-2222");
        // ppApp.addPeople("홍시", "국문학", "3333-4444");
        // ppApp.print();

        Friend[] Friends = new Friend[Friend.MAX];

        Friends[0] = new Colleage("홍길동", "컴퓨터공학", "1111-1111");
        Friends[1] = new Colleage("김길동", "경영학", "3111-1111");
        Friends[2] = new Colleage("최길동", "영문학", "2111-1111");
        Friends[3] = new Colleage("신길동", "컴퓨터공학", "1111-1111");
        Friends[4] = new Colleage("박길동", "컴퓨터공학", "1111-1111");
        Friends[5] = new Work("홍길", "컴퓨터공학", "1111-1111");
        Friends[6] = new Work("김길", "경영학", "3111-1111");
        Friends[7] = new Work("최길", "영문학", "2111-1111");
        Friends[8] = new Work("신길", "컴퓨터공학", "1111-1111");
        Friends[9] = new Work("박길", "컴퓨터공학", "1111-1111");

        for (int i = 0; i < Friends.length; i++)
        {
            Friends[i].show();
        }

    }
}
