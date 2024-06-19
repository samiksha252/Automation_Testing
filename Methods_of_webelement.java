package automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_of_webelement {

	public static void main(String[] args) throws InterruptedException {
		
		// Different methods of webelement
		
		// launch browser
	WebDriver driver= new ChromeDriver();
	
	// maximize window
	driver.manage().window().maximize();
	
	// apply implict wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	// hit the url using get method
     driver.get("https://www.facebook.com/");
     
     // find the element you wants to perform action
       WebElement username = driver.findElement(By.xpath("//input[@id=\"email\"]"));
       
       // use click method on the web element you find 
       username.click();
       
       // use sendkey to enter input
       username.sendKeys("Samiksha@gmail.com");
       
       WebElement password = driver.findElement(By.cssSelector(" input[type=\"password\"]"));
       password.click();
       
       Thread.sleep(2000);
       password.sendKeys("Sam@12");
       
       Thread.sleep(5000);
       
      // use clear method to remove the text enter as input 
        password.clear();
      
       WebElement forgotten_password = driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]"));
       
       // use gettext method to get  the text  of web element you  have find
       
       System.out.println("the text of webelement is :"+ forgotten_password.getText());
       forgotten_password.click();
       
        WebElement FindAccount = driver.findElement(By.cssSelector("input#identify_email"));
        FindAccount.click();
        FindAccount.sendKeys("Samiksha@gmail.com");  
        
        // use getattribute(); method
        // you had entered
        System.out.println("the text entered is: "+FindAccount.getAttribute("value"));
        
        // in this i have Insepect search button using tagname is id
        WebElement search = driver.findElement(By.cssSelector(" button#did_submit"));
        
        //  use getlocation(); to get x and y co-ordinate
        System.out.println("the x co-ordinate of search button is at:"+search.getLocation().x);
        System.out.println("the y co-ordinate of search button is at:"+search.getLocation().y);
        
        //  to get the size of Searchbox or  button
        System.out.println("the size of search button is:"+search.getSize());
        
        // to get the tagname  of webelement from dom.file
        System.out.println("the tagname of search button is:"+search.getTagName());
        
        // to check webelement is Displayed or not
        System.out.println("the search button is displayed in UI:" +search.isDisplayed());
        
        // to check webelement is Enabled or not
        System.out.println("The search button is Enabled in UI:"+search.isEnabled());
        
     // for page Refresh,forword,backword use method of webdriver interface
        Thread.sleep(3000);
        driver.navigate().refresh();
        
        Thread.sleep(3000);
        driver.navigate().back();
        
        Thread.sleep(3000);
        driver.navigate().forward();
        
        //  To close the webpage
        Thread.sleep(3000);
        driver.close();
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
      
      
      
      
       
       
       
       
     
     

	}

}
