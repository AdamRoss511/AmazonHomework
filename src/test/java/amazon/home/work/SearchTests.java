package amazon.home.work;

import amazon.home.work.pageobjects.HomePage;
import amazon.home.work.pageobjects.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import static amazon.home.work.pageobjects.DriverManager.driver;
import static amazon.home.work.pageobjects.HomePage.*;
import static amazon.home.work.pageobjects.SearchPage.*;
import static org.testng.Assert.assertEquals;

public class SearchTests extends TestInit {

	@Test
	public void simpleSearchTest() {

		searchField().sendKeys("jacket");
		searchButton().click();
		assertEquals(resultLine().getText(), "\"jacket\"");
		searchField().clear();
	}

	@Test
	public void searchByMen() {

        searchDropDownMenu().click();
		searchField().clear();
		searchField().sendKeys("jacket");
		searchButton().click();
		assertEquals(resultLabel().getText(), "Clothing, Shoes & Jewelry");
	}
	@Test
	public void emptySearch() {
		searchButton().click();
	}

	private void assertfailNotEquals(String text, String s) {
		assertfailNotEquals(resultLine().getText(), "\"jacket\"");
	}

    @Test
	public void blablaSearch() {
		searchField().sendKeys("blablablahde");
		searchButton().click();
		assertEquals(unknounItemSearch().getText(), "Your search \"blablablahde\" did not match any products.");
		searchField().clear();
	}


}