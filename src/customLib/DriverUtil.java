package customLib;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverUtil{
	
	public static WebDriver chromeDriver;
	private static WebDriver nDRIVER;
	private static configurationMethods congMethods = configurationMethods.getInstance();
	
	public DriverUtil(){
		
	}
	
	public static WebDriver chromeSetup() {
		if(chromeDriver == null) {
		String browser = congMethods.getPropertyKey("BROWSER");
		if(browser==null) {browser = "Chrome";}
		chromeDriver = driverSetup(browser);
		}
		return chromeDriver;
	}
	
	public static WebDriver driverSetup(String data) {
		/**************************************************************************************************
		 * /** Des: This function is used to define the browser /
		 **************************************************************************************************/
		if(nDRIVER == null ) {
		try {
			switch (data) {
			case "FF":
				System.setProperty("webdriver.gecko.driver", "./Library/geckodriver.exe");
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("marionette", true);
				nDRIVER = new FirefoxDriver();
				nDRIVER.manage().window().maximize();
				nDRIVER.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
				break;
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", "./Library/chromedriver/chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("disable-infobars");
				options.setExperimentalOption("useAutomationExtension", false);
				options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
				options.addArguments("--start-maximized");
				options.addArguments("test-type");
				options.addArguments("disable-extensions");
				options.addArguments("disable-infobars");
				Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("credentials_enable_service", false);
				prefs.put("password_manager_enabled", false);
				options.setExperimentalOption("prefs", prefs);
				DesiredCapabilities cap = DesiredCapabilities.chrome();
				nDRIVER = new ChromeDriver(cap);
				System.out.println("ln 57");
				nDRIVER.manage().window().maximize();
				nDRIVER.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				break;
			case "IE":
				System.setProperty("webdriver.ie.driver", "./Library/IEDriverServer.ex");
				nDRIVER = new InternetExplorerDriver();
				nDRIVER.manage().window().maximize();
				nDRIVER.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
				break;
			default :
				System.out.println("ln 73");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}}
		return nDRIVER;
	}


}
