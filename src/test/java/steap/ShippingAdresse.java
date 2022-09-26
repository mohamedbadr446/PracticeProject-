package steap;

import Pages.LoginPage;
import Pages.ShippingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShippingAdresse {

    private ShippingPage shippingPage;
    private LoginPage loginPage;
    public ShippingAdresse(){
        shippingPage=new ShippingPage();
        loginPage=new LoginPage();
    }
    @Given("utilisateur est sur la page MyAccount")
    public void utilisateur_est_sur_la_page_my_account() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickMyaccount();
    }
    @When("cliquer sur ShippingAdresse")
    public void cliquer_sur_shipping_adresse() {
        // Write code here that turns the phrase above into concrete actions
        shippingPage.clickShipping();
    }

    @And("utilisateur est sur la page Shipping Adresse")
    public void utilisateur_est_sur_la_page_shipping_adresse() {
        // Write code here that turns the phrase above into concrete actions
        shippingPage.clickShipping();
    }
    @And("cliquer sur Edit du Shipping Adresse")
    public void cliquer_sur_edit_du_shipping_adresse() {
        // Write code here that turns the phrase above into concrete actions
        shippingPage.clickEdit();
    }
    @Then("la page d Edit est bien affiche")
    public void la_page_d_edit_est_bien_affiche() {
        // Write code here that turns the phrase above into concrete actions
        shippingPage.checkShippingPage();
    }
}
