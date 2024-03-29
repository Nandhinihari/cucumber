package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.Hooks;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class AddTarriff extends Base {
	public AddTarriff() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(id = "rental1")
	private WebElement monthRent;

	@FindBy(id = "local_minutes")
	private WebElement freeloc_min;

	@FindBy(id = "inter_minutes")
	private WebElement freeinter_min;

	@FindBy(id = "sms_pack")
	private WebElement freesms;

	@FindBy(id = "minutes_charges")
	private WebElement localmin_char;

	@FindBy(id = "inter_charges")
	private WebElement int_char;

	@FindBy(id = "sms_charges")
	private WebElement sms_char;

	@FindBy(name="submit")
	private WebElement sub;
	
	@FindBy(xpath="//section[@id=\"main\"]//h2")
	private WebElement sucessmsg;
	
	public WebElement getSuccesmsg() {
		return getSuccesmsg();
	}

	public WebElement getSub() {
		return sub;
	}

	public WebElement getMonthRent() {
		return monthRent;
	}

	public WebElement getFreeloc_min() {
		return freeloc_min;
	}

	public WebElement getFreeinter_min() {
		return freeinter_min;
	}

	public WebElement getFreesms() {
		return freesms;
	}

	public WebElement getLocalmin_char() {
		return localmin_char;
	}

	public WebElement getInt_char() {
		return int_char;
	}

	public WebElement getSms_char() {
		return sms_char;
	}


}
