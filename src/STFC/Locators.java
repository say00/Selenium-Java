package STFC;

import org.openqa.selenium.By;

public class Locators {

	public By storeMainButton = By.cssSelector(".header__nav__button.is-secondary");

	public By loginButton = By.cssSelector(".sc-gKPRtg.iSKlFD");
	public By username = By.cssSelector("input[placeholder='your.email@example.com']");
	public By submitUsername = By.cssSelector(".submitButton.emailInput_submitButtonText_yX-2I");
	public By password = By.id("input62");
	public By submitPassword = By.cssSelector(".button.button-primary");

	public By storeButton = By.id("navigation-item-to-store");
	public By webGifts = By.cssSelector("button[id='store-web-gift-tab-button'] p[class='sc-eDvSVe sc-jSUZER hKQPaV bJwpLU p14 regular Inter']");

	public By chestNames = By.cssSelector(".sc-eDvSVe.sc-jSUZER.hKQPaV.ifbDwf.p24.bold.Inter.break");
	public By dailyMissionKeyDrop = By.xpath("//p[normalize-space()='Daily Mission Key Drop']");
	public By radioactiveTitanite = By.id("web-gift-item-div-539798867");
	public By twoTranswarpCells = By.id("web-gift-item-div-927122049");
	public By tenMinFreeChest = By.id("web-gift-item-div-927122049");
	public By fourHrFreeChest = By.id("web-gift-item-div-498688795");
	public By opticalDiodes = By.id("web-gift-item-div-712553853");
	public By bonus24HrFreeChest = By.id("web-gift-item-div-1499692968");
	public By bajoranFavour = By.id("web-gift-item-div-6601389");
	public By tetryonsChest = By.id("web-gift-item-div-162182866");
	public By replicatorRations = By.id("web-gift-item-div-301336588");
	public By ancientBeacons = By.id("web-gift-item-div-584849772");
	public By nadionSupply = By.id("web-gift-item-div-1806346855");
	public By condensedVenom = By.xpath("//p[normalize-space()='Condensed Venom']");
	public By irviniteStockpile = By.xpath("//p[normalize-space()='Irvinite Stockpile Full']");

	public By claimButton = By.cssSelector(".sc-eDvSVe.sc-jSUZER.hKQPaV.bJwpLU.p16.bold.Inter");

	public By doneButton = By.cssSelector("button[class='sc-hLBbgP fNRjea secondary large WP-OfferDetailsModal-confirmButton cursor-pointer'] p[class='sc-eDvSVe sc-jSUZER hKQPaV bJwpLU p16 bold Inter']");
}
