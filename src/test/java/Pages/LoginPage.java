package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginPage {
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement submit;
	
	public LoginPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void connect(String userName , String pwd) {
		Config.attente(10);
		username.sendKeys(userName);
		password.sendKeys(pwd);
		submit.click();
		
	}
	
	

}
