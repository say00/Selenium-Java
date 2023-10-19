package STFC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginPage {

	public void login() {

		System.setProperty("webdriver.chrome.driver", "/Users/humanity/Documents/IntelliJ Projects/Selenium Java/Selenium Java/.idea/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Locators locators = new Locators();

		if (driver.findElement(locators.loginButton).isDisplayed()) {
			driver.findElement(locators.loginButton).click();

			//Enter username
			driver.findElement(locators.username).sendKeys("jovanmil87@gmail.com");
			driver.findElement(locators.submitUsername).click();

			//Enter password
			driver.findElement(locators.password).sendKeys("edf!S951363");
			driver.findElement(locators.submitPassword).click();
			System.out.println("Login successful");
		}
	}
}