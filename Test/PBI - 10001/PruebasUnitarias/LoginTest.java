package PruebasUnitarias;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {
    @Test
    public void loginTestSuccess(){
        LoginService service = new LoginService();
        String result = service.signIn(1001044980, "Andres_001");
        Assertions.assertEquals("Bienvenido al sistema", result);
    }

    @Test
    public void loginTestFail(){
        LoginService service = new LoginService();
        String result = service.signIn(1001044900, "Andres_002");
        Assertions.assertEquals("Usuario y contraseña incorrecta", result);
    }
}
