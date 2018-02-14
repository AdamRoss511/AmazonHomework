package amazon.home.work;

import amazon.home.work.pageobjects.DriverManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static amazon.home.work.pageobjects.DriverManager.*;

public class TestInit {

	@BeforeSuite(alwaysRun = true)
	public static void setUp() {

		driver.navigate().to("https://amazon.com");
	}

	@AfterSuite(alwaysRun = true)
	public static void tearDown() {
		//driver.quit();
	}

}
