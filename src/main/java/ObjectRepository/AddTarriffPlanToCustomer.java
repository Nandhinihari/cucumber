package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.Hooks;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class AddTarriffPlanToCustomer extends Base {
	public AddTarriffPlanToCustomer() {
		PageFactory.initElements(Hooks.driver, this);
	}
	
	@FindBy(name="customer_id")
	private WebElement cust_id;
	@FindBy(name="submit")
	private WebElement sub;
	@FindBy(xpath="//section[@id=\"main\"]")
	private WebElement sucesmessage;
	public WebElement getCust_id() {
		return cust_id;
	}
	public WebElement getSub() {
		return sub;
	}
	public WebElement getSucesmessage() {
		return sucesmessage;
	}


}
