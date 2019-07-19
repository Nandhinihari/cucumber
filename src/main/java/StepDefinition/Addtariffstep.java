package StepDefinition;

import org.junit.Assert;

import ObjectRepository.AddTarriff;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Addtariffstep extends Base{
	
	@When("the user fill in valid tariff plan details {string}, {string},{string},{string},{string},{string},{string}")
	public void the_user_fill_in_valid_tariff_plan_details(String monthrent, String freelocalmin, String freeintermin,
			String freesmspack, String localmincharge, String intermincharge, String smscharges) {

		AddTarriff addtariff = new AddTarriff();

		type(addtariff.getMonthRent(), monthrent);
		type(addtariff.getFreeinter_min(), freelocalmin);
		type(addtariff.getFreeinter_min(), freeintermin);
		type(addtariff.getFreesms(), freesmspack);
		type(addtariff.getLocalmin_char(), localmincharge);
		type(addtariff.getInt_char(), intermincharge);
		type(addtariff.getSms_char(), smscharges);
	}

	@When("the user clicks submit button in add tariff plan page")
	public void the_user_clicks_submit_button_in_add_tariff_plan_page() {
		AddTarriff addtariff = new AddTarriff();

		
		btn(addtariff.getSub());

	}

	@Then("the user should see the success message")
	public void the_user_should_see_the_success_message() {
		AddTarriff addtariff = new AddTarriff();


		Assert.assertTrue(addtariff.getSuccesmsg().isDisplayed());
	}

}
