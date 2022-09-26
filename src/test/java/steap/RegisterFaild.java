package steap;

import Pages.LoginRegisterSucc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterFaild {

    LoginRegisterSucc loginRegisterSucc;
    public RegisterFaild()
    {
        loginRegisterSucc=new LoginRegisterSucc();
    }
    @When("remplir le champ email {string}")
    public void remplir_le_champ_email(String email) {
        // Write code here that turns the phrase above into concrete actions
        loginRegisterSucc.insertRegisterEmail(email);
    }
    @And("remplir le champ mdps {string}")
    public void remplir_le_champ_mdps(String pwd) {
        // Write code here that turns the phrase above into concrete actions
        loginRegisterSucc.insertRegisterPwd(pwd);
    }

    @And("le bouton Register n est pas clicable")
    public void le_bouton_register_n_est_pas_clicable() {
        // Write code here that turns the phrase above into concrete actions
        //loginRegisterSucc.clickZoneRegister();
        //loginRegisterSucc.verifierBouton();

    }
    @Then("on est dans la page Register")
    public void on_est_dans_la_page_register() {
        // Write code here that turns the phrase above into concrete actions
        loginRegisterSucc.Register("Register");
    }

    @And("le bouton cliquer sur Register")
    public void leBoutonCliquerSurRegister() {
        loginRegisterSucc.clickButtonRegister();
    }
}
