package pages;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


/**
 * Created by user on 15.08.2016.
 */
public class SearchPage {
    public  ResultsPage searchFor (String text){
        $(By.id("lst-ib")).setValue(text).pressEnter();
        return page(ResultsPage.class);
    }
}
