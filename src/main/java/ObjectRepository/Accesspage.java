package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.Hooks;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class Accesspage extends Base{
	public  Accesspage() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(xpath = "//table//h3")
	private WebElement Accessmsg;
	
	public WebElement getAccessmsg() {
		return Accessmsg;
	}

	

}
