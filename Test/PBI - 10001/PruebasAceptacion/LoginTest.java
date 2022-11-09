package PruebasAceptacion;

import io.cucumber.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest implements En {
    WebDriver driver;

    public LoginTest(){
        Before(()->{
            driver = new ChromeDriver();
        });

        Given("Nos encontramos en la pagina de logueo", ()->{
            driver.get("https://sistemadeeventos/signin");
        });

        When("Ingresamos los datos para el ingreso (numero de identificacion y contraseña)", ()->{
            driver.findElement(By.id("user")).sendKeys("1001044980");
            driver.findElement(By.id("password")).sendKeys("Andres_001");
            driver.findElement(By.id("btn_access")).click();
        });

        Then("Accede al sistema y muestra un texto de bienvenida", ()->{
            String text_bienvenida = driver.findElement(By.className("msg_welcome")).getText();
            Assert.assertEquals("Bienvenido al sistema de horarios", text_bienvenida);
        });

        After(()->{
            driver.close();
        });
    }
}
