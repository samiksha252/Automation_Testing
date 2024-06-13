package automate;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_Class;

public class Jquery_droppable extends Base_Class{

	public static void main(String[] args) {
		
		launch_browser("chrome");
		Hiturl("https://jqueryui.com/droppable/");
		
		WebElement Frame1 = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(Frame1);
		
		Actions action = new Actions(driver);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));

		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		 action.dragAndDrop(drag, drop).build().perform();
		
		//action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		
		//action.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		 
		 
		 //return from frame
		 driver.switchTo().defaultContent();
		WebElement Selectable = driver.findElement(By.xpath("//a[text()=\"Selectable\"]"));
		Selectable.click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
