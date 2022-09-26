@BACBPI-345
Feature: Shop test
  Background: Se connecter a votre compte
    Given  utilisateur est sur la page practice
    When   saisir l'username "mohamedbadreamine"
    And    saisir le password "BADRE@amine97"
    And    cliquer sur le bouton LOGIN
    Then   la page MyAccount est bien affiché

  Scenario: Ajout d un produit
    Given  utilisateur est sur la page Shop
    When   cliquer sur l article "Mastering JavaScript"
    And    affiche le panier
    Then   verifier le prix du produit

  Scenario: Ajout d un produit au panier
    Given  utilisateur est sur la page Shop
    When   cliquer sur l article "Mastering JavaScript"
    And    cliquer sur AddToBasket
    And    cliquer sur le panier
    Then   le produit est bien ajoute
