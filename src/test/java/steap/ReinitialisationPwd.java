package steap;

import Constante.JDD;
import Pages.AccountDetailPage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReinitialisationPwd {
    AccountDetailPage detailPage;
    LoginPage loginPage;

    public ReinitialisationPwd()
    {
        detailPage =new AccountDetailPage();
        loginPage=new LoginPage();
    }
    @Given("l'utisateur est sur la page Detail Account")
    public void l_utisateur_est_sur_la_page_detail_account() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickAccountDetail();
    }
    @When("saisir cuurent password {string}")
    public void saisir_cuurent_password(String currpwd) {
        // Write code here that turns the phrase above into concrete actions
        detailPage.insertCurrentPwd(currpwd);
    }

    @And("saisir le nouveau password {string}")
    public void saisir_le_nouveau_password(String newpwd) {
        // Write code here that turns the phrase above into concrete actions
        detailPage.insertNewPwd(newpwd);
    }

    @And("confirme votre nouveau password {string}")
    public void confirme_votre_nouveau_password(String connewpwd) {
        // Write code here that turns the phrase above into concrete actions
        detailPage.insertConfirmeNewPwd(connewpwd);
    }
    @And("cliquer sur le bouton SAVE CHANGE")
    public void cliquer_sur_le_bouton_save_change() {
        // Write code here that turns the phrase above into concrete actions
        detailPage.clickButtonSaveChage();
    }
    @And("le password est bien change")
    public void le_password_est_bien_change() {
        // Write code here that turns the phrase above into concrete actions
       detailPage.verfifierMsgChangPwd(JDD.msgVrfPwd);
    }

    @And("l'utisateur est sur la page Detail Account pour la deusieme fois")
    public void l_utisateur_est_sur_la_page_detail_account_pour_la_deusieme_fois() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickAccountDetail();
    }
    @And("resaisir cuurent password  {string}")
    public void resaisir_cuurent_password(String currpwd) {
        // Write code here that turns the phrase above into concrete actions
        detailPage.insertCurrentPwd(currpwd);
    }

    @And("resaisir le nouveau password  {string}")
    public void resaisir_le_nouveau_password(String newpwd) {
        // Write code here that turns the phrase above into concrete actions
        detailPage.insertNewPwd(newpwd);
    }

    @And("reconfirme votre nouveau password  {string}")
    public void reconfirme_votre_nouveau_password(String connewpwd) {
        // Write code here that turns the phrase above into concrete actions
        detailPage.insertConfirmeNewPwd(connewpwd);
    }
    @And("recliquer sur le bouton SAVE CHANGE")
    public void recliquer_sur_le_bouton_save_change() {
        // Write code here that turns the phrase above into concrete actions
        detailPage.clickButtonSaveChage();
    }
    @Then("le password est bien change pour la deusieme fois")
    public void le_password_est_bien_change_pour_la_deusieme_fois() {
        // Write code here that turns the phrase above into concrete actions
        detailPage.verfifierMsgChangPwd(JDD.msgVrfPwd);
    }

}
