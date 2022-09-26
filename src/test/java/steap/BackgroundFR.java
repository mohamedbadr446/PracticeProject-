package steap;

import Constante.JDD;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Etantdonnéqu;
import io.cucumber.java.fr.Quand;

public class BackgroundFR {



    LoginPage loginPage;

    public BackgroundFR()
    {
        loginPage=new LoginPage();
    }

    @Etantdonnéqu("un utilisateur est sur la page practice")
    public void un_Utilisateur_Est_Sur_LaPage_Practice() {
        loginPage.clickMyaccount();
    }
    @Quand("je saisi l'username {string}")
    public void je_saisi_l_username(String username) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.insertLoginEmail(username);
    }
    @Et("je saisi le password {string}")
    public void je_saisi_le_password(String pwd) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.insertLoginPwd(pwd);
    }
    @Et("je clique sur le bouton LOGIN")
    public void je_clique_sur_le_bouton_login() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickButtonLogin();
    }
    @Alors("La page MyAccount est bien affiche")
    public void La_page_my_account_est_bien_affiche() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.verfierPageLogin(JDD.msgPage);

    }


}
