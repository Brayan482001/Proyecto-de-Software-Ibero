Feature: Acceso para consulta de horario rol docente

  Scenario: Consulta de horarios para rol docente
    Given Nos encontramos en el modulo de consulta de horarios
    When Seleccionamos los datos correspondientes para la consulta (nombre de docente y periodo)
    Then Obtenemos el horario consultado y su información en detalle