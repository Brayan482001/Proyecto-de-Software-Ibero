package PruebasUnitarias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExportacionTest {
    @Test
    public void ExportacionTestPDF(){
        ExportacionService service = new ExportacionService();
        String result = service.exportSchedule(1234, "PDF");
        Assertions.assertEquals("Horario Descargado correctamente en formato PDF", result);
    }

    @Test
    public void ExportacionTestEXCEL(){
        ExportacionService service = new ExportacionService();
        String result = service.exportSchedule(1230, "EXCEL");
        Assertions.assertEquals("Horario Descargado correctamente en formato Excel", result);
    }
}
