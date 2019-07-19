package StepDefinition;

import java.util.Map;

import ObjectRepository.AddCustomer;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Addcustomerstep extends Base {
	
	AddCustomer addcust;
	@When("the user fill in the valid customer details.")
	public void the_user_fill_in_the_valid_customer_details(DataTable customerDetails) {

		 addcust = new AddCustomer();

		Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
		btn(addcust.getRdo_done());
		type(addcust.getTxt_fname(), customerDetailsMap.get("firstName"));
		type(addcust.getTxt_lname(),customerDetailsMap.get("lastName"));		
		type(addcust.getTxt_email(),customerDetailsMap.get("emailAdress"));
		type(addcust.getTxt_adress(),customerDetailsMap.get("address"));
		type(addcust.getTxt_telePno(),customerDetailsMap.get("phoneNum"));
	}

	@When("the user clicks the SUBMIT button.")
	public void the_user_clicks_the_SUBMIT_button() {

		

		btn(addcust.getBtn_submit());
	}
}
