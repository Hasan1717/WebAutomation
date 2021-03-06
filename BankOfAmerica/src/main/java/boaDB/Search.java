package boaDB;

import base.CommonAPI;
import database.ConnectDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Search extends CommonAPI {
    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using =".nav-input")
    public static WebElement submitButtonWebElement;

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void searchFor(String value){
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton(){
        getSubmitButtonWebElement().click();
    }
    public void clearInput(){
        getSearchInputWebElement().clear();
    }
    public void searchItemsAndSubmitButton()throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] value = itemsToBeSearched.getDataFromExcelFile();
        for(int i=0; i<value.length; i++) {
            searchFor(value[i]);
            submitSearchButton();
            clearInput();
        }
    }

    public WebElement getSearchInputField() {
        return searchInputWebElement;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputWebElement = searchInputField;
    }

    public void searchItems()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }

    public static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Home Loan");
        itemsList.add("Car Loan");
        itemsList.add("Travel");
        itemsList.add("Credit Cards");
        itemsList.add("Retirements");
        itemsList.add("Savings");
        itemsList.add("Spends");
        itemsList.add("Budget");
        itemsList.add("Investing");
        itemsList.add("Tech Invest");
        itemsList.add("Money Habits");
        itemsList.add("Personal Loan");

        return itemsList;
    }

    public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDB();
        connectDB.insertDataFromArrayListToMySql(getItemValue(),"boaList","things");
    }


}