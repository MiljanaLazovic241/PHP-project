package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsMenuPage extends BasicPage {

	private By dashboard = By.cssSelector("#social-sidebar-menu > li:nth-child(1) > a > strong");
	private By update = By.cssSelector("#social-sidebar-menu > li:nth-child(2) > a");
	private By modules = By.cssSelector("#social-sidebar-menu > li:nth-child(3) > a");
	private By tours = By.cssSelector("#social-sidebar-menu > li:nth-child(9) > a");
	private By addTours = By.cssSelector("#Tours > li:nth-child(2) > a");
	private By coupons = By.cssSelector("#social-sidebar-menu > li:nth-child(15) > a");
	private By newsletter = By.cssSelector("#social-sidebar-menu > li:nth-child(16) > a");
	private By booking = By.cssSelector("#social-sidebar-menu > li:nth-child(17) > a");

	public TravelsMenuPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnDashboard() {
		this.driver.findElement(dashboard).click();
	}

	public void clickOnUpdates() {
		this.driver.findElement(update).click();
	}

	public void clickOnModules() {
		this.driver.findElement(modules).click();
	}

	public void clickOnTours() {
		this.driver.findElement(tours).click();
	}

	public void clickOnCoupons() {
		this.driver.findElement(coupons).click();
	}

	public void clickOnNewsletter() {
		this.driver.findElement(newsletter).click();
	}

	public void clickOnBookings() {
		this.driver.findElement(booking).click();
	}

	public void clickOnAddNew() {
		this.driver.findElement(addTours).click();
	}
}
