@BACBPI-339
Feature: login test
  Background: Se connecter a votre compte
    Given  utilisateur est sur la page practice
    When   saisir l'username "mohamedbadreamine"
    And    saisir le password "BADRE@amine97"
    And    cliquer sur le bouton LOGIN
    Then   la page MyAccount est bien affiché

  Scenario: Modifier le passsword
    Given l'utisateur est sur la page Detail Account
    When saisir cuurent password "BADRE@amine97"
    And saisir le nouveau password "AMINE@BADRE97"
    And confirme votre nouveau password "AMINE@BADRE97"
    And cliquer sur le bouton SAVE CHANGE
    And le password est bien change

    And l'utisateur est sur la page Detail Account pour la deusieme fois
    And resaisir cuurent password  "AMINE@BADRE97"
    And resaisir le nouveau password  "BADRE@amine97"
    And reconfirme votre nouveau password  "BADRE@amine97"
    And recliquer sur le bouton SAVE CHANGE
    Then le password est bien change pour la deusieme fois
