package googleSheet;


import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class GoogleSheetPage extends CommonAPI {

    @FindBy(xpath = "//h2[@class='a-size-medium s-inline s-access-title a-text-normal']")
    public List<WebElement> bookList;
    @FindBy(xpath = "//*[contains(text(), 'Learn Selenium in 1 Day')]")
    public WebElement book1;

    // get first 5 book names
    public List<String> getBookNames() {
        List<String> bookName = new ArrayList<String>();
        for (int i = 1; i < 5; i++) {
            bookName.add(bookList.get(i).getText());
        }
        return bookName;
    }

    // get a book name
    public String bookName() {
        String name = book1.getText();
        return name;
    }
}
