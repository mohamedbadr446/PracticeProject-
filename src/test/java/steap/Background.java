package steap;

import Constante.JDD;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.fr.Etantdonnéqu;

public class Background {



    LoginPage loginPage;

    public Background()
    {
        loginPage=new LoginPage();
    }

    @Given("utilisateur est sur la page practice")
    public void utilisateur_est_sur_la_page_practice() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickMyaccount();
    }
    @When("saisir l'username {string}")
    public void saisir_l_username(String username) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.insertLoginEmail(username);
    }
    @And("saisir le password {string}")
    public void saisir_le_password(String pwd) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.insertLoginPwd(pwd);
    }
    @And("cliquer sur le bouton LOGIN")
    public void cliquer_sur_le_bouton_login() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickButtonLogin();
    }
    @Then("la page MyAccount est bien affiché")
    public void la_page_my_account_est_bien_affiché() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.verfierPageLogin(JDD.msgPage);

    }


}
