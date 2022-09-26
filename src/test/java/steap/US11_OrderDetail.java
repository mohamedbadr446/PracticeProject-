package steap;

import Constante.JDD;
import Pages.LoginPage;
import Pages.OrderPage;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Quand;

public class US11_OrderDetail {

    private OrderPage orderPage;
    private LoginPage loginPage;

    public US11_OrderDetail()
    {
        orderPage=new OrderPage();
        loginPage=new LoginPage();
    }

    @Quand("je clique sur Oder")
    public void je_clique_sur_oder() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickOder();
    }
    @Et("j'ai la page OrderDetail bien Affiché")
    public void j_ai_la_page_order_detail_bien_affiché() {
        // Write code here that turns the phrase above into concrete actions
        orderPage.verifierOderPage(JDD.orderDetail);
    }
    @Et("je clique sur le bouton View")
    public void je_clique_sur_le_bouton_view() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Et("J'ai les detail sur l'article")
    public void j_ai_les_detail_sur_l_article() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Et("je verifie si l'article est {string}")
    public void je_verifie_si_l_article_est(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Et("j'ai les informations sur le client affiché")
    public void j_ai_les_informations_sur_le_client_affiché() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Et("je verifie si email du client c'est {string}")
    public void je_verifie_si_email_du_client_c_est(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Et("j'ai le pavé du billing adresse bien affiché")
    public void j_ai_le_pavé_du_billing_adresse_bien_affiché() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Alors("l'adresse est bien affiché")
    public void l_adresse_est_bien_affiché() {
        // Write code here that turns the phrase above into concrete actions

    }
}
