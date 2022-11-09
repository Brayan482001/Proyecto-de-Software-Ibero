package PruebasUnitarias;

public class LoginService {

    int BD_User = 1001044980;
    String BD_Password = "Andres_001";

    public String signIn(int user, String password){
        if(BD_User == user && BD_Password.equals(password)){
            return "Bienvenido al sistema";
        }
        return "Usuario y contraseña incorrecta";
    }
}
