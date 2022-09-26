package steap;

import Constante.JDD;
import Pages.Pannier;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import setup.SetUp;

import javax.swing.*;


public class Shop {
    private Pannier pannie;
    private String prix;

    public Shop() {
        pannie = new Pannier();
    }

    @Given("utilisateur est sur la page Shop")
    public void utilisateur_est_sur_la_page_shop() {
        pannie.clickShop();
    }

    @When("cliquer sur l article {string}")
    public void cliquerSurLArticle(String produit) {
        prix = pannie.getPrice();
        pannie.clickAddToBasket();

    }

    @And("affiche le panier")
    public void afficheLePanier() {
        pannie.clickViewBasket();
    }

    @Then("le produit est bien ajoute")
    public void le_produit_est_bien_ajoute() {
        pannie.verfierPagePannier(JDD.msgPanne);
    }

    @And("cliquer sur AddToBasket")
    public void cliquerSurAddToBasket() {
        pannie.clickAddToBasket();
    }

    @And("cliquer sur le panier")
    public void cliquerSurLePanier() {
        pannie.clickPanier();
    }

    @Then("verifier le prix du produit")
    public void verifier_le_prix_du_produit() {
        // Write code here that turns the phrase above into concrete actions
        pannie.verifierPrix(prix);
    }


}


