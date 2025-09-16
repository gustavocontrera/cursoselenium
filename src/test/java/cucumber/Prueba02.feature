@altaDeTransferencias
Feature: Ver listado de las cuentas sin permiso

  Background:
    Given Me encuentro en el aplicativo

  @validarTransferenciaEmpleados
  Scenario Outline: Valido los tipos de transferencias con permiso de empleados
    When Ingresa el usuario "<User>" password "<Password>" y cuit "<CUIT>"
    And valida que se inicie sesion correctamente
    And Hago click en transferencias
    And Ingreso empresa y cuenta de origen
    And Selecciono el destino de la transferencia
    And Hago click en continuar
    Then valida las opciones deshabilitadas

    Examples:
      | CUIT        | User   | Password  |
      | 30515419760 | andy01 | facundo11 |

  @validarTransferenciaProveedores
  Scenario Outline: Valido los tipos de transferencias con permiso de proveedores
    When Ingresa el usuario "<User>" password "<Password>" y cuit "<CUIT>"
    And valida que se inicie sesion correctamente
    And Hago click en transferencias
    And Ingreso empresa y cuenta de origen
    And Selecciono el destino de la transferencia
    And Hago click en continuar
    Then valida opcion empleados deshabilitado

    Examples:
      | CUIT        | User   | Password  |
      | 30515419760 | jefe01 | facundo11 |

  @validarTransferenciaAmbosPermisos
  Scenario Outline: Valido los tipos de transferencias con ambos permisos
    When Ingresa el usuario "<User>" password "<Password>" y cuit "<CUIT>"
    And valida que se inicie sesion correctamente
    And Hago click en transferencias
    And Ingreso empresa y cuenta de origen
    And Selecciono el destino de la transferencia
    And Hago click en continuar
    Then valida todas las opciones habilitadas

    Examples:
      | CUIT        | User   | Password  |
      | 30515419760 | papu01 | facundo11 |

  @validarOtrosConceptos
  Scenario Outline: Valido la existencia de conceptos
    When Ingresa el usuario "<User>" password "<Password>" y cuit "<CUIT>"
    And valida que se inicie sesion correctamente
    And Hago click en transferencias
    And Ingreso empresa y cuenta de origen
    And Selecciono el destino de la transferencia
    And Hago click en continuar
    And Desplego listado de conceptos
    Then valida conceptos

    Examples:
      | CUIT        | User   | Password  |
      | 30515419760 | papu01 | facundo11 |

  @validarTransferenciaProveedores
  Scenario Outline: Valido leyenda seleccionar destinatario
    When Ingresa el usuario "<User>" password "<Password>" y cuit "<CUIT>"
    And valida que se inicie sesion correctamente
    And Hago click en transferencias
    And Ingreso empresa y cuenta de origen
    And Selecciono el destino de la transferencia
    And Hago click en continuar
    And Valida la leyenda seleccionar destinatario

    Examples:
      | CUIT        | User   | Password  |
      | 30515419760 | jefe01 | facundo11 |

  @botonBackTranferencias
  Scenario Outline: Boton back transferencias
    When Ingresa el usuario "<User>" password "<Password>" y cuit "<CUIT>"
    And valida que se inicie sesion correctamente
    And Hago click en transferencias
    And Hago click en cancelar
    Then Hago click en confirmar

    Examples:
      | CUIT        | User   | Password  |
      | 30515419760 | papu01 | facundo11 |
