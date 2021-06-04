Feature: F-01 Comparar producto en Target
  Se realizara la comparacion de un producto

  Scenario: Buscar producto
    Given que Ruben quiere buscar un producto
    When busque el producto
    Then se valida que el producto exista
