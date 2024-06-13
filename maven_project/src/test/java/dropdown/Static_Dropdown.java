package dropdown;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1");

		WebElement create_profile = driver.findElement(By.cssSelector("select#reg_relationship"));
		create_profile.click();
		Select select = new Select(create_profile);
		select.selectByVisibleText("Sibling");

		WebElement Day = driver.findElement(By.cssSelector("select#reg_dtofbirth_day"));
		Day.click();
		Select select1 = new Select(Day);
		select1.selectByValue("22");

		WebElement Month = driver.findElement(By.cssSelector("select#reg_dtofbirth_month"));
		Month.click();
		Select select2 = new Select(Month);
		select2.selectByIndex(2);

		WebElement Year = driver.findElement(By.cssSelector("select#reg_dtofbirth_year"));
		Year.click();
		Select select3 = new Select(Year);
		select3.selectByIndex(3);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//option[text()=\"Never Married\"]")).click();
		
		// Here we use for loop
		driver.findElement(By.xpath("(//a[@class=\"chzn-single chzn-default\"])[1]")).click();
		List<WebElement> Religion = driver.findElements(By.xpath("//ul[@class='chzn-results']//child::li"));
        System.out.println(Religion.size());
        
        for(int a=0;a<=Religion.size();a++) {
        	if(Religion.get(a).getText().contains("Hindu")) {
        		Religion.get(a).click();
        	}
        }
        
       //System.out.println(driver.getTitle());

		//driver.close();

	}

}
