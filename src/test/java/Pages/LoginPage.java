package Pages;

import Constante.Xpaths;
import Utils.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Tools {


    //	MyAcount


    @FindBy(xpath = Xpaths.myAccount)
    private WebElement myAccount;


    //	Login

    @FindBy(xpath = Xpaths.login_username)
    private WebElement username_Login;

    @FindBy(xpath = Xpaths.login_pwd)
    private WebElement pwd_Login;

    @FindBy(xpath = Xpaths.login_button)
    private WebElement button_Login;

    @FindBy(xpath = Xpaths.pageLoginVF)
    private WebElement xpathPageLogin;

    @FindBy(xpath = Xpaths.logoHome)
    private WebElement logo;
    @FindBy(xpath = Xpaths.accountDetail)
    private WebElement accountDetail;
    @FindBy(xpath = Xpaths.order)
    private WebElement order;


    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    public void clickMyaccount() {
        clickElement(myAccount);
    }
    public void insertLoginEmail(String emailSucc) {
      insertElement(username_Login,emailSucc);
    }

    public void insertLoginPwd(String pwd) {
        insertElement(pwd_Login,pwd);


    }

    public void clickButtonLogin() {
      clickElement(button_Login);
    }

    public void verfierPageLogin(String verf) {

        checkElement(xpathPageLogin,verf);
    }
    public void verifierLogo()
    {

        if(logo.isEnabled()){
            System.out.println("OK Logo");
        }else {
            System.out.println("KO Logo");
        }
    }

    public void clickAccountDetail(){
        clickElement(accountDetail);
    }
    public void clickOder()
    {
        clickElement(order);
    }
}
