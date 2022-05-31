package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioList {

	public static void main(String[] args) throws InterruptedException {
//		1. Launch the URL https://www.ajio.com/
//			2. In the search box, type as "bags" and press enter
//			3. To the left  of the screen under " Gender" click the "Men"
//			4. Under "Category" click "Fashion Bags"
//			5. Print the count of the items Found. 
//			6. Get the list of brand of the products displayed in the page and print the list.
//			7. Get the list of names of the bags and print

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Men']/following::label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following::label[@for='Men - Fashion Bags']"))
				.click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("No of brands: " + list.size());
		System.out.println("List of brands as below:");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		List<WebElement> listOfBags = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int size = listOfBags.size();
		System.out.println("No of bags: " + size);
		System.out.println("List of bags as below: ");
		for (WebElement webelement : listOfBags) {
			String bagList = webelement.getText();
			System.out.println(bagList);

		}

	}

}
