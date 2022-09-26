package Pages;

import Constante.Xpaths;
import Utils.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends Tools {

    @FindBy(xpath = Xpaths.orderPage)
    private WebElement orderPage;

    @FindBy(xpath = Xpaths.buttonView)
    private WebElement buttonView;

    @FindBy(xpath = Xpaths.orderDeatail)
    private WebElement orderDetail;

    @FindBy(xpath = Xpaths.customerDetail)
    private WebElement customerDetail;

    @FindBy(xpath = Xpaths.produitDetail)
    private WebElement produitDetail;

    @FindBy(xpath = Xpaths.emailDeatail)
    private WebElement emailDetail;

    @FindBy(xpath = Xpaths.billingAdresse)
    private WebElement billingAdresse;

    @FindBy(xpath = Xpaths.adresse)
    private WebElement adresse;

    public OrderPage()
    {
        PageFactory.initElements(driver,this);
    }

    public void verifierOderPage(String text)
    {
        checkElement(orderPage,text);
    }

    public void verifierOderDetail(String text)
    {
        checkElement(orderDetail,text);
    }

    public void clickButtonView()
    {
        clickElement(buttonView);
    }

    public void verifierProduit(String text)
    {
        checkElement(produitDetail,text);
    }

    public void verifierCustomerDetail(String text)
    {
        checkElement(customerDetail,text);
    }

    public void verifierEmail(String text)
    {
        checkElement(emailDetail,text);
    }

    public void verifierBillingAdresse(String text)
    {
        checkElement(billingAdresse,text);
    }

    public void verifierAdresse()
    {
        System.out.println(adresse.getText());
    }

}