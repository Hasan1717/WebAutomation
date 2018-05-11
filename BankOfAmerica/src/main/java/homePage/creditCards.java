package homePage;

import base.CommonAPI;

public class creditCards extends CommonAPI {
    public void cc(){
        clickByXpath("//*[@id=\"navCreditCards\"]");
    }
    public void hPage() {
        clickOnCss("#navHomeLoans > span:nth-child(2)");
        clickOnCss("#signIn");
    }
    public void testR() {
        clickOnCss("div.product:nth-child(4) > div:nth-child(2) > picture:nth-child(1) > img:nth-child(3)");
        clickOnCss("#NAV_EN_ES");
        clickByXpath("//*[@id=\"passcode1\"]");
        clickByXpath("//*[@id=\"mortgages\"]");
    }
    public void siIn(){
        clickByXpath("#navHomeLoans > span:nth-child(2)");
        clickByXpath("#NAV_BUSINESS_INSTITUTIONS");
        clickByXpath("#navSavings > span:nth-child(2)");
    }
}
