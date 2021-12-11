package basic1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {
	public static void main(String[] args) {
meth1();
	}

	public static WebDriver chrome() {

		System.setProperty("webdriver.chrome.driver", "F:\\Work\\nirmal_selenium\\pracdemo\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://jqueryui.com/droppable/");

		return driver;
	}

	public static void meth1() {
		
		WebDriver driver = chrome();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")))	;
	Actions act=new Actions(driver);
	act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		//driver.findElement(By.id("draggable")).click();
	driver.switchTo().defaultContent();
	}

}
