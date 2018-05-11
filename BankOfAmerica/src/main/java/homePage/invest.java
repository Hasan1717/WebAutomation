package homePage;

import base.CommonAPI;

public class invest extends CommonAPI {
    public void tInvest(){
        clickByXpath("//*[@id=\"findAHome\"]");
        clickByXpath("//*[@id=\"firstTimeHomeBuyer\"]");
        clickByXpath("//*[@id=\"autoLoanRates\"]");
        clickByXpath("//*[@id=\"autoApplyNow\"]");
        clickByXpath("//*[@id=\"checkAutoStatus\"]");
        clickByXpath("//*[@id=\"scheduleApptAutoLoans\"]");
        clickByXpath("//*[@id=\"bmhCredit\"]/span");
        clickByXpath("//*[@id=\"bmhDebt\"]/span");
        clickByXpath("//*[@id=\"bmhSaving\"]/span");
    }
    public void gIN(){
        clickByXpath("//*[@id=\"bmhHomeOwnership\"]/span");
        clickByXpath("//*[@id=\"bmhAuto\"]");
    }
    public void bic(){
        clickByXpath("//*[@id=\"NAV_BUSINESS_INSTITUTIONS\"]");
    }
    public void smallBusiness(){
        clickByXpath("        clickByXpath(\"\");\n");
    }
}
