package clase12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class SpotifyWithTestngTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.spotify.com");
    }
/*
    @Test
    public void registrationTest() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='https://www.spotify.com/uy/signup/']")).click();

        driver.findElement(By.xpath("//*[@placeholder='Introduce tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//*[@placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//*[@placeholder='Crea una contraseña.']")).sendKeys("holamundo");
    }
*/

    @Test
    @Parameters({"username", "password"})
    public void cssSelectorByPlaceHolderTest(@Optional("qa@qa.com") String testEmail,@Optional ("holamundo") String password) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href='https://www.spotify.com/uy/signup/']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Introduce tu correo electrónico.']")).sendKeys(testEmail);
    }

    @Test
    @Parameters({"tagName"})
    public void parametersFromTestngXML(@Optional("a") String tagNameParameter){
        List<WebElement> tagElementList = driver.findElements(By.tagName(tagNameParameter));

        for (WebElement elemento : tagElementList){
            System.out.println("--> " + elemento.getText());
        }
    }


    @Test
    public void spotifyErrorsTest() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='https://www.spotify.com/uy/signup/']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@type='submit']")).click();
        List<WebElement> listaErrores = driver.findElements(By.xpath("//*[@aria-label='Indicador de error']"));
        Assert.assertEquals(listaErrores.size(), 9, "Se esperaba tener 9 errores");

        boolean errorContraseñaPresente = false;
        for (WebElement element : listaErrores){
            System.out.println("--> " + element.getText());
            if (element.getText().equals("Debes introducir una contraseña.")){
                errorContraseñaPresente = true;
            }
        }

        Assert.assertTrue(errorContraseñaPresente, "No se encontró el error de la contraseña");

        driver.findElement(By.xpath("//*[contains(text(), 'Hombre')]")).click();

        WebElement perfilVacioErrorElement = driver.findElement(By.xpath("//*[contains(text(), 'Introduce un nombre para tu perfil.')]"));

        Assert.assertEquals(perfilVacioErrorElement.getText(),"Introduce un nombre para tu perfil.", "El error de perfil vacio deberia estar presente" );


    }


    @AfterMethod
    public void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
