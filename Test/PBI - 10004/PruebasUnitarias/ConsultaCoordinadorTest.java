package PruebasUnitarias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsultaCoordinadorTest {
    @Test
    public void ConsultaCoordinadorTestTeacher(){
        ConsultaCoordinadorService service = new ConsultaCoordinadorService();
        String result = service.searchSchedule("Juan Pablo Lopez", 3, 0, "Docente");
        Assertions.assertEquals("Consulta Exitosa, entregando.. Horario de Juan Pablo Lopez - Perido 3", result);
    }

    @Test
    public void ConsultaCoordinadorTestStudent(){
        ConsultaCoordinadorService service = new ConsultaCoordinadorService();
        String result = service.searchSchedule("", 2, 7, "Estudiante");
        Assertions.assertEquals("Consulta Exitosa, entregando.. Horario de Grado 7° - Perido 2", result);
    }
}
