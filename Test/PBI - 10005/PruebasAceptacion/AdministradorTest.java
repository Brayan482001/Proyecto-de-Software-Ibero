package PruebasAceptacion;

import io.cucumber.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdministradorTest implements En {
    WebDriver driver;

    public AdministradorTest(){
        Before(()->{
            driver = new ChromeDriver();
        });

        Given("Nos encontramos en el modulo de gestión de horarios", ()->{
            driver.get("https://sistemadeeventos/control-schedules");
        });

        When("Ingresamos tenemos la posibilidad de generar alguna acción como en este caso eliminar un horario", ()->{
           driver.findElement(By.id("action_delete")).click();
        });

        Then("De ejercer dicha opción obtenemos una respuesta satisfactoria y no se visualizara dicho horario para su consulta", ()->{
            String titleSatisfactory = driver.findElement(By.id("title_satisfactory")).getText();
            Assert.assertEquals("Horario Eliminado Exitosamente", titleSatisfactory);
        });

        After(()->{
            driver.close();
        });
    }
}
