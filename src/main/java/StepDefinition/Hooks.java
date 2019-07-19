package StepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
	@Before
	public static void beforeMethod() {
		WebDriver driver=getDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");

	}
	@After
	public static void afterMethod() {
		driver.close();

	}

}
