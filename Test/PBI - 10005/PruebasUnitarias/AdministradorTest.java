package PruebasUnitarias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdministradorTest {
    @Test
    public void AdministradorTestDeleteScheduler(){
        AdministradorService service = new AdministradorService();
        String result = service.actionSchedule(1234, "Delete");
        Assertions.assertEquals("Horario eliminado exitosamente", result);
    }

    @Test
    public void AdministradorTestUpdateScheduler(){
        AdministradorService service = new AdministradorService();
        String result = service.actionSchedule(1230, "Update");
        Assertions.assertEquals("Horario actualizado exitosamente", result);
    }
}
