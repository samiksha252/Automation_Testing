package alert;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_Class;

public class Alerts extends Base_Class {

	public static void main(String[] args) throws InterruptedException, IOException {

		launch_browser("Chrome");
		Thread.sleep(3000);
		takescreenshot("browser");

		Hiturl("https://demoqa.com/alerts");
		Thread.sleep(3000);
		takescreenshot("Url");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		takescreenshot("js scroll by");

		// Simple Alert

		driver.findElement(By.xpath("(//button[text()=\"Click me\"])[1]")).click();
		Alert Simple_alert = driver.switchTo().alert();
		System.out.println(Simple_alert.getText());
		Simple_alert.accept();
		Thread.sleep(3000);
		takescreenshot("Simple Alert");

		System.out.println("----------------------------------------------------");

		// Confirmation Alert

		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		Alert Confirm_alert = driver.switchTo().alert();
		System.out.println(Confirm_alert.getText());

		// to press ok
		Thread.sleep(3000);
		Confirm_alert.accept();

		// to press cancle

		// Thread.sleep(3000);
		// Confirm_alert.dismiss();

		WebElement Confirm_msg = driver.findElement(By.xpath("//span[@id=\"confirmResult\"]"));
		System.out.println(Confirm_msg.getText());
		takescreenshot("comfirm alert");

		System.out.println("------------------------------------------------------------");

		// prompt alert

		driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
		Alert prompt_alert = driver.switchTo().alert();
		System.out.println(prompt_alert.getText());
		prompt_alert.sendKeys("stp infotech");
		prompt_alert.accept();
		WebElement Message = driver.findElement(By.xpath("//span[@id=\"promptResult\"]"));
		System.out.println(Message.getText());
		takescreenshot("prompt alert");

	}

}
