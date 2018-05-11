package homePage;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;

public class scrollDown extends CommonAPI {
    public void boaScroll() throws InterruptedException{
        //driver.get("https://bankofamerica.com");
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        sleepFor(5);
        jsx.executeScript("window.scrollBy(0,450)", "");
        sleepFor(5);
    }
}
