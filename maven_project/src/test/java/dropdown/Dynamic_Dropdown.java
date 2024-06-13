package dropdown;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		  driver.manage() .window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  
		 driver.get("https://www.railyatri.in/"); 
		 
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,400)");
		 
		          //entered station
		 WebElement from_station = driver.findElement(By.xpath("//input[@id=\"from_stn_input\"]"));
		from_station.sendKeys("Mumb");
		List<WebElement> from = driver.findElements(By.xpath("//ul[@id=\"ui-id-5\"]//child::li"));
		
		for(int a=0;a<=from.size();a++) {
			try {
				if(from.get(a).getText().equalsIgnoreCase("MUMBAI BANDRA TERMINUS | BDTS")) {
					from.get(a).click();
				}
			} catch (IndexOutOfBoundsException e) {
			
			}
	}
		System.out.println(driver.getTitle());
		System.out.println("The entered station is : "+from_station.getAttribute("value") );
		
		              // selected station
		WebElement To_station = driver.findElement(By.xpath("//input[@id=\"to_stn_input\"]"));
		To_station.sendKeys("Delh");
		List<WebElement> To = driver.findElements(By.xpath("//ul[@id=\"ui-id-6\"]//child::li"));
		
		for(int b=0;b<=To.size();b++) {
			try {
				if(To.get(b).getText().equalsIgnoreCase("DELHI HAZRAT NIZAMUDDIN | NZM")) {
					To.get(b).click();
				}
			} catch (IndexOutOfBoundsException e) {
			
			}
	}
		System.out.println("The Selected station is : "+To_station.getAttribute("value") );	
		
	                        	//Search button
		
		WebElement Search = driver.findElement(By.xpath("//button[@id=\"search_btn_dweb\"]"));
		Search.click();
		driver.close();
		
	}
	

}
	
	



		 
      