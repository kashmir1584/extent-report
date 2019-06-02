package com.sample.report;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	static ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Extent.html");
	
	static ExtentReports report = new ExtentReports();
	
	static ExtentTest test;
	
	@BeforeTest
	public void init() {
		report.attachReporter(reporter);
	}
	
	
	@Test
	public void first() {
		test = report.createTest("first test");
		System.out.println("executing first test");
	}
	
	@AfterTest
	public void close() {
		report.flush();
	}
}
