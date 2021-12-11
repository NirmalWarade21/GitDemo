package basic1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Drop {


	
	public static void dropdown1() throws InterruptedException {
	
		//System.setProperty("webdriver.gecko.driver","F:\\Work\\nirmal_selenium\\pracdemo\\jars\\geckodriver.exe" );
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Work\\nirmal_selenium\\pracdemo\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.close();
		
		/*
		  Select sel=new
		  Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		  sel.selectByValue("USD"); System.out.println("selectByValue");
		  sel.selectByIndex(0); System.out.println("selectByIndex");
		  sel.selectByVisibleText("AED"); System.out.println("selectByVisibleText");
		  
		 
		  driver.findElement(By.id("divpaxinfo")).click();
		 
		  Thread.sleep(2000); driver.findElement(By.id("hrefIncAdt")).click();
		  
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 
		 driver.findElement(By.id("autosuggest")).sendKeys("IND"); Thread.sleep(3000);
		 
		 List<WebElement> option = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		  
		 System.out.println(option);
		 
		 for (WebElement opt:option) { if (opt.getText().equalsIgnoreCase("India")) {
		  opt.click(); break; } }
		 */ 
		 
		  driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.cssSelector("li a[value=\"GOI\"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		  driver.findElement(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='CCU']")).click();
		  
		/* 
		  System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isDisplayed());
		 //driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isDisplayed(); 
		  System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isEnabled());
		  System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		  Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		  
		  
		  driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		  System.out.println("after checkbox  click");
		  System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isDisplayed());
		  System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isEnabled());
		  System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		  Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		  
		  System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		 */
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first'] //td/a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
		
		
		
	}
	
	public static void main (String[]args) throws InterruptedException {
		dropdown1();
	}
	
	
}
