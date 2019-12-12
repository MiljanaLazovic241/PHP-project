package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TitlePage;
import pages.TravelsLoginPage;
import pages.TravelsMenuPage;

public class MenuTest extends BasicTest {
	private String baseURL = "https://www.phptravels.net/admin";

	@BeforeTest
	public void basicLogin() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(2000);

		TravelsLoginPage tlp = new TravelsLoginPage(driver);
		tlp.LogIn("admin@phptravels.com", "demoadmin");
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void clickDashboard() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(500);
		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickOnDashboard();
		Assert.assertEquals(driver.getTitle(), "Dashboard");
	}

	@Test(priority = 2)
	public void clickUpdate() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(500);
		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickOnUpdates();
		Assert.assertEquals(driver.getTitle(), "Updates");
	}

	@Test(priority = 3)
	public void clickModules() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(500);
		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickOnModules();
		Assert.assertEquals(driver.getTitle(), "Modules");
	}

	@Test(priority = 4)
	public void clickTours() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(500);
		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickOnTours();
		Thread.sleep(1000);
		tmp.clickOnAddNew();
		Assert.assertEquals(driver.getTitle(), "Add Tour");
	}

	@Test(priority = 5)
	public void clickCoupons() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(500);
		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickOnCoupons();
		Assert.assertEquals(driver.getTitle(), "Coupon Codes Management");
	}

	@Test(priority = 6)
	public void clickNewsletter() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(500);
		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickOnNewsletter();
		Assert.assertEquals(driver.getTitle(), "Newsletter Management");
	}

	@Test(priority = 7)
	public void clickBooking() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin");
		Thread.sleep(500);
		TravelsMenuPage tmp = new TravelsMenuPage(driver);
		tmp.clickOnBookings();
		Assert.assertEquals(driver.getTitle(), "Booking Management");

	}
}
