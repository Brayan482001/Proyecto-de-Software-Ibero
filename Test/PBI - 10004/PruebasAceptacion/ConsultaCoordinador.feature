Feature: Acceso para consulta de horarios de estudiantes y docentes rol coordinador

  Scenario: Consulta de horarios para rol coordinador
    Given Nos encontramos en el modulo de consulta de horarios
    When Seleccionamos los datos correspondientes para la consulta de docente (nombre de docente y periodo)
    And Seleccionamos los datos correspondientes para la consulta de estudiante (grado y periodo)
    Then Obtenemos el horario consultado y su información en detalle