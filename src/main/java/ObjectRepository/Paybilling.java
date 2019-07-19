package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.Hooks;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class Paybilling extends Base{
	public Paybilling() {
		PageFactory.initElements(Hooks.driver, this);
	}
	
@FindBy(name="customer_id")
private WebElement customerId;

@FindBy(name="submit")
private WebElement pay_submit;

@FindBy(xpath="//section[@id=\"main\"]")
private WebElement paysucess;

public WebElement getCustomerId() {
	return customerId;
}

public WebElement getPay_submit() {
	return pay_submit;
}

public WebElement getPaysucess() {
	return paysucess;
}


}
