package homeExcle;

import java.io.IOException;
import java.util.ArrayList;

public class ElFile extends Excle {
    public void elrEx() throws IOException {

        ArrayList<String> searchAbleUsers = dataFromExcel("/Users/tareq/Downloads/ShakeHasanSeleniumFremwork/BankOfAmerica/Data/Workbook1.xls", "sheet1", 0);
        for (int i=1; i< searchAbleUsers.size(); i++){
            typeByXpath("//*[@id='nav-search-query']" , searchAbleUsers.get(i));
        }
    }

}
