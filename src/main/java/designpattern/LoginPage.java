package designpattern;

public class LoginPage {

    private static LoginPage loginPage=null;

    private LoginPage() {

    }

    public static LoginPage getInstance() {
        if(loginPage==null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }

}
