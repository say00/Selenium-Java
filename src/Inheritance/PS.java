package Inheritance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	@BeforeMethod
	public void beforeRun() {

		System.out.println("Run me first.");
	}

	@AfterMethod
	public void afterRun() {

		System.out.println("Run me last.");
	}

	public void doThis() {

		System.out.println("I am here.");
	}
}
