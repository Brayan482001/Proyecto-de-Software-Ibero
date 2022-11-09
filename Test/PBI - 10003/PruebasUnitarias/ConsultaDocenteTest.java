package PruebasUnitarias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsultaDocenteTest {
    @Test
    public void ConsultaDocenteTestSuccess(){
        ConsultaDocenteService service = new ConsultaDocenteService();
        String result = service.searchSchedule("Juan Pablo Lopez", 3);
        Assertions.assertEquals("Consulta Exitosa, entregando.. Horario de Juan Pablo Lopez - Perido 3", result);
    }

    @Test
    public void ConsultaDocenteTestFail(){
        ConsultaDocenteService service = new ConsultaDocenteService();
        String result = service.searchSchedule("Juan Pablo Lopez", 4);
        Assertions.assertEquals("No hay resultados de la busqueda", result);
    }
}
