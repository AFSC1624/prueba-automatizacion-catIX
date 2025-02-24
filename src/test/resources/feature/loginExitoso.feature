Feature: Validación de inicio de sesión en la URL de prueba



  @loginExitoso
  Scenario: Ingresar con credenciales válidas
    Given el usuario accede a la página de login
    When el usuario ingresa un nombre de usuario y contraseña válidos
    And dar click en la parte izquierda en el campo de Admin va a añadir un nuevo usuario
    And Registrar userrole "Admin" Status "Enabled" Emmployee name "Andres Segura" Username "asegur3" Password "and123" confirmacion Password "and123"
    And Dar click boton save
    Then Usuario Creado