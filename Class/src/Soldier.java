public class Soldier {
    


    public MachineGun mGun;

    public Soldier()
    {
        mGun = new MachineGun();
    }

    public void shotAll()
    {
        int bullet = mGun.bullet;
        for (int i = 0; i < bullet; i++)
        {
            System.out.printf("데미지 : %d\n", mGun.damage);
            mGun.bullet--;
        }

        System.out.printf("총알 수 : %d\n", mGun.bullet);
    }
}