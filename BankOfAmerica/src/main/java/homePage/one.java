package homePage;

import base.CommonAPI;

public class one extends CommonAPI {
    public void showCards(){
        clickByXpath("//*[@id=\"navCreditCards\"]/span[2]");
    }
    public void autoLoan(){
        clickByXpath("//*[@id=\"navAutoLoans\"]/span[2]");
    }
    public void boa (){
        clickByXpath("//*[@id=\"NAV_ABOUT_US\"]");
    }
    public void betterMoney(){
        clickByXpath("//*[@id=\"navBetterMoneyHabits\"]/span[2]");
        clickByXpath("//*[@id=\"bmhCredit\"]/span");
    }
    public void contactUs(){
        clickByXpath("//*[@id=\"NAV_EN_ES\"]");
    }
    public void help(){
        clickByXpath("//*[@id=\"NAV_HELP\"]");
        clickByXpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[4]/h4[1]");
        clickByXpath("/html/body/div[1]/div/div/div[2]/div[1]/div[1]/div/div[4]/ul[1]/li[4]/a");
    }
    public void aboutUs(){
        clickByXpath("//*[@id=\"NAV_ABOUT_US\"]");
    }
    public void ccq(){
        clickByXpath("//*[@id=\"getTheMobileApp\"]");
    }
    public void manCc(){
        clickByXpath("//*[@id=\"managingCredit\"]");
    }

}
