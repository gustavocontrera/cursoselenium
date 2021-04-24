package clase11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class LocalizadorClassNameTest {

    private WebDriver getNetflixDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com");
        return driver;
    }


    @Test
    public void facebookPartialLinkTest() throws InterruptedException {
        WebDriver driver = getNetflixDriver();

        List<WebElement> ourStoryClassList = driver.findElements(By.className("our-story-card-title"));
        for (WebElement element: ourStoryClassList){
            System.out.println(element.getTagName() + "---> " + element.getText());
        }
    }
}