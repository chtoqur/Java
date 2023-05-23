package Login;

public class LoginApp {
    public static void main(String[] args) {
        
        WebServer webServer = new WebServer();

        webServer.setLogin(new SamsungLogin());
        
    }
}
