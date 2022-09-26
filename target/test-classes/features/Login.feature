@BACBPI-236
Feature: login test

  Scenario: Se connecter a votre compte
    Given  utilisateur est sur la page practice
    When   saisir l'username "mohamedbadreamine"
    And    saisir le password "BADRE@amine97"
    And    cliquer sur le bouton LOGIN
    Then   la page MyAccount est bien affiché
