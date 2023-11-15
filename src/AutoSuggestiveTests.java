import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestiveTests {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/Users/humanity/Documents/IntelliJ Projects/Selenium Java/Selenium Java/.idea/chromedriver/chromedriver");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option: options) {

			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

		Thread.sleep(1000);
		driver.quit();
	}

}
