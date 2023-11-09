#Author: empresarialmaia1@gmail.com

@regressivos
Feature: Buscar Cep no Correio
  
   Como usuario do correio
   Quero informar o cep na busca
   Para validar os dados de retorno

  @positivo
  Scenario: Realizar a busca do Cep
    When enviar os dados para busca
    Then validar os dados retorno
   

 