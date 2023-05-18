public class TvApp {
    public static void main(String[] args) {
        
        SmartTv stv = new SmartTv();

        stv.PowerOn();
        stv.startNetflix();

        TV tv = new SmartTv();

        tv.PowerOn();
        tv.changeChannel(11);
        System.out.println(tv.getChannel());
        
        // 불가능
        // tv.startNetflix(); // ==> ERROR
        
    }
}
