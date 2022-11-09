package PruebasAceptacion;

import io.cucumber.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ConsultaEstudianteTest implements En {
    WebDriver driver;

    public ConsultaEstudianteTest(){
        Before(()->{
            driver = new ChromeDriver();
        });

        Given("Nos encontramos en el modulo de consulta de horarios", ()->{
            driver.get("https://sistemadeeventos/search-schedule");
        });

        When("Ingresamos los datos correspondientes para la consulta (grado y periodo)", ()->{
           Select grades = new Select(driver.findElement(By.id("grade")));
           grades.selectByVisibleText("6");

            Select periods = new Select(driver.findElement(By.id("period")));
            grades.selectByVisibleText("3");

            driver.findElement(By.id("btn_search")).click();
        });

        Then("Obtenemos el horario consultado y su información en detalle", ()->{
            String titleSchedule = driver.findElement(By.id("title_schedule")).getText();
            Assert.assertEquals("Horario Grado 6° - Periodo 3", titleSchedule);
        });

        After(()->{
            driver.close();
        });
    }
}
