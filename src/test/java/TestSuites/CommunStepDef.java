package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;

public class CommunStepDef {
	@Given("utilisateur est conectee avec le bon username {string} et le bon password {string}")
	public void utilisateur_est_conectee_avec_le_bon_username_et_le_bon_password(String nom, String pwd) {
		Config.confChrome();
		Config.driver = new ChromeDriver();
		Config.maximaseWindow();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(url);
		LoginPage login = new LoginPage();
		login.connect(nom, pwd);
		
	}


}
