package PruebasUnitarias;

public class ConsultaCoordinadorService {

    String BD_Schedule_Teacher = "Horario de Juan Pablo Lopez - Periodo 3";
    String BD_Schedule_Student = "Horario de Grado 7° - Periodo 2";

    public String searchSchedule(String teacher, int period, int grade, String rol_consulta){
        if(teacher.equals("Juan Pablo Lopez") && period == 3 && rol_consulta.equals("Docente")){
            return "Consulta Exitosa, entregando.. " + BD_Schedule_Teacher;
        }else if(grade == 7 && period == 2 && rol_consulta.equals("Estudiante")){
            return "Consulta Exitosa, entregando.. " + BD_Schedule_Student;
        }
        return "No hay resultados de la busqueda";
    }
}
