public class Barister {
    
    public Coffee makeCoffee (int MenuNumber)
    {
        Coffee coffee = new Coffee();
        switch (MenuNumber) {
            
            // 아메리카노
            case 0:
                coffee.set(1, true, false);
                break;

            case 1:
                coffee.set(1, true, true);
                break;

            case 2:
                coffee.set(1, true, true);
                break;
                
            case 3:
                coffee.set(2, true, false);
                break;
        }

        return coffee;
    }
}
