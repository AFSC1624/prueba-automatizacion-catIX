Feature: Login con campos Username y password vacios

  Background:
    Given El usuario se ingresa en la página de login

  @loginCamposVacios
  Scenario: Intentar loguearse con los campos Username y password vacios
    Given  Esta en la pagina de Login
    When  El usuario deja los campos "Username" y "Password" vacios
    Then  Debe aparecer el mensaje "Required" debajo del campo Usuario  and mensaje "Required" del campo Password