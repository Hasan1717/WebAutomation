package searchTest;

import boaDB.ItemsToBeSearched;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSearch extends ItemsToBeSearched {
    @Test
    public void testse () throws IOException {
        getDataFromExcelFile();

    }
}