package homePage;

import base.CommonAPI;

public class homeLoans extends CommonAPI {
    public void houseLoan(){
        clickByXpath("//*[@id=\"mortgages\"]");
    }
    public void homeEq(){
        clickByXpath("//*[@id=\"firstTimeHomeBuyer\"]");
    }
    public void homeEqv(){
        clickByXpath("//*[@id=\"apply-now-medium\"]");
    }
    public void bankloan(){
        clickByXpath("//*[@id=\"navBetterMoneyHabits\"]/span[2]");
        clickByXpath("//*[@id=\"navChecking\"]/span[2]");
    }
    public void reInvest(){
        clickByXpath("//*[@id='retirementPlanning']");
        clickByXpath("//*[@id=\"collegeSavingsPlans\"]");
        clickByXpath("//*[@id=\"collegeSavingsPlans\"]");
    }


}
