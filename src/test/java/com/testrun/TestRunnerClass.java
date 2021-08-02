package com.testrun;

import org.apache.commons.lang.math.JVMRandom;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import jvm.JvmReports;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
				glue="org.steps",dryRun=false,monochrome=true,strict=true,tags="@sanity and @smoke or @smoke",
				plugin= {"pretty",
						"html:C:\\Users\\riyaz\\eclipse-workspace\\eclipse\\CucumberConfiguration\\src\\test\\resources\\Reports\\HTMLReports",
						"json:C:\\Users\\riyaz\\eclipse-workspace\\eclipse\\CucumberConfiguration\\src\\test\\resources\\Reports\\JsonReports\\jsonreport.json",
						"junit:C:\\Users\\riyaz\\eclipse-workspace\\eclipse\\CucumberConfiguration\\src\\test\\resources\\Reports\\JunitReports\\junitreport.xml"
						})

public class TestRunnerClass {
	@AfterClass
	public static void jvm() {
		JvmReports.jvmReportGenerate("C:\\Users\\riyaz\\eclipse-workspace\\eclipse\\CucumberConfiguration\\src\\test\\resources\\Reports\\JsonReports\\jsonreport.json");

	}

}
