package PruebasUnitarias;

public class AdministradorService {

    public String actionSchedule(int id_sheduler, String action){
        if(action.equals("Update")){
            System.out.println("Update from scheduler where id_sheduler = "+id_sheduler);
            return "Horario actualizado exitosamente";
        }else if(action.equals("Delete")){
            System.out.println("Delete from scheduler where id_sheduler = "+id_sheduler);
            return "Horario eliminado exitosamente";
        }
        return "No se ha podido realizar la acción para el horario seleccionado";
    }
}
