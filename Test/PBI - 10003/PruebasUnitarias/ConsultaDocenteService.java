package PruebasUnitarias;

public class ConsultaDocenteService {

    String BD_Schedule = "Horario de Juan Pablo Lopez - Perido 3";

    public String searchSchedule(String teacher, int period){
        if(teacher.equals("Juan Pablo Lopez") && period == 3){
            return "Consulta Exitosa, entregando.. " + BD_Schedule;
        }
        return "No hay resultados de la busqueda";
    }
}
