package dynamic_code;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_Class {
	
	public static WebDriver driver;
	public static String Projectpath = System.getProperty("user.dir");
	
	
	public static void launch_browser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")){
			
			driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("Firefox")){
			
	        driver = new  FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("Edge")) {
			
			driver = new EdgeDriver();
		}
		System.out.println("The Browser Launch is:" + browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		}
	  public static void Hiturl(String Url) {
		 
	  driver.get(Url);
	  System.out.println(driver.getTitle());
	   }
	            // First way to takesScreenshot  
	  public static void takescreenshot(String Screenshot_name) throws IOException {
		  TakesScreenshot t1 = (TakesScreenshot) driver;
		File Source = t1.getScreenshotAs(OutputType.FILE);
		File target = new File("./reports/"+Screenshot_name+".png");
		FileHandler.copy(Source, target);
		
	  }
	      // Second way to takesScreenshot
	  public static void Screenshot(String Filename) throws IOException  {
		  TakesScreenshot t2 = (TakesScreenshot) driver;
		File Source1 = t2.getScreenshotAs(OutputType.FILE);
	    File target1 = new File(Projectpath+"\\Redbus_Screenshot\\"+Filename+".png");
		FileHandler.copy(Source1, target1);
		
	  
	 }
}


