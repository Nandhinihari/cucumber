package StepDefinition;

import org.junit.Assert;

import ObjectRepository.Accesspage;
import cucumber.api.java.en.Then;

public class Accesspagestep extends Base{
	
	@Then("the user should see the customer id generate.")
	public void the_user_should_see_the_customer_id_generate() {
		
		Accesspage access = new Accesspage();
		
		Assert.assertTrue(access.getAccessmsg().isDisplayed());
	}

	

}
