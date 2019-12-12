package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TitlePage;
import pages.TravelsCarsPage;
import pages.TravelsLoginPage;

public class CarsTest extends BasicTest{

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
	public void TravelsCars() throws InterruptedException {

		TravelsCarsPage tcp = new TravelsCarsPage(driver);
		tcp.ClickOnCars();
		tcp.ClickOnCars2();
		Thread.sleep(2000);

		TitlePage tp = new TitlePage(driver);
		Assert.assertTrue(tp.getPageTitle().contains("Cars Management"));
	}

	@Test(priority = 2)
	public void CarsName() throws InterruptedException {

		TravelsCarsPage tcp = new TravelsCarsPage(driver);
		tcp.isCars10();
		Assert.assertEquals(tcp.isCars10(), false);

	}

	@Test(priority = 3)
	public void CarsOrder() throws InterruptedException {

		TravelsCarsPage tcp = new TravelsCarsPage(driver);
		tcp.isOrdersMoreThen50();
		Assert.assertTrue(tcp.isOrdersMoreThen50());

	}

}
