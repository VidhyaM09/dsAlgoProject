package stepDefinition;

import com.dsAlgo.Pages.HomePage;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	HomePage homePage = new HomePage();

	@Given("user is on the home page")
	public void user_is_on_the_home_page() throws Throwable {
		;
	}

	@When("user click on the sign in link")
	public void user_click_on_the_sign_in_link() {
		homePage.clickSigninLink();
	}

	@Then("user redirected to login page")
	public void user_redirected_to_login_page() {

	}

	@Given("user clicks on Get Started link without login")
	public void user_clicks_on_get_started_link_without_login() {
		homePage.getStartedLink();
	}

	@Given("user clicks on register link")
	public void user_clicks_on_register_link() {
		homePage.clickRegisterLink();
	}

	@But("user get alert message {string}")
	public void user_get_alert_message(String string) {

	}

	@Given("user clicks on dropdown {string}")
	public void user_clicks_on_dropdown(String menu) {
		homePage.dropDownMenu(menu);
	}

	@Then("user redirected to register page")
	public void user_redirected_to_register_page() {

	}

}
