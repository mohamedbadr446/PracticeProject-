package Pages;


import Constante.Xpaths;
import Utils.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccount extends Tools {

    @FindBy(xpath = Xpaths.myAccount)
    WebElement myaccount;

    @FindBy(xpath = Xpaths.logoHome)
    WebElement logohome;

    @FindBy(xpath = Xpaths.verifHome)
    WebElement verifhome;
    @FindBy(xpath = Xpaths.logoHome)
    private WebElement logo;
    @FindBy(xpath = Xpaths.loginVF)
    private WebElement loginVf;

    @FindBy(xpath = Xpaths.logOut)
    private WebElement logOut;
    public Myaccount() {

        PageFactory.initElements(driver,this);
    }

    public void cliqueMyaccount()
    {
       clickElement(myaccount);
    }
    public void cliqueLogo()  {

        clickElement(logohome);

    }

    public void verifhome(String text)
    {
        checkElement(verifhome,text);
    }
    public void verifierLogo()
    {
        if(logo.isEnabled()){
            System.out.println("OK Logo");
        }else {
            System.out.println("KO Logo");
        }
    }
    public void clickLogOut()
    {
        clickElement(logOut);
    }

    public void verfierLogOut(String text)
    {
        checkElement(loginVf,text);
    }
}
