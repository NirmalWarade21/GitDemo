package basic1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_WIN {

	public static void main(String[] args) {
		handle();

	}

	public static WebDriver chrome() {

		System.setProperty("webdriver.chrome.driver", "F:\\Work\\nirmal_selenium\\pracdemo\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		return driver;
	}

	public static WebDriver firefox() {

		System.setProperty("webdriver.gecko.driver", "F:\\Work\\nirmal_selenium\\pracdemo\\jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		return driver;
	}

	public static void handle() {
		WebDriver driver = chrome();

		driver.findElement(By.className("blinkingText")).click();

		Set<String> window = driver.getWindowHandles(); // convert [firstwindow,second window]
		System.out.println(window);
		Iterator<String> it = window.iterator();
		String parentWindow = it.next(); // first window
		String childWindow = it.next(); // second window
		String thirdWindow = it.next();// third window {this is for chrome because it opens 2 window in first} no need
										// in firefox.
		driver.switchTo().window(thirdWindow); // for firefox change it to childWindow
		// String str = driver.findElement(By.xpath("//div/p[1]")).getText();
		String str = driver.findElement(By.cssSelector("div p.im-para.red")).getText().split("@")[1].split(" ")[0].trim();
		System.out.println(str);
		driver.switchTo().window(childWindow);
		driver.findElement(By.cssSelector("input#username")).sendKeys(str);

	}

}
