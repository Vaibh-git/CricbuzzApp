package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		
	super(driver);
	
	}
	
	@FindBy(xpath ="//span[@class='cb-plus-ico cb-user-icon']") WebElement MyAccount;
	@FindBy(xpath = "//nav[@id='cb-main-menu']//img[@id='cb-logo-main-menu']") WebElement Home_Btn;
	
	public void Myaccount() {
		
		MyAccount.click();
	}
    public void Home_Btn() {
		
    	Home_Btn.click();
	}
		
}
