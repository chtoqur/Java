public class ShopServiceExam {
    public static void main(String[] args) {
        
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if(obj1 == obj2)
        {
            System.out.println("같은 Singleton 객체입니다.");
        }
        else
        {
            System.out.println("상이한 Singleton 객체입니다.");
        }
    }
}
