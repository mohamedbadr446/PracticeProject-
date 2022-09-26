@Test123
Feature: login test


  Scenario Outline: [TEST AUTO] Creer un compte avec un email et un mot de passe
    Given  utilisateur est sur la page practice
    When   remplir le champ email "<email>"
    And    remplir le champ mdps "<mdps>"
    And    le bouton cliquer sur Register
    Then   on est dans la page Register


    Examples:
      |email|mdps|
      |durand.jean75gmail.com|Ddhcih678bcx_è|
      |luhubrufeyi-5857@yopmail.com|Aloui91?|
      |faxatezage-9317@yopmail.com||
