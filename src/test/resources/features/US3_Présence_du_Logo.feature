# language: fr
Fonctionnalité: Revenir à l'accueil en cliquant sur le Logo
  Contexte: Se connecter a votre compte
    Etant donné qu'un utilisateur est sur la page practice
    Quand   je saisi l'username "mohamedbadreamine"
    Et      je saisi le password "BADRE@amine97"
    Et      je clique sur le bouton LOGIN
    Alors   La page MyAccount est bien affiche

  @BACBPI-240
  Scénario: Je reviens à la page d'accueil en cliquant sur le Logo
    Etant donné que je suis sur la page MyAccount
    Quand je clique sur le logo
    Alors je reviens à la page Home

