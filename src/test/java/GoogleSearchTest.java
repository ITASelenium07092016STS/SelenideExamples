import org.testng.annotations.Test;
import pages.SearchPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by user on 15.08.2016.
 */
public class GoogleSearchTest {

    @Test
    public void searchTest(){
        SearchPage searchPage = open("http://google.ru", SearchPage.class);
        //searchPage.searchFor("selenium").getElements().shouldHaveSize(11);
        searchPage.searchFor("selenium").getElements().shouldHaveSize(13);
    }
}
