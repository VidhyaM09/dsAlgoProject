package com.dsAlgo.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions( 
		monochrome = false,
	    plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		tags = "@dsportal or @dsportalhome or @register or @login or @list or @graph or @tree",
	   // tags="@register or  @login or @list",
		features = { "src/test/java/com/dsAlgo/features" }, // location of feature files
		glue = {"stepDefinition","hooks"}) // location of step definition files

public class Runner extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}


}
