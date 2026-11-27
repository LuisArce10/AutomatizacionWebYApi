Feature: Consulta de usuarios

  Scenario: Obtener lista de usuarios correctamente
    Given que consumo el servicio de usuarios
    When realizo una peticion GET
    Then el codigo de respuesta debe ser 200
    And la lista de usuarios no debe estar vacia