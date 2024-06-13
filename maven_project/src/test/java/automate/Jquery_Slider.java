package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_Class;

public class Jquery_Slider extends Base_Class {

	public static void main(String[] args) throws InterruptedException {
		
	launch_browser("Chrome");
	Hiturl("https://jqueryui.com/slider/");
	
	 WebElement Frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
	 driver.switchTo().frame(Frame);
	 
	 Actions action = new Actions(driver);
	 
     WebElement Slider = driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
     
     action.moveToElement(Slider).clickAndHold().moveByOffset(500, 0);
     
     Thread.sleep(3000);
     action.dragAndDropBy(Slider, -300, 0).build().perform();
     
     Thread.sleep(3000);
     action.clickAndHold(Slider).moveByOffset(400, 0).release(Slider).build().perform();
	 
	 
	
	

	}

}
