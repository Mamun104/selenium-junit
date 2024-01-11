package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Home {

    public WebDriver driver;
    public Home(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getTitle(){

        String titleActual = driver.getTitle();
        String titleExpected = "DEMOQA";
        Assertions.assertEquals(titleExpected,titleActual);
        System.out.println(titleActual);





    }



}
