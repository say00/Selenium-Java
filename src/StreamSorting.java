import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class StreamSorting {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/jovanmilosevic/IdeaProjects/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        /**
         *Click on column
         *Capture all web elements into list
         *Capture text of all web elements into new (original) list
         *Sort on the original list of step 3 -> sorter list
         *Compare original list vs sorted list
         */

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector(".sort-icon.sort-descending")).click();
        List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));

        List<String> originalList = elementsList.stream().map(WebElement::getText).toList();
        List<String> sortedList = originalList.stream().sorted().toList();

        System.out.println("Original list: " + originalList);
        System.out.println("Sorted list: " + sortedList);

        assertEquals(sortedList, originalList);

        //Scan the name column with getText -> Cherry -> and print the price of it
        List<String> price;
        do {
            List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
            price = rows.stream().filter(s -> s.getText().contains("Cherry")).map(StreamSorting::getPriceVeggie).toList();
            price.forEach(System.out::println);
            if (price.isEmpty()) {
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }
        } while (price.isEmpty());


        driver.quit();
    }

    private static String getPriceVeggie(WebElement s) {

        return s.findElement(By.xpath("following-sibling::td")).getText();
    }
}
