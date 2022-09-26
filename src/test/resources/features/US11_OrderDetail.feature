# language: fr
Fonctionnalité: Se déconnectcer en clinaquant sur LogOut
  Contexte: Se connecter a votre compte
    Etant donné qu'un utilisateur est sur la page practice
    Quand   je saisi l'username "mohamedbadreamine"
    Et      je saisi le password "BADRE@amine97"
    Et      je clique sur le bouton LOGIN
    Alors   La page MyAccount est bien affiche

    @BACBPI-347
    Scénario: Affichage des deatils du produit
      Etant donné que je suis sur la page MyAccount
      Quand je clique sur Oder
      Et j'ai la page OrderDetail bien Affiché
      Et je clique sur le bouton View
      Et J'ai les detail sur l'article
      Et je verifie si l'article est "Mastering JavaScript"
      Et j'ai les informations sur le client affiché
      Et je verifie si email du client c'est "mohamedbadreamine@gmail.com"
      Et j'ai le pavé du billing adresse bien affiché
      Alors l'adresse est bien affiché