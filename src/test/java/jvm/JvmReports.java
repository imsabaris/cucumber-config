package jvm;


import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {
	public static void jvmReportGenerate(String jsonPath) {
		File f =new File("C:\\Users\\riyaz\\eclipse-workspace\\eclipse\\CucumberConfiguration\\src\\test\\resources\\Reports\\JvmReports");
		
		Configuration c = new Configuration(f,"fb,amazon and flipkart app");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Selenium Version", "3.141.59");
		
		List<String> l = new LinkedList<String>();
		l.add(jsonPath);
		
		ReportBuilder report = new ReportBuilder(l, c);
		report.generateReports();
	}

}
