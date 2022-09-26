package Pages;

import Constante.Xpaths;
import Utils.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginRegisterSucc extends Tools {



	@FindBy(xpath = Xpaths.myAccount)
	private WebElement myAccount;

	@FindBy(xpath = Xpaths.email_reg)
	private WebElement email_reg;

	@FindBy(xpath = Xpaths.pwd_reg)
	private WebElement pwd_reg;

	@FindBy(xpath = Xpaths.button_reg)
	private WebElement button_reg;
	@FindBy(xpath = Xpaths.zone_reg)
	private WebElement zone_reg;
	@FindBy(xpath = Xpaths.verifierpwd)
	private WebElement verifier_pwd;
	@FindBy(xpath = Xpaths.pagereg)
	private WebElement page_reg;
	@FindBy(xpath = Xpaths.logoHome)
	private WebElement logo;

	@FindBy(xpath = Xpaths.Register)
	private WebElement Register;


	public LoginRegisterSucc() {
		PageFactory.initElements(driver,this);
	}

	public void clickMyaccount() {
		clickElement(myAccount);
	}

	public void insertRegisterEmail(String email) {
		insertElement(email_reg,email);
	}

	public void insertRegisterPwd(String pwd) {

		for (int i = 0; i < pwd.length(); i++){
			char c = pwd.charAt(i);
			String s = new StringBuilder().append(c).toString();
			insertElement(pwd_reg,s);
		}

	}

	public void clickZoneRegister() {
		clickElement(zone_reg);
		clickElement(pwd_reg);

	}

	public void clickButtonRegister() {
		clickElement(button_reg);
	}

	public void verfierPwdSucc(String text) {
		checkElement(verifier_pwd,text);
	}

	public void verfierPageReg(String text) {
		checkElement(page_reg,text);
	}
	public void pageReg(String text) {
		checkElement(page_reg,text);
	}
	public void Register(String text) {
		checkElement(Register,text);
	}
	public void verifierBouton()
	{
		Assert.assertTrue(getElementIsEneble(button_reg));
	}
	public void verifierLogo()
	{

		if(logo.isEnabled()){
			System.out.println("OK Logo");
		}else {
			System.out.println("KO Logo");
		}

	}

}
