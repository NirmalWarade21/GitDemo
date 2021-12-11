package basic1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;




public class GmailLogin {
	
	public static void login() throws InterruptedException {
		String mail="thisisnirmal21@gmail.com";
		String Expected = "Wrong password. Try again or click Forgot password to reset it.";
		String pass= "qaws121@121qw22";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nirmal\\Downloads\\jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(mail);
		driver.findElement(By.xpath("//button/child::span[text()=\"Next\"]")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(pass);
		
		driver.findElement(By.xpath("//button/child::span[text()=\"Next\"]")).click();
		String wrongtext = driver.findElement(By.xpath("//span[text()='Wrong password. Try again or click Forgot password to reset it.']")).getText();
		assertEquals(wrongtext,Expected);
		driver.close();
	}
	
	public static void main(String[]args) throws InterruptedException {
		login();
		
	}


}
