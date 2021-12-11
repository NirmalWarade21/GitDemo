package basic1;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Linkpractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		brkLink();

	}

	public static WebDriver chrome() {

		System.setProperty("webdriver.chrome.driver", "F:\\Work\\nirmal_selenium\\pracdemo\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

	public static void Screensot() throws Exception {

		WebDriver driver = chrome();
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("E:\\screenshot\\time.png"));
		System.out.println("screenshot taken");

		System.out.println();
	}

	public static void linkprac1() throws Exception {

		WebDriver driver = chrome();

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3-
		WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());

		// 4- click on each link in the coloumn and check if the pages are opening-
		for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);

		} // opens all the tabs
		Set<String> abc = driver.getWindowHandles();// 4
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

	public static void brkLink() throws Exception {

		// TODO Auto-generated method stub

		WebDriver driver = chrome();

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

	SoftAssert a = new SoftAssert();

		for (WebElement link : links)

		{

			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

			conn.setRequestMethod("HEAD");

			conn.connect();

			int respCode = conn.getResponseCode();

			System.out.println(respCode);

			a.assertTrue(respCode < 400, "The link with Text" + link.getText() + " is broken with code" + respCode);
			
		//	assertTrue(respCode < 400, "The link with Text" + link.getText() + " is broken with code" + respCode);
			
		}

		//a.assertAll();
		
		
	}
	
	private static Object getReturnCode(WebElement link) {

		// TODO Auto-generated method stub

		return null;
	

}
	
	
	
	
	
}
