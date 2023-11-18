package STFC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class CollectChestsSTFCTest extends LoginPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/humanity/Documents/IntelliJ Projects/Selenium Java/Selenium Java/.idea/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Locators locators = new Locators();

		driver.navigate().to("https://startrekfleetcommand.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);

		//Click on StoreBig
		driver.findElement(locators.storeMainButton).click();

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

		//Click on Store
		driver.findElement(locators.storeButton).click();

		//Click on Web Gifts
		WebElement webGift = driver.findElement(locators.webGifts);
		webGift.click();
		Thread.sleep(3000);

		//Collect Chests
		String[] chestNames = { "Daily Mission Key Drop", "Radioactive Titanite", "Cannot Collect More Transwarp Cells",
				"10 Min Free Chest", "4 Hr Free Chest", "Optical Diodes", "BONUS 24 Hr Free Chest",
				"Cannot Collect More Tetryons", "Replicator Rations", "Ancient Beacons", "Nadion Supply",
				"Condensed Venom", "Irvinite Stockpile Full" };

		List<WebElement> chests = driver.findElements(locators.chestNames);

		for (int i = 0; i < chests.size(); i++) {

			String chestName = chests.get(i).getText();
			List chestNeeded = Arrays.asList(chestNames);

			if (chestNeeded.contains(chestName)) {
				if (!driver.findElements(locators.claimButton).isEmpty()) {
					webGift.click();
					Thread.sleep(1500);
					driver.findElements(locators.claimButton).get(i).click();
					Thread.sleep(1500);
					//driver.findElements(locators.doneButton).get(i).click();
					driver.findElement(locators.doneButton).click();
					Thread.sleep(1500);
					System.out.println("*" + chestName + " collected.");
				} else {
					System.out.println(chestName + " already collected.");
				}
			}
		}

		System.out.println("***All chests collected.");

		Thread.sleep(2000);
		driver.quit();
	}

}
