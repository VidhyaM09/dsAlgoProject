package stepDefinition;

import com.dsAlgo.Pages.Treepage;
import com.dsAlgo.utils.LoggerLoad;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class TreePageSteps {

	Treepage tp=new Treepage();
	
	@Given("user is on tree page")
	public void user_is_on_tree_page() {
	    tp.clickGetStarted();
		LoggerLoad.info("User is currently on Tree Page");
	}

}
