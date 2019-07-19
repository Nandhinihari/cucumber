package StepDefinition;

import org.openqa.selenium.WebElement;

import ObjectRepository.HomePage;
import cucumber.api.java.en.Given;

public class Homepagestep extends Base {
	@Given("the user is in add customer page.")
	public void the_user_is_in_add_customer_page() {
		HomePage home = new HomePage();
		btn(home.getAddcustomer());
	}


	@Given("The user is in add tariff plan page")
	public void the_user_is_in_add_tariff_plan_page() {
		HomePage home = new HomePage();
		btn(home.getAddcustomer());

	}
	
	@Given("the user is in add Tariff plan to customer page.")
	public void the_user_is_in_add_Tariff_plan_to_customer_page() {
		HomePage home = new HomePage();
		btn(home.getAddTarriffPlanToCustomer());
	}
	
	@Given("the user is in add Pay Billing page.")
	public void the_user_is_in_add_Pay_Billing_page() {
		HomePage home = new HomePage();
		btn(home.getPayBilling());
	}
}
