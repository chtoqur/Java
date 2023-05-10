public class Menu {
    
    public String[] menu;
    public int[] price;

    // 생성자는 객체를 초기화 하기위해 자동으로 호출되는 함수
    // 생성자는 클래스와 이름이 같고 리턴형이 없다.
    public Menu()
    {
        menu = new String[]{
            "아메리카노",
            "다방커피",
            "카페라떼",
            "에스프레소"
        };

        price = new int[]{
            4500,
            4000,
            5500,
            5000
        };
    }

}
