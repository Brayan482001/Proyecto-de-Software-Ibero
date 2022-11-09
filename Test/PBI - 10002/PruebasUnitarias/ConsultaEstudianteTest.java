package PruebasUnitarias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsultaEstudianteTest {
    @Test
    public void ConsultaEstudianteTestSuccess(){
        ConsultaEstudianteService service = new ConsultaEstudianteService();
        String result = service.searchSchedule(6, 3);
        Assertions.assertEquals("Consulta Exitosa, entregando horario de grado 6° y del periodo 3", result);
    }

    @Test
    public void ConsultaEstudianteTestFail(){
        ConsultaEstudianteService service = new ConsultaEstudianteService();
        String result = service.searchSchedule(7, 4);
        Assertions.assertEquals("No hay resultados de la busqueda", result);
    }
}
