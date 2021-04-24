package clase10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SalesforceTest {


    private WebDriver getSalesforceDriver(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");
        return driver;
    }

    @Test
    public void salesforceRegistrationTest(){
        WebDriver driver = getSalesforceDriver();

        Assert.assertEquals(driver.getTitle(), "Login | Salesforce");
        Assert.assertEquals(driver.getCurrentUrl(), "https://login.salesforce.com/");

        driver.findElement(By.linkText("Use Custom Domain")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://login.salesforce.com/");
        Assert.assertEquals(driver.getTitle(), "Use Custom Domain | Salesforce");

        //WebElement H2UseCustomDomainElement = driver.findElement(By.tagName("h2"));
        //System.out.println(H2UseCustomDomainElement.getText());
        //Assert.assertEquals(H2UseCustomDomainElement.getText(), "Use Custom Domain");

        boolean useCustomDomainFound = false;
        List<WebElement> listaH2s = driver.findElements(By.tagName("h2"));
        for (WebElement h2: listaH2s){
            if (h2.getText().equals("Use Custom Domain")){
                useCustomDomainFound = true;
            }
        }

        Assert.assertTrue(useCustomDomainFound);

        driver.findElement(By.id("mydomain")).sendKeys("as");
        driver.findElement(By.name("Continue")).click();
        System.out.println("URL " + driver.getCurrentUrl());
        System.out.println("Title " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "American Securities - Sign In" );

        driver.findElement(By.name("username")).sendKeys("testing@testing.com");
        driver.findElement(By.name("password")).sendKeys("holamundo");
    }
}