Feature: Acceso para consulta de horarios de estudiantes y docentes rol coordinador

  Scenario: Eliminación exitosa de horario por rol administrador
    Given Nos encontramos en el modulo de gestión de horarios
    When Ingresamos tenemos la posibilidad de generar alguna acción como en este caso eliminar un horario
    Then De ejercer dicha opción obtenemos una respuesta satisfactoria y no se visualizara dicho horario para su consulta