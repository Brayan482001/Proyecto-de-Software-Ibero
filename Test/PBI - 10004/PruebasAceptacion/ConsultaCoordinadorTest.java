package PruebasAceptacion;

import io.cucumber.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ConsultaCoordinadorTest implements En {
    WebDriver driver;

    public ConsultaCoordinadorTest(){
        Before(()->{
            driver = new ChromeDriver();
        });

        Given("Nos encontramos en el modulo de consulta de horarios", ()->{
            driver.get("https://sistemadeeventos/search-schedule");
        });

        When("Ingresamos los datos correspondientes para la consulta de docente (nombre de docente y periodo)", ()->{
           Select grades = new Select(driver.findElement(By.id("teacher")));
           grades.selectByVisibleText("Juan Pablo Lopez");

            Select periods = new Select(driver.findElement(By.id("period")));
            grades.selectByVisibleText("3");

            driver.findElement(By.id("btn_search")).click();
        });

        And("Seleccionamos los datos correspondientes para la consulta de estudiante (grado y periodo)", ()->{
            Select grades = new Select(driver.findElement(By.id("grade")));
            grades.selectByVisibleText("7");

            Select periods = new Select(driver.findElement(By.id("period")));
            grades.selectByVisibleText("2");

            driver.findElement(By.id("btn_search")).click();
        });

        Then("Obtenemos el horario consultado y su información en detalle", ()->{
            String titleSchedule = driver.findElement(By.id("title_schedule")).getText();
            Assert.assertEquals("Horario de Juan Pablo Lopez - Perido 3", titleSchedule);
        });

        After(()->{
            driver.close();
        });
    }
}
