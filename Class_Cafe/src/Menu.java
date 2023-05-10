public class Menu {

    public String[] menu;
    public int[] price;

    // 메뉴를 초기화하는 생성자
    // 생성자 : 객체화할 때 객체를 초기화 하기 위한
    //          특별한 함수 (자동으로 호출됨)
    //          클래스와 이름이 같고 리턴형이 없다.

    public Menu()
    {
        menu = new String[]{
            "아메리카노",
            "카페라떼",
            "에스프레소"
        };

        price = new int[]{
            4500,
            5000,
            5500
        };
    }


}
