Feature: Login con campo Username vacio

  Background:
    Given El usuario se ingresa en la página de login

  @loginUserVacio
  Scenario: Intentar loguearse con el campo username vacio
    Given El usuario ingresa solo el "Password" correcto
    When  El campo usuario esta vacio
    Then  Debe aparecer el mensaje "Required" debajo del campo Usuario