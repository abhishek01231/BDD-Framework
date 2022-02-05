package testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
/*import org.junit.AfterClass;
import org.junit.BeforeClass;*/
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;

import customLib.DriverUtil;
import io.cucumber.junit.Cucumber;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/Destination","json:target/report/cucumber.json"},
						features="features/test/Advanced_dermatology.feature",
						glue="stepdefinition",
						strict=false,
						monochrome=true
						//tags= {"@test or @test1 or @test2"}

)

public class TestRunner {
	private static WebDriver DRIVER = null;
	
	@BeforeClass
	public static void driverSetup() {
		DRIVER= DriverUtil.chromeSetup();
	}
	
	@AfterClass
	public static void driverQuit() {
		try {
		if(DRIVER!=null) {
			//DRIVER.quit();
			//DRIVER = null;
		}}catch(Exception e) {
			e.printStackTrace();
		}
		
		  System.out.println("Generating Report"); 
		  Reporter.generatereport();
		  System.out.println("Report Generated");
		 
	}
}