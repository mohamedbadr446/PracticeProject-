package steap;

import Constante.JDD;
import Pages.LoginPage;
import Pages.Myaccount;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonnéque;
import io.cucumber.java.fr.Quand;

public class US3_Logo {

    private Myaccount myaccount;
    private LoginPage loginPage;

    public US3_Logo()
    {
        myaccount=new Myaccount();
        loginPage=new LoginPage();
    }

    @Etantdonnéque("je suis sur la page MyAccount")
    public void je_suis_sur_la_page_my_account() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.verfierPageLogin(JDD.msgPage);
    }
    @Quand("je clique sur le logo")
    public void je_clique_sur_le_logo() {
        // Write code here that turns the phrase above into concrete actions
        myaccount.cliqueLogo();
    }
    @Alors("je reviens à la page Home")
    public void je_reviens_à_la_page_home() {
        // Write code here that turns the phrase above into concrete actions
        myaccount.verifhome(JDD.msgVerifMyAcount);
    }
}
