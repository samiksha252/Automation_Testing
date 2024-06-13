package automate;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_Class;

public class Java_Script_Executor extends Base_Class {

	public static void main(String[] args) throws IOException, InterruptedException{
		
		launch_browser("Chrome");
		takescreenshot("Chrome_Browser");
		
		Hiturl("https://snapdeal.com/");
		takescreenshot("Snapdeal_webpage");
		
		
        WebElement Search = driver.findElement(By.cssSelector(" input#inputValEnter"));
        Search.click();
        Search.sendKeys("Tops");
        takescreenshot("Tops");
        
        // scroll the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1200)");
        takescreenshot("scroll");
        
        //scroll to bottom
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        takescreenshot("Scroll to bottom");
        
        //scroll up
        js.executeScript("window.scrollBy(0,-1200)");
        takescreenshot("Scrollup");
        
        // To refresh
        Thread.sleep(4000);
        js.executeScript("window.history.go(0)");
        takescreenshot("Refresh the Webpage");
        
        // Back
        Thread.sleep(4000);
        js.executeScript("window.history.back()");
        takescreenshot("back to browser");
        
        // Forward
        Thread.sleep(4000);
       js.executeScript("window.history.forward()");
        takescreenshot("Forward to snapdeal");
        
        Thread.sleep(4000);
        driver.close();
       
        
        
        

	}

}
