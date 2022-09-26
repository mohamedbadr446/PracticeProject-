package Pages;

import Constante.JDD;
import Constante.Xpaths;
import Utils.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.SetUp;

public class Pannier extends Tools {



    @FindBy(xpath = Xpaths.Pannier)
    private WebElement panier;
    @FindBy(xpath = Xpaths.check_prod)
    private WebElement Check_Prod;
    @FindBy(xpath = Xpaths.shop)
    private WebElement shop;
    @FindBy(xpath = Xpaths.produit)
    private WebElement produit;
    @FindBy(xpath = Xpaths.addToBasket)
    private WebElement xpath_AddToBasket;
    @FindBy(xpath = Xpaths.viewBasket)
    private WebElement viewBasket;
    @FindBy(xpath = Xpaths.price)
    private WebElement price;
    @FindBy(xpath = Xpaths.pricePannie)
    private WebElement pricePannie;


    public Pannier() {
        PageFactory.initElements(driver, this);
    }

    public void clickShop() {
        clickElement(shop);
    }

    public void clickProduit() {
        new Actions(driver).moveToElement(produit).click().build().perform();

        //clickElement(produit);
    }

    public void clickAddToBasket() {
        clickElement(xpath_AddToBasket);
    }


    public void clickPanier() {
        clickElement(panier);
    }


    public void verfierPagePannier(String verf) {
        checkElement(Check_Prod, verf);
    }

    public void clickViewBasket()
    {
        clickElement(viewBasket);
    }

    public String getPrice()
    {
        return price.getText();
    }
    public void verifierPrix(String text)
    {
        checkElement(pricePannie,text);
        System.out.println(pricePannie.getText());
    }
}
