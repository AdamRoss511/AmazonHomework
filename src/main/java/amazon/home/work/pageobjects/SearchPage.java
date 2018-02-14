package amazon.home.work.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static amazon.home.work.pageobjects.DriverManager.driver;

public class SearchPage {
	public static WebElement resultLine() {
		return driver.findElement(By.cssSelector("#s-result-count .a-color-state"));
	}

	public static List<WebElement> resultList() {
		return driver.findElements(By.cssSelector("#s-results-list-atf>li h2"));
	}

	public static List<WebElement> priceRange() {
		return driver.findElements(By.className("#s-results-list-atf>li .sx-price"));

	}

	public static WebElement searchDropDownMenu() {
		return driver.findElement(By.xpath("//option[@value='search-alias=fashion-mens']"));
	}

	public static WebElement resultLabel() {
		return driver.findElement(By.xpath("//a[contains(text(),'Clothing, Shoes & Jewelry')]"));
	}

    public static WebElement unknounItemSearch() {
		return driver.findElement(By.id("noResultsTitle"));
	}

	public static WebElement collarJacket(){
		return driver.findElement(By.id("productTitle"));

	}

	public static WebElement itemPrice(){
		return driver.findElement(By.id("priceblock_ourprice"));
	}

	public static WebElement addToCart(){
		return driver.findElement(By.id("add-to-cart-button"));

	}
	public static WebElement proceedToCheckOutButton(){
		return driver.findElement(By.cssSelector("input[name=\"proceedToCheckout\"]"));

	}

	public static WebElement shopCartQuantityLabel(){
		return driver.findElement(By.className("a-dropdown-label"));
	}
}