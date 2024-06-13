package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import dynamic_code.Base_Class;

public class Snapdeal extends Base_Class{

	public static void main(String[] args) throws InterruptedException {
		
		launch_browser("Chrome");
		
		Hiturl("https://snapdeal.com/");
		
		// here we use web element methods
		 WebElement search = driver.findElement(By.cssSelector("input#inputValEnter"));
		 search.click();
		 search.sendKeys("Tops");
		 Thread.sleep(3000);
		 search.clear();
		 Thread.sleep(3000);
		 search.sendKeys("Kurtas");
		 Thread.sleep(3000);
		 System.out.println("The search button is Enabled in UI:"+search.isEnabled());
		 Thread.sleep(3000);
		 System.out.println("The search button is Displayed in UI:"+search.isDisplayed());
		 
		 Thread.sleep(3000);
		 driver.close();
		 
		 
		 
		
		
		
		
		
		

		
		
		
		
		
		
	

	}

}
