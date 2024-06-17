package selenium_01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium {

	public static void main(String[] args) {
		// launch browser
		 WebDriver driver = new ChromeDriver();
		 
		 // Maximize Window
		 driver.manage() .window().maximize();
		 
		 // apply implict wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 // hit the url using get method
		 driver.get(" https://www.flipkart.com/"); 
		
		
		
		
		 
     

	}

}
