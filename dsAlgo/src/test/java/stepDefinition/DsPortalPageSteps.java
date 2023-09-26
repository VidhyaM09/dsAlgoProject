package stepDefinition;

import com.dsAlgo.Pages.DsPortalPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DsPortalPageSteps {

	DsPortalPage dsPortalPage= new DsPortalPage();

	@Given("open the browser maximize and set the timeouts")
	public void open_the_browser_maximize_and_set_the_timeouts() throws Throwable {
		;
	}

	@And("load the url")
	public void load_the_url() throws Throwable {
		dsPortalPage.loadUrl();
	}

	@When("user click the {string} button")
	public void user_click_the_Get_Started_button(String getStarted) {
		dsPortalPage.clickGetStarted();
	}

	@Then("user redirects to the home page and verify the page title")
	public void user_redirects_to_the_home_page_and_verify_the_title() throws Throwable {
		//dsPortalPage.
		//dsPortalPage.verifyPageTitle();
	}

}
