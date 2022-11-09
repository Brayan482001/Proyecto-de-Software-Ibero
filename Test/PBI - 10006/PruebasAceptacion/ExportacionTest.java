package PruebasAceptacion;

import io.cucumber.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExportacionTest implements En {
    WebDriver driver;

    public ExportacionTest(){
        Before(()->{
            driver = new ChromeDriver();
        });

        Given("Nos encontramos en el modulo consulta de horarios", ()->{
            driver.get("https://sistemadeeventos/search-schedules");
        });

        When("Intentemos descargar el horario en el formato deseado ya sea \"PDF\" o \"Excel\"", ()->{
           driver.findElement(By.id("exportPDF")).click();
        });

        Then("Obtendremos de manera local dicho horario y con el formato seleccionado", ()->{
            String titleSatisfactory = driver.findElement(By.id("title_satisfactory")).getText();
            Assert.assertEquals("Exportación exitosa en PDF", titleSatisfactory);
        });

        After(()->{
            driver.close();
        });
    }
}
