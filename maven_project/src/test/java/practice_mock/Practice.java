package practice_mock;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.redbus.in/");
		System.out.println(driver.getTitle());
		
		WebElement Help = driver.findElement(By.xpath("//span[text()=\"Help\"]"));
		Help.click();
		Set<String> id = driver.getWindowHandles();
		Iterator<String> id1 = id.iterator();
		String parent_id = id1.next();
		System.out.println(parent_id);
		String Child_id = id1.next();
		System.out.println(Child_id);
		driver.switchTo().window(Child_id);
		
		WebElement Account = driver.findElement(By.xpath("//span[text()=\"Account\"]"));
		Account.click();
		
	    driver.switchTo().window(parent_id);
	    
	    driver.quit();
	
		
		
		
		
		
		
	}

}
