public class ShopService {
    
    private static ShopService singleton = new ShopService();

    // 생성자
    private ShopService()
    {

    }

    public static ShopService getInstance()
    {
        return singleton;
    }
}
