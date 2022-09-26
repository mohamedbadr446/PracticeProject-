package steap;

import Constante.JDD;
import Pages.LoginPage;
import Pages.Myaccount;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Quand;

public class US6_LogOut {

    Myaccount myaccount;

    public US6_LogOut()
    {
        myaccount=new Myaccount();
    }

    @Quand("je clique sur LogOut")
    public void je_clique_sur_log_out() {
        // Write code here that turns the phrase above into concrete actions
        myaccount.clickLogOut();
    }
    @Alors("je me suis déconnecter")
    public void je_me_suis_déconnecter() {
        // Write code here that turns the phrase above into concrete actions
        myaccount.verfierLogOut(JDD.loginVF);
    }

}
