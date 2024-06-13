package calender;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_Class;

public class Calender extends Base_Class {

	public static void main(String[] args) {

		launch_browser("Chrome");

		Hiturl("https://www.railyatri.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		WebElement calender = driver.findElement(By.xpath("//input[@id=\"datepicker_train\"]"));
		calender.click();
		
//	int date=29;
		while (true) {

			String Month_Year = driver.findElement(By.xpath("(//th[@class=\"datepicker-switch\"])[1]")).getText();
			System.out.println("The current month and year is: " + Month_Year);

			if (!(Month_Year.equalsIgnoreCase("September 2024"))) {

				// click on next button
				driver.findElement(By.xpath("(//th[@class=\"next\"])[1]")).click();
			} else {
				break;
			}
		}
		// click on date
		//driver.findElement(By.xpath("//td[text()='"+date+"']")).click();
         
          
		driver.findElement(By.xpath("//td[text()=\"14\"]")).click();
		System.out.println("The selected date is :" + calender.getAttribute("value"));

	}

}
