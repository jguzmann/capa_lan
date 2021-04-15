Feature: busco un vuelo y obtengo la tarifa mas economica.
  //Yo
  //Como
  //Cliente quiero


  Background:
    Given  Como cliente ingreso a la url "https://www.latamairlines.com/cl/es"

  @test1
  Scenario: Busco un vuelo nacional
    And escojo la ruta de inicio
    And escojo la ruta de retorno
    And escojo el asiento
    Then y obtengo la ruta mas barata
