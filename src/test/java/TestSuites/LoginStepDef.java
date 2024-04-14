package TestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	
	
	@Given("admin is on login page")
	public void admin_is_on_login_page() {
		Config.confChrome();
		Config.driver = new ChromeDriver();
		Config.maximaseWindow();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(url);
	  
	}

	@When("admin enter correct username and correct password")
	public void admin_enter_correct_username_and_correct_password() {
		LoginPage page = new LoginPage();
		page.connect("Admin", "admin123");
		
	    
	}

	@Then("admin is directed to the homePage")
	public void admin_is_directed_to_the_home_page() {
		HomePage page = new HomePage();
		String actualMessage = page.verifMessageHome();
		
		String expectedMessage ="Dash";
		
		Assert.assertEquals(expectedMessage, actualMessage);
	  
	}

}
