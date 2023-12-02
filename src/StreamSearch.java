import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertEquals;

public class StreamSearch {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/jovanmilosevic/IdeaProjects/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> veggies = driver.findElements(xpath("//tr/td[1]"));
        List<WebElement> filteredList =  veggies.stream().filter(veggie -> veggie.getText().contains("Rice")).toList();
        assertEquals(veggies, filteredList);

        driver.quit();
    }
}
