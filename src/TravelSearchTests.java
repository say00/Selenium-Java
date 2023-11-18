import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TravelSearchTests {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/humanity/Documents/IntelliJ Projects/Selenium Java/Selenium Java/.idea/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		//From
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		//To
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		//Select calendar departure
		Thread.sleep(1500);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		//Select number of passengers
		Thread.sleep(1500);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1500);

		for (int i = 0; i < 5; i++)  {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();


		//Click on Search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(3000);

		driver.quit();
	}

}
