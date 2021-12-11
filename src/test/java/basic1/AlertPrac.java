package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPrac {
	
	
	public static void metho1() {
		System.setProperty("webdriver.chrome.driver", "F:\\Work\\nirmal_selenium\\pracdemo\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("alertbtn")).click();
	    System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("name")).sendKeys("Nirmal");
		driver.findElement(By.id("confirmbtn")).click();
		 System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	
		System.out.println("end");
		
	}
	
	public static void main(String[]args) {
		metho1();
		
	}
	
	

}
