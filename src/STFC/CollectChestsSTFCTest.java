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

//		WebElement dailyMissionKeyDropFrame = driver.findElement(locators.dailyMissionKeyDrop);
//		List<WebElement> dailyMissionKeyDropButton = dailyMissionKeyDropFrame.findElements(locators.claimButton);
//		try {
//			dailyMissionKeyDropFrame.findElement(locators.claimButton).isDisplayed();
//			dailyMissionKeyDropButton.get(0).click();
//			driver.findElement(locators.doneButton).click();
//			System.out.println("*Daily Mission Key Drop chest collected.");
//		} catch (Exception e) {
//			System.out.println("Daily Mission Key Drop chest already collected.");
//		}
//
//		webGift.click();
//
//		WebElement radioactiveTitaniteFrame = driver.findElement(locators.radioactiveTitanite);
//		List<WebElement> radioactiveTitaniteButton = radioactiveTitaniteFrame.findElements(locators.claimButton);
//		if (!radioactiveTitaniteButton.isEmpty()) {
//			radioactiveTitaniteButton.get(0).click();
//			driver.findElement(locators.doneButton).click();
//			System.out.println("*Radioactive Titanite chest collected.");
//		} else {
//			System.out.println("Radioactive Titanite chest already collected.");
//		}
//
//		WebElement twoTranswarpCellsFrame = driver.findElement(locators.twoTranswarpCells);
//		List<WebElement> twoTranswarpCellsButton = twoTranswarpCellsFrame.findElements(locators.claimButton);
//		try {
//			twoTranswarpCellsFrame.findElement(locators.claimButton).isDisplayed();
//			twoTranswarpCellsButton.get(0).click();
//			driver.findElement(locators.doneButton).click();
//			System.out.println("*2 Transwarp Cells chest already collected.");
//		} catch (Exception e) {
//			System.out.println("2 Transwarp Cells chest already collected.");
//		}
//
//		WebElement tenMinFreeChestFrame = driver.findElement(locators.tenMinFreeChest);
//		List<WebElement> tenMinFreeChestButton = tenMinFreeChestFrame.findElements(locators.claimButton);
//		try {
//			tenMinFreeChestFrame.findElement(locators.claimButton).isDisplayed();
//			tenMinFreeChestButton.get(0).click();
//			driver.findElement(locators.doneButton).click();
//			System.out.println("*10 Min Free Chest Collected.");
//		} catch (Exception e) {
//			System.out.println("10 Min Free Chest already collected.");
//		}
//
//		WebElement fourHrFreeChestFrame = driver.findElement(locators.fourHrFreeChest);
//		List<WebElement> fourHrFreeChestButton = fourHrFreeChestFrame.findElements(locators.claimButton);
//		try {
//			fourHrFreeChestFrame.findElement(locators.claimButton).isDisplayed();
//			fourHrFreeChestButton.get(0).click();
//			driver.findElement(locators.doneButton).click();
//			System.out.println("*4 Hr Free Chest Collected.");
//		} catch (Exception e) {
//			System.out.println("4 Hr Free Chest already collected.");
//		}
//
//		WebElement opticalDiodesFrame = driver.findElement(locators.opticalDiodes);
//		List<WebElement> opticalDiodesButton = opticalDiodesFrame.findElements(locators.claimButton);
//		try {
//			opticalDiodesFrame.findElement(locators.claimButton).isDisplayed();
//			opticalDiodesButton.get(0).click();
//			driver.findElement(locators.doneButton).click();
//			System.out.println("*Optical Diodes chest Collected.");
//		} catch (Exception e) {
//			System.out.println("Optical Diodes chest already collected.");
//		}
//
//		WebElement bonus24HrFreeChestFrame = driver.findElement(locators.bonus24HrFreeChest);
//		List<WebElement> bonus24HrFreeChestButton = bonus24HrFreeChestFrame.findElements(locators.claimButton);
//		try {
//			bonus24HrFreeChestFrame.findElement(locators.claimButton).isDisplayed();
//			bonus24HrFreeChestButton.get(0).click();
//			driver.findElement(locators.doneButton).click();
//			System.out.println("*Bonus 24 Hr Free Chest Collected.");
//		} catch (Exception e) {
//			System.out.println("Bonus 24 Hr Free Chest already collected.");
//		}
//
//		WebElement bajoranFavourFrame = driver.findElement(locators.bajoranFavour);
//		List<WebElement> bajoranFavourButton = bajoranFavourFrame.findElements(locators.claimButton);
//		try {
//			bajoranFavourFrame.findElement(locators.claimButton).isDisplayed();
//			bajoranFavourButton.get(0).click();
//			driver.findElement(locators.doneButton).click();
//			System.out.println("*Bajoran Favour Chest Collected.");
//		} catch (Exception e) {
//			System.out.println("Bajoran Favour Chest already collected.");
//		}
//
//		WebElement tetryonsChestFrame = driver.findElement(locators.tetryonsChest);
//		List<WebElement> tetryonsChestButton = tetryonsChestFrame.findElements(locators.claimButton);
//		try {
//			tetryonsChestFrame.findElement(locators.claimButton).isDisplayed();
//			tetryonsChestButton.get(0).click();
//			driver.findElement(locators.doneButton).click();
//			System.out.println("*Tetryons Chest Collected.");
//		} catch (Exception e) {
//			System.out.println("Tetryons Chest already collected.");
//		}
//
//		WebElement replicatorRationsFrame = driver.findElement(locators.replicatorRations);
//		List<WebElement> replicatorRationsButton = replicatorRationsFrame.findElements(locators.claimButton);
//		try {
//			replicatorRationsFrame.findElement(locators.claimButton).isDisplayed();
//			replicatorRationsButton.get(0).click();
//			driver.findElement(locators.doneButton).click();
//			System.out.println("*Replicator Rations Chest Collected.");
//		} catch (Exception e) {
//			System.out.println("Replicator Rations Chest already collected.");
//		}
//
//		WebElement ancientBeaconsFrame = driver.findElement(locators.ancientBeacons);
//		List<WebElement> ancientBeaconsButton = ancientBeaconsFrame.findElements(locators.claimButton);
//		try {
//			ancientBeaconsFrame.findElement(locators.claimButton).isDisplayed();
//			ancientBeaconsButton.get(0).click();
//			driver.findElement(locators.doneButton).click();
//			System.out.println("*Ancient Beacons Chest Collected.");
//		} catch (Exception e) {
//			System.out.println("Ancient Beacons Chest already collected.");
//		}
//
//		WebElement nadionSupplyFrame = driver.findElement(locators.nadionSupply);
//		List<WebElement> nadionSupplyButton = nadionSupplyFrame.findElements(locators.claimButton);
//		if (!nadionSupplyButton.isEmpty()) {
//			nadionSupplyButton.get(0).click();
//			driver.findElement(locators.doneButton).click();
//			System.out.println("*Nadion Supply chest collected.");
//		} else {
//			System.out.println("Nadion Supply chest already collected.");
//		}
//
//		WebElement condensedVenomFrame = driver.findElement(locators.condensedVenom);
//		List<WebElement> condensedVenomButton = condensedVenomFrame.findElements(locators.claimButton);
//		if (!condensedVenomButton.isEmpty()) {
//			condensedVenomButton.get(0).click();
//			driver.findElement(locators.doneButton).click();
//			System.out.println("*Condensed Venom chest collected.");
//		} else {
//			System.out.println("Condensed Venom chest already collected.");
//		}
//
//		WebElement irviniteStockpileFrame = driver.findElement(locators.irviniteStockpile);
//		List<WebElement> irviniteStockpileButton = irviniteStockpileFrame.findElements(locators.claimButton);
//		if (!irviniteStockpileButton.isEmpty()) {
//			irviniteStockpileButton.get(0).click();
//			driver.findElement(locators.doneButton).click();
//			System.out.println("*Irvinite Stockpile chest collected.");
//		} else {
//			System.out.println("Irvinite Stockpile chest already collected.");
//		}

		System.out.println("***All chests collected.");

		Thread.sleep(2000);
		driver.quit();
	}

}
