package TestSuites;

import org.junit.Assert;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDef {


	@When("utlisateur clique sur le {string}")
	public void utlisateur_clique_sur_le(String menu) {
	   HomePage home = new HomePage();
	   home.clickOnMenuByName(menu);
	   
	}


	
	
	@Then("la page de meu est affiché {string}")
	public void la_page_de_meu_est_affiché(String actualMeesage) throws Exception {
Thread.sleep(3000);
		
HomePage home = new HomePage();

Assert.assertEquals(actualMeesage, home.verifMessageHome());
		
		
		Config.driver.quit();
	}


}
