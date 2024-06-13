package keyboard_action;

import org.openqa.selenium.By;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_Class;

public class Keyboard  extends Base_Class{

	public static void main(String[] args) throws InterruptedException {
		
		launch_browser("Chrome");
		
		Hiturl("https://www.jeevansathi.com/");
		
		Actions action = new Actions(driver);
		
		WebElement Email = driver.findElement(By.cssSelector("input#email"));
		
		action.moveToElement(Email).click().sendKeys("PQRS").build().perform();
		
		// For select
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		// For Copy
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		action.keyDown(Keys.TAB).perform();
		action.keyDown(Keys.TAB).perform();
		action.keyDown(Keys.TAB).perform();
		
		//For Paste
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		// Page Down
		Thread.sleep(3000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		
		//Page Up
		Thread.sleep(3000);
		action.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		action.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		action.keyDown(Keys.PAGE_UP).build().perform();
		
		driver.close();
		
		
		
		

	}

}
