package Game;
public class GameApp {
    public static void main(String[] args) {

        // 호출은 못하지만 참조값을 집어넣는 것은 가능함
        Unit[] units = new Unit[] {
            new Zerg(), new Zerg(), new Zerg(), new Zerg(),
            new Protoss(), new Protoss(), new Protoss(), new Protoss(), new Protoss(), 
            new Terran(), new Terran(), new Terran()
        };

        for (int i = 0; i < units.length; i++)
        {
            units[i].attack();
        }

        boolean a = units[0] instanceof Zerg;
        System.out.println(a);      // true

        boolean b = units[0] instanceof Terran;
        System.out.println(b);      // false
    }
}
