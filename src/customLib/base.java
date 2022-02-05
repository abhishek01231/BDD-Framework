package customLib;

import org.openqa.selenium.WebDriver;

public interface base {
	
	public static final navigateMethods NAV_METHODS = navigateMethods.getInstance();
	
	public static final WebDriver DRIVER = DriverUtil.chromeSetup();
	
	public static final selectMethods SEL_METHODS = selectMethods.getInstance();
	
	public static final databaseMethods DB_METHODS = databaseMethods.getInstance();
	
	public static final javascriptMethods JS_METHODS = javascriptMethods.getInstance();
	
	public static final configurationMethods CONF_METHODS = configurationMethods.getInstance();

}
