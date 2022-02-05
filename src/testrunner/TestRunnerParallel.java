package testrunner;

/*import org.junit.AfterClass;
import org.junit.BeforeClass;*/
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import customLib.DriverUtil;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/Destination","json:target/report/cucumber1.json"},
						features="features/CheckinAsyst/Payments",
						glue="stepdefinition",
						strict=false,
						monochrome=true,
						tags= {"@REGRESSIONTESTING"}
)

public class TestRunnerParallel extends AbstractTestNGCucumberTests {
	private WebDriver DRIVER;
	
	@BeforeClass
	public void driverSetup() {
		DRIVER= DriverUtil.chromeSetup();
	}
	
	@AfterClass
	public void driverQuit() {
		try {
		if(DRIVER!=null) {
			DRIVER.close();
			DRIVER = null;
		}}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		  System.out.println("Generating Report"); 
		 // Reporter.generatereport();
		  System.out.println("Report Generated");
		 
	}
}