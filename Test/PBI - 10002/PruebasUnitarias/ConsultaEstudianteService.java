package PruebasUnitarias;

public class ConsultaEstudianteService {

    String BD_Schedule_01 = "Horario de grado 6° y periodo 3";
    String BD_Schedule_02 = "Horario de grado 7° y periodo 2";

    public String searchSchedule(int grade, int period){
        if(grade == 6 && period == 3){
            return "Consulta Exitosa, entregando.. " + BD_Schedule_01;
        }else if(grade == 7 && period == 2){
            return "Consulta Exitosa, entregando.. " + BD_Schedule_02;
        }
        return "No hay resultados de la busqueda";
    }
}
