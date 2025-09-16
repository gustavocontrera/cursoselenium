package clase16.PageObject;

import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver driver;

    public String getPageTitle(){
        return driver.getTitle();
    }

    public String getPageUrl(){
        return driver.getCurrentUrl();
    }
}
