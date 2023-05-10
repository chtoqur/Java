public class Server {
    
    //역할
    // Menu형 menu 선언
    private Menu menu;
    private int orderNumber;

    public Server()
    {
        orderNumber = -1;
    }

    // ??
    public void setMenu(Menu menu)
    {
        this.menu = menu;
    }


    public void showMenuAll()
    {
        for (int i = 0; i < menu.menu.length; i++)
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

        //정상적인 오더인지 확인.
        if (orderNum == -1)
            return false;
        else
        {
            orderNumber = orderNum;
            return true;
        }


    }

}
