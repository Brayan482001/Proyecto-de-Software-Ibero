Feature: Función de exportación en formato ‘PDF’ y ‘Excel’ de los horarios

  Scenario: Exportación de horarios en formato PDF
    Given Nos encontramos en el modulo consulta de horarios
    When Intentemos descargar el horario en el formato deseado ya sea "PDF" o "Excel"
    Then Obtendremos de manera local dicho horario y con el formato seleccionado