import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarTests {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/jovanmilosevic/IdeaProjects/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.id("form-field-travel_comp_date")).click();

		/**
		 * While loop will keep on executing until it becomes false. In this case code will keep clicking on
		 * next button until "January" is displayed.
		 */
		while (!driver.findElement(By.className("cur-month")).getText().equalsIgnoreCase("January")) {
			driver.findElement(By.className("flatpickr-next-month")).click();
		}

		List<WebElement> dates = driver.findElements(By.cssSelector("span[class='flatpickr-day ']"));

		//We are extracting string "date" from the calendar, comparing it, and if found, stopping with the code execution.
		for (int i = 0; i < dates.size(); i++) {

			String text = driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {

				driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).get(i).click();
				break;
			}
		}
		driver.quit();
		Thread.sleep(1500);
	}
}