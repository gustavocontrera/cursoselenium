package clase11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathTest {

    private WebDriver getSpotifyDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spotify.com");
        return driver;
    }

    @Test
    public void xpathByPlaceHolderTest() throws InterruptedException {
        WebDriver driver = getSpotifyDriver();
        driver.findElement(By.xpath("//a[@href='https://www.spotify.com/uy/signup/']")).click();

        //Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@placeholder='Introduce tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//*[@placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//*[@placeholder='Crea una contraseña.']")).sendKeys("holamundo");
    }

    @Test
    public void xpathByNameTest() throws InterruptedException {
        WebDriver driver = getSpotifyDriver();
        driver.findElement(By.xpath("//a[@href='https://www.spotify.com/uy/signup/']")).click();

        //Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//*[@name='confirm']")).sendKeys("test@test.com");
    }


    @Test
    public void cssSelectorByPlaceHolderTest() throws InterruptedException {
        WebDriver driver = getSpotifyDriver();

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href='https://www.spotify.com/uy/signup/']")).click();

        driver.findElement(By.cssSelector("input[placeholder='Introduce tu correo electrónico.']")).sendKeys("test@test.com");
        
    }



}
