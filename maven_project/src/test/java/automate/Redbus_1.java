package automate;

import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_Class;

public class Redbus_1 extends Base_Class{

	public static void main(String[] args) throws IOException {
		
		launch_browser("Chrome");
		takescreenshot("browser");
		
		Hiturl("https://www.redbus.in/");
		takescreenshot("url");
		
		// First way to takesScreenshot
		WebElement Search_Buses = driver.findElement(By.cssSelector("button#search_button"));
		Search_Buses.click();
		Search_Buses.sendKeys("Pune");
		takescreenshot("Buses");
		
		//Second way to takesScreenshot
		WebElement To = driver.findElement(By.cssSelector("input#dest"));
		To.click();
		To.sendKeys("Nagpur");
		Screenshot("To_Buses");
		
		
		
		

	}

}
