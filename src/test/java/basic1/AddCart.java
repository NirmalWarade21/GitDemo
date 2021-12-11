package basic1;



import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCart {

	public static void addItem(WebDriver driver,String[] item) {

		
		int r=0;
		// System.out.println("start list");
		List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for (int i = 0; i < product.size(); i++) {
			System.out.println("start for");
			
			String[] name = product.get(i).getText().split("-");
			String name1 = name[0].trim();
			System.out.println(name1);
			
			List<String> itemlist= Arrays.asList(item); 
			
			if (itemlist.contains(name1)) {
				System.out.println("start if");
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				r++;
				
				if (r==item.length) {
					System.out.println("Connt of R = "+r);
					break;
				}
			}

		}
		
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		
	driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
	
driver.findElement(By.cssSelector("button.promoBtn")).click();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
wait.until(ExpectedConditions.visibilityOfElementLocated( By.cssSelector("span.promoInfo")));
String str = driver.findElement(By.cssSelector("span.promoInfo")).getText();
System.out.println(str);

	}

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Work\\nirmal_selenium\\pracdemo\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] item= {"Beetroot","Beans"};
		
		addItem(driver ,item);
	}

}
