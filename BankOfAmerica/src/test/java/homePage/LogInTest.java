package homePage;

import org.testng.annotations.Test;

public class LogInTest extends logIn {
    @Test
    public void logInBankOfAmerica(){
        logeEle();
    }
    @Test
    public void logInBankOfAmericaSe(){
        tryLogIn();
    }
}
