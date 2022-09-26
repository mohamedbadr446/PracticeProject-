# language: fr
Fonctionnalité: Se déconnectcer en clinaquant sur LogOut
  Contexte: Se connecter a votre compte
    Etant donné qu'un utilisateur est sur la page practice
    Quand   je saisi l'username "mohamedbadreamine"
    Et      je saisi le password "BADRE@amine97"
    Et      je clique sur le bouton LOGIN
    Alors   La page MyAccount est bien affiche

  @BACBPI-342
    Scénario: Se déconncter
      Etant donné que je suis sur la page MyAccount
      Quand je clique sur LogOut
      Alors je me suis déconnecter