package automate;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_Class;

public class Mouse_Action_Class extends Base_Class {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		launch_browser("Chrome");
		takescreenshot("browser");
		
		Hiturl("https://www.jeevansathi.com/");
		takescreenshot("jeevansathi_webpage");
		
		Actions action = new Actions(driver);
		
		
		WebElement profile = driver.findElement(By.xpath("//p[text()=\"BROWSE PROFILES BY\"]"));
		 action.moveToElement(profile).perform();
		 takescreenshot("profile");
		 
		
		WebElement City = driver.findElement(By.xpath("//p[text()=\"City\"]"));
		 action.moveToElement(City).perform();
		 takescreenshot("City");
		 
		 
		WebElement Pune = driver.findElement(By.xpath("//a[text()=\"Pune\"]"));
		action.moveToElement(Pune).click().build().perform();
		takescreenshot("Pune");
		
		System.out.println("to current webpage title is:"+driver.getTitle());
		
		WebElement Help = driver.findElement(By.xpath("//a[text()=\"HELP\"]"));
	    action.moveToElement(Help).contextClick().perform();
	    takescreenshot("Help");
	    
	  WebElement Mail = driver.findElement(By.cssSelector("input#email"));
	//  Mail.click();
	//  Mail.sendKeys("abcd");
	//  action.doubleClick(Mail).perform();
	  
	 action.moveToElement(Mail).click().sendKeys("abcd").doubleClick().build().perform();
	 takescreenshot("Mail");
	  
	  Thread.sleep(3000);
	  
	  action.keyDown(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(3000);
	  action.keyDown(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(3000);
	  action.keyDown(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(3000);
	  action.keyDown(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(3000);
	  action.keyDown(Keys.PAGE_DOWN).build().perform();
	  
	  takescreenshot("page_down");
	  
	  Thread.sleep(3000);
	  action.keyDown(Keys.PAGE_UP).build().perform();
	  Thread.sleep(3000);
	  action.keyDown(Keys.PAGE_UP).build().perform();
	  Thread.sleep(3000);
	  action.keyDown(Keys.PAGE_UP).build().perform();
	  Thread.sleep(3000);
	  action.keyDown(Keys.PAGE_UP).build().perform();
	  
	  takescreenshot("page_up");
	  
	  
	  //Use sendkeys
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(3000);
	  
	  action.sendKeys(Keys.PAGE_UP).build().perform();
	  
	  driver.close();
	  
	  
	  
	  
	  
	  
	  
		
	
		
		

	}

}
