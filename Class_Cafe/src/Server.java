public class Server {

    private Menu menu;
    private int menuNumber;

    // 생성자
    public Server()
    {
        menuNumber = -1;
    }

    public int getMenuNumber()
    {
        return this.menuNumber;
    }

    public void setMenu(Menu menu)
    {
        this.menu = menu;
    }

    public void showMenuAll()
    {
        for(int i = 0; i < menu.menu.length; i++)
        {
            System.out.printf("%s, %d\n",
                                menu.menu[i],
                                menu.price[i]);
        }
    }

    public boolean order(String menuName)
    {
        int orderNum = -1;
        for (int i = 0; i < menu.menu.length; i++)
        {
            if (menuName.equals(menu.menu[i]))
            {
                orderNum = i;
            }
        }

        // 정상적인 오더가 들어왔는지 확인
        if (orderNum == -1)
        {
            return false;
        }
        else
        {
            menuNumber = orderNum;
            return true;
        }
    }

    public void Serving (Coffee orderdCoffee)
    {
        System.out.printf("커피 나왔습니다. %d\n", orderdCoffee.shot);
    }
}
