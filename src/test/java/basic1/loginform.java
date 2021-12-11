package basic1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class loginform {
	
public static void login() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nirmal\\Downloads\\jars\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");

	driver.findElement(By.linkText("Forgot your password?")).click();
	//driver.close();
	Thread.sleep(1200);
	driver.findElement(By.xpath("//div/child::button[2]")).click();
	String text= driver.findElement(By.xpath("//h2/following::p")).getText();
	System.out.println(text);
	String[] abc=text.split("'");
	System.out.println(abc);
	String[] xyz=abc[1].split("'");
	System.out.println(xyz);
	String pqr=xyz[0];
	System.out.println(pqr);
	
}

public static void main (String []args) throws InterruptedException {
	login();
}
}