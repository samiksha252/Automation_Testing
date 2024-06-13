package automate;

import java.io.File;



import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshot_Redbus {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Redbus_Screenshot/Redbus_browser.png");
		FileHandler.copy(source, target);
		
		driver.get("https://www.redbus.in/");
		System.out.println(driver.getTitle());
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./Redbus_Screenshot/Redbus_application.png");
		FileHandler.copy(source1, target1);
		
		WebElement From = driver.findElement(By.cssSelector("input#src"));
		From.click();
		From.sendKeys("Bhadrawati");
		
		
		String Projectpath = System.getProperty("user.dir");
		TakesScreenshot ts2= (TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File target2 = new File(Projectpath+"\\Redbus_Screenshot\\Redbus_From.png");
		FileHandler.copy(source2, target2);
		
		
		
		
		
		
	

	}

}
