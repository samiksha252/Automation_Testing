package window_handles;

import java.time.Duration;


import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Parent_Child_Window {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		 driver.manage() .window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 
		 driver.get("https://www.naukri.com/"); 
		 
		 
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  
		  driver.findElement(By.xpath("//a[text()=\"Careers\"]")).click();
			
		  
		 Set<String> windows = driver.getWindowHandles();
		  Iterator<String> id = windows.iterator();
		  
		  Thread.sleep(3000);
		  String parent_id = id.next();
		  System.out.println("The parent id is: "+parent_id);
		  
		  Thread.sleep(3000);
		  String child_id = id.next();
		  System.out.println("The child id is: "+child_id);
		  
		  Thread.sleep(3000);
		  driver.switchTo().window(child_id);
		  System.out.println("Shifted to child window");
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[text()=\"About\"]")).click();
		  System.out.println("Clicked on about");
		  
		  Thread.sleep(3000);
		  driver.switchTo().window(parent_id);
		  System.out.println("Back to parent window");
		  
		  Actions action = new Actions(driver);
		  action.keyDown(Keys.PAGE_UP);
		  
		  action.keyDown(Keys.PAGE_UP);
		  
		   driver.quit();
		


	}

}
