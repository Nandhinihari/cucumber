package StepDefinition;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\oxygen new\\Cucumber2\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void loadURL(String url) {
		driver.get(url);

	}

	public static void type(WebElement element, String name) {
		element.sendKeys(name);
	}

	public static void btn(WebElement element) {
		element.click();
	}
	public static void close() {
		driver.close();

	}
	
	

}
