package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionprac {

	public static void main(String[] args) {
		first();

	}

	public static void first() {
		System.setProperty("webdriver.chrome.driver", "F:\\Work\\nirmal_selenium\\pracdemo\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("good");

		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("good")
				.build().perform();
		// act.doubleClick(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
		// act.contextClick(driver.findElement(By.id("twotabsearchtextbox"))).build().perform();
		// act.click(driver.findElement(By.id("nav-search-submit-button"))).build().perform();
	}
}
