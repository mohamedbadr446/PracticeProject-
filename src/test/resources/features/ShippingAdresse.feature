@BACBPI-235
Feature: login test
  Background: Se connecter a votre compte
    Given  utilisateur est sur la page practice
    When   saisir l'username "mohamedbadreamine"
    And    saisir le password "BADRE@amine97"
    And    cliquer sur le bouton LOGIN
    Then   la page MyAccount est bien affiché

  Scenario: Edit Shipping Adresse
    Given  utilisateur est sur la page MyAccount
    When   cliquer sur ShippingAdresse
    When   cliquer sur Edit du Shipping Adresse
    Then   la page d Edit est bien affiche
