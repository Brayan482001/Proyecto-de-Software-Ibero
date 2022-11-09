package PruebasUnitarias;

public class ExportacionService {

    public String exportSchedule(int id_sheduler, String formato){
        if(formato.equals("PDF")){
            System.out.println("Descargando.. Horario con ID: "+id_sheduler);
            return "Horario Descargado correctamente en formato PDF";
        }else if(formato.equals("EXCEL")){
            System.out.println("Descargando.. Horario con ID: "+id_sheduler);
            return "Horario Descargado correctamente en formato Excel";
        }
        return "No se ha podido descargar el horario seleccionado";
    }
}
