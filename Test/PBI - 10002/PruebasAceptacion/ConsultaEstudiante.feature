Feature: Acceso para consulta de horario para estudiantes

  Scenario: Consulta de horarios para rol estudiantes
    Given Nos encontramos en el modulo de consulta de horarios
    When Ingresamos los datos correspondientes para la consulta (grado y periodo)
    Then Obtenemos el horario consultado y su información en detalle