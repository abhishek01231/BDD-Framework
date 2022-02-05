package stepdefinition;

/*import org.junit.After;
import org.junit.Before;*/
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import customLib.DriverUtil;
import customLib.base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks implements base{
	
	public static Scenario scenario;
	public static String currentTagName;
	
	@Before()
	public void beforeScenarioStart() {
		System.out.println("------ Start of Scenario--------");
	}
	
	@After()
	public void afterScenario(Scenario scenario) {
		System.out.println(scenario.getName() + " status "+scenario.getStatus());
		
		if(scenario.isFailed()) {
			try {
				scenario.write("Current page url is" + DRIVER.getCurrentUrl());
				byte[] screenshot = ((TakesScreenshot) DRIVER).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
