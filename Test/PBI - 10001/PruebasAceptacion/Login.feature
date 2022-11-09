Feature: Sistema de autenticación o logueo

  Scenario: Ingreso al sistema por medio de la autenticación
    Given Nos encontramos en la pagina de logueo
    When Ingresamos los datos para el ingreso (numero de identificacion y contraseña)
    Then Accede al sistema y muestra un texto de bienvenida