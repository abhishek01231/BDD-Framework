package testrunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import customLib.configurationMethods;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporter {
	
	private static configurationMethods confMethods = configurationMethods.getInstance();
	
	public static void generatereport() {
		File reportoutputdirectory = new File("target");
		List<String> jsonFiles = new ArrayList<>();
		
		String path = "target/report/*.json";
		File reportjsondirectory = new File("target/report");
		File[] f = reportjsondirectory.listFiles();
		System.out.println("path "+path);
		
		for(File f1:f) {
			System.out.println("f1 "+f1);
		jsonFiles.add(f1.getAbsolutePath());
		}
		Configuration configuration = new Configuration(reportoutputdirectory,"HealthAsyst Automation Report");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("URL", confMethods.getPropertyKey("URL"));

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
	}

}
