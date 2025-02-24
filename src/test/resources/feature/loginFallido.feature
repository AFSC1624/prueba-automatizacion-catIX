Feature: Login con credenciales incorrectas

  @loginFallido
  Scenario: Intentar loguearse con credenciales incorrectas
    Given El usuario se ingresa en la página de login
    When El usuario ingresa un "Username" incorrecto y una "Password" incorrecta
    Then Debe aparecer el mensaje "Invalid credentials"