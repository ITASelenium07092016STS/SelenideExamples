/**
 * Created by user on 15.08.2016.
 */
import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class TestClass {

    @Test
    public void testExampleTest() {
        System.setProperty("selenide.browser", "chrome");
       // Configuration.startMaximized = true;
       // Configuration.browserSize = "100%";
        open("http://google.ru");
        $(By.id("lst-ib")).setValue("selenium").pressEnter();
        $$(By.cssSelector(".rc")).shouldHaveSize(11);
        $$(By.cssSelector(".rc")).get(0).find(By.tagName("a")).shouldHave(text("Selenium — Википедия"));


    }

    @Test
    public void workWithFilesTest() throws FileNotFoundException {
        open("https://the-internet.herokuapp.com/download");
        Configuration.startMaximized = true;

        //File file = new File("123.txt");

        $$(By.cssSelector(".example a")).get(0).download(); /*чтобы скачать 2-ой в скписке файл надо изменить индекс*/
         }

    @Test
    public void uploadFileTest() throws FileNotFoundException {
        Configuration.holdBrowserOpen = true;
        open("https://the-internet.herokuapp.com/upload");
        $(By.id("file-upload")).uploadFile(new File("test.txt"));
        $(By.id("file-submit")).click();
        $(By.id("upload-files")).shouldHave(text("test.txt"));

    }

}
