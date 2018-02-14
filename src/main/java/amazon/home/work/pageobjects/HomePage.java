package amazon.home.work.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static amazon.home.work.pageobjects.DriverManager.*;

public class HomePage {

	public static WebElement dropDownMenu() {
		return driver.findElement(By.className("nav-search-scope"));
	}
	public static WebElement searchButton() {
		return driver.findElement(By.cssSelector(".nav-input[value=\"Go\"]"));
	}
	public static WebElement cart() {
		return driver.findElement(By.className("nav-cart-icon"));
	}
	public static WebElement searchField() {
		return driver.findElement(By.id("twotabsearchtextbox"));
	}


}


