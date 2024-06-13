package reports;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_code.Base_Class;

public class Reports extends Base_Class {

	public static void main(String[] args) throws IOException {
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		// create object ExtentSparkReporter
		ExtentSparkReporter Ex = new ExtentSparkReporter(projectpath+"\\reports\\Report_1\\");
		Ex.config().setDocumentTitle("site");
		Ex.config().setReportName("report_name");
		Ex.config().setTheme(Theme.STANDARD);
		
		// create object ExtentReports
		
		ExtentReports Er = new ExtentReports();
		Er.attachReporter(Ex);
		
		Er.setSystemInfo("Operating system", "Windows");
		Er.setSystemInfo("Browser", "Chrome");
		Er.setSystemInfo("Tester", "Samiksha");
		Er.setSystemInfo("Site", "Amazon");
		
		// 3rd class ExtentTests
		
		ExtentTest Et = Er.createTest("Search_Amazon");
		Et.log(Status.INFO,"Find Search Web Element");
		ExtentTest Et1 = Er.createTest("Click_Search");
		Et.log(Status.INFO,"Click Search Web Element");
		ExtentTest Et2 = Er.createTest("Search_T.V");
		Et.log(Status.INFO,"sendkeys in Search");
		
		Et.log(Status.PASS,"Pass search functionality testcase");
		Et.log(Status.PASS,"Click search functionality testcase");
		Et.log(Status.PASS,"Sendkeys in functionality testcase");
		
		//launch browser
		launch_browser("chrome");
		
		// Hit Url
		Hiturl("https://www.amazon.in/");
		
		// locate search
		WebElement Search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		Search.click();
		Search.sendKeys("T.V");
		takescreenshot("Search_T.V");
		Et2.addScreenCaptureFromPath(projectpath+"\\reports\\Search_T.V.png");
		
		Er.flush();
		

	}

}
