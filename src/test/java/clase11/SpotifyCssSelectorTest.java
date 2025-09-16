package clase11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpotifyCssSelectorTest {

    public WebDriver getChromeDriver(String URL) {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        return driver;
    }

    @Test
    public void registrationTestById() throws InterruptedException {
        WebDriver driver = getChromeDriver("https://www.spotify.com");

        Thread.sleep(2000);

        WebElement registrarseBtn = driver.findElement(By.cssSelector("[href='https://www.spotify.com/uy/signup/']"));
        registrarseBtn.click();

        driver.findElement(By.cssSelector("#email")).sendKeys("testing@test.com");
        driver.findElement(By.cssSelector("#confirm")).sendKeys("testing@test.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("holamundo");
        driver.findElement(By.cssSelector("#displayname")).sendKeys("automation");
        driver.findElement(By.cssSelector("#day")).sendKeys("12");
    }

    @Test
    public void registrationTestByName() throws InterruptedException {
        WebDriver driver = getChromeDriver("https://www.spotify.com");

        Thread.sleep(2000);

        WebElement registrarseBtn = driver.findElement(By.cssSelector("[href='https://www.spotify.com/uy/signup/']"));
        registrarseBtn.click();

        driver.findElement(By.cssSelector("[name='email']")).sendKeys("testing@test.com");
        driver.findElement(By.cssSelector("[name='confirm']")).sendKeys("testing@test.com");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("holamundo");
        driver.findElement(By.cssSelector("[name='displayname']")).sendKeys("automation");
    }


    @Test
    public void registrationTestByPlaceHolder() throws InterruptedException {
        WebDriver driver = getChromeDriver("https://www.spotify.com");

        Thread.sleep(2000);

        WebElement registrarseBtn = driver.findElement(By.cssSelector("[href='https://www.spotify.com/uy/signup/']"));
        registrarseBtn.click();

        driver.findElement(By.cssSelector("[placeholder='Introduce tu correo electrónico.']")).sendKeys("testing@test.com");
        driver.findElement(By.cssSelector("[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("testing@test.com");
        driver.findElement(By.cssSelector("[placeholder='Crea una contraseña.']")).sendKeys("holamundo");
        driver.findElement(By.cssSelector("[placeholder='Introduce un nombre de perfil.']")).sendKeys("automation");

        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/form/div[1]/input")).sendKeys("testi2@gmail.com");

    }
}
