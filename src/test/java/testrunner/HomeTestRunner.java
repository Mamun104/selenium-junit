package testrunner;

import org.junit.jupiter.api.Test;
import pages.Home;
import setup.Setup;

public class HomeTestRunner extends Setup {

    Home home;

    @Test
    public void getTitleCheck(){
        driver.get("https://demoqa.com/");
        home  = new Home(driver);
        home.getTitle();
    }
}
