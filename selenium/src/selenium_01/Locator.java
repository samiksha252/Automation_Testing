package selenium_01;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.redbus.in/");
		
		// id 
	    driver.findElement(By.id("main_header_new"));
		driver.findElement(By.id(" mBWrapper"));
		
		// name
		driver.findElement(By.name("page_name "));
		driver.findElement(By.name(" mstar_api_url_add_cart"));
		
		// ClassName
		driver.findElement(By.className("sc-hSdWYo kkMvaX "));
		driver.findElement(By.className(" sc-cvbbAY bixBmU"));
		
		// linktext
		driver.findElement(By.linkText("Buy Again "));
		driver.findElement(By.linkText("Today's Deals "));
		
		// Partiallinktext
		
		driver.findElement(By.partialLinkText("Today's  "));
		driver.findElement(By.partialLinkText(" Health, Household "));
		
		// tagname
		driver.findElements(By.tagName("a"));
		driver.findElements(By.tagName("div"));
		
		// Css(Here we use different Combination)
		// tagname and idvalue
		// tagname # idvalue
		driver.findElement(By.cssSelector("input#isSetPwdMandatory"));
		driver.findElement(By.cssSelector("div#appDL_popup"));
		
		// tagname and Classvalue
		// tagname.Classvalue
		driver.findElement(By.cssSelector("div.push-overlay.hidden "));
		driver.findElement(By.cssSelector("div.push-container"));
		
		// tagname and attribute
		// tagname[attribute="valueofattribute"]
		driver.findElement(By.cssSelector("input[id=\"isHelpCenterUberExperienceSwitchEnabled\"] "));
		driver.findElement(By.cssSelector("input[id=\"loadCSS\"]"));
		
		// tagname and Multipleattribute
		// tagname[attribute1="valueofattribute1"][attribute2="valueofattribute2"]
		driver.findElement(By.cssSelector("div[id=\"gw-layout\"][class=\"a-section a-spacing-none aok-relative\"]"));
		driver.findElement(By.cssSelector("input[id=\"isHelpCenterUberExperienceSwitchEnabled\"][type=\"hidden\"]"));
		
		// Contains
	    // tagname[attribute*="attributevalue]
		driver.findElement(By.cssSelector("input[id*=\"webNoCost\"]"));
		driver.findElement(By.cssSelector("input[id*=\"cee\"]"));
		
		// StartsWith
		// tagname[attribute^="attributevalue"]
		driver.findElement(By.cssSelector("input[id^=\"product\"]"));
		driver.findElement(By.cssSelector("div[class^=\"onlyforhelp\"]"));
		
		// endswith
		// tagname[attribute$="attributevalue"]
		driver.findElement(By.cssSelector("input[id$=\"EnabledChars\"]"));
		driver.findElement(By.cssSelector("input[id$=\"Cnt\"]"));
		
		// pseudoclass
		// firstchild
		// tagname[attribute="attributevalue"] :first-child
		driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :first-child"));
		
		//lastchild
		// tagname[attribute="attributevalue"] :last-child
		driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :last-child"));
		
		// nth-child
		//tagname[attribute="attributevalue"] :nth-child(n)
		driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :nth-child(4)"));
		
		// nth-last-child
		// tagname[attribute="attributevalue"] :nth-last-child(n)
		driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :nth-last-child(10)"));
		
		//Absolute xpath
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
		
		
		//  xpath(Here We use Different combination)
	//	//tagname and attribute
		
		driver.findElement(By.xpath("//span[@id=\"PING_IFRAME_FORM_DETECTION\"] "));
		driver.findElement(By.xpath("//footer[@id=\"rh_footer_new\"]"));
		
		// tagname and Multipleattribute
	//	//tagname[@attribute1="value"][@attribute2="value"]
		
		driver.findElement(By.xpath("//button[@id=\"search_button\"][@class=\"sc-dxgOiQ gebgsH\"]"));
		driver.findElement(By.xpath("//form[@id=\"search-form\"][@class=\"style-scope ytd-searchbox\"]"));
		
		//AndOperator
		driver.findElement(By.xpath("//form[@id=\"search-form\"and@class=\"style-scope ytd-searchbox\"]"));
		driver.findElement(By.xpath("//div[@id=\"masthead-container\"and@class=\"style-scope ytd-app\"]"));
		
		// OR operator
		driver.findElement(By.xpath("//div[@id=\"sidebar_modal_right\"or@class=\"sidebar rightside bigwidth\"]"));
		driver.findElement(By.cssSelector("//div[@id=\"nav-main\"or@class=\"nav\"]"));
		
		// Contains
		//tagname=[contains(@attribute,"attributevalue")]
		driver.findElement(By.xpath("//section[contains(@class,\"homePageTopHooks-section dp\")]"));
		driver.findElement(By.xpath("//a[contains(@id,\"skipped\")]"));
		
		// StartsWith
		//  //tagname=[starts-with(@attribute,"attributevalue")]
		driver.findElement(By.xpath("//section[starts-with(@class,\"homePage\")]"));
		driver.findElement(By.xpath("//div[starts-with(@class,\"hgt\")]"));
		
		//xpath using text
	//	//tagname[text()=""]
		
	     driver.findElement(By.xpath("//a[text()=\"Health, Household & Personal Care\"]"));	
	     driver.findElement(By.xpath("//a[text()=\"Buy Again\"]"));
	     
		// Xpath using text and index
	     driver.findElement(By.xpath("(//a[text()=\"Wellness\"])[1]"));
	     driver.findElement(By.xpath("(//a[text()=\"Lab Tests\"])[1]"));
	     
	     // parent and child Relationship
	    //   //parenttagname[@parentattribute="parentattributevalue"]//childtagname[@childattribute="childattributevalue"]
	     
	     driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]//option[@value=\"search-alias=aps\"]"));
	     
	    
		// select current node
	     // //tagname[@attribute="attributevalue"]//self::Currenttagname
	     
	   driver.findElement(By.xpath("//option[@value=\"search-alias=computers\"]//self::option "));	  
	   
	   // select parent of current element/node
	   // //tagname[@attribute="attributevalue"]//parent::parenttagname
	   
	   driver.findElement(By.xpath(" //option[@value=\"search-alias=baby\"]//parent::select"));
	   
	   //select child node
	   // //parenttagname[@parentattribute="attributevalue"]//child::childtagname
	   
	   driver.findElement(By.xpath("(//select[@id=\"searchDropdownBox\"]//child::option)[1]"));
	   
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
