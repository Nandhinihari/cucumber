package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.Hooks;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class HomePage extends Base {
	public HomePage() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(xpath="(//a[text()='Add Customer'][1])")
	private WebElement addcustomer;
	
	@FindBy(xpath="(//a[text()='Add Tariff Plan']")
	private WebElement addtarriffplan;
	
	@FindBy(xpath="(//a[text()='Add Tariff Plan to Customer'])[1]")
	private WebElement addTarriffPlanToCustomer;
	
	@FindBy(xpath="(//a[text()='Pay Billing'])[1]")
	private WebElement payBilling;

	public WebElement getAddTarriffPlanToCustomer() {
		return addTarriffPlanToCustomer;
	}

	public WebElement getPayBilling() {
		return payBilling;
	}

	public WebElement getAddcustomer() {
		return addcustomer;
	}

	public WebElement getAddtarriffplan() {
		return addtarriffplan;
	}
	
	
	
}
