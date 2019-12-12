package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TitlePage;
import pages.TravelsExtrasPage;
import pages.TravelsCarsPage;
import pages.TravelsLoginPage;

public class ExtrasTest extends BasicTest {
	private String baseURL = "https://www.phptravels.net/admin";

	@BeforeTest
	public void basicLogin() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(2000);

		TravelsLoginPage tlp = new TravelsLoginPage(driver);
		tlp.LogIn("admin@phptravels.com", "demoadmin");
		Thread.sleep(2000);
	}

	@Test
	public void Extras() throws InterruptedException {
		driver.get("https://www.phptravels.net/admin/cars/extras");
		Thread.sleep(1000);
		TravelsCarsPage tcp = new TravelsCarsPage(driver);
		tcp.ClickOnCars();
		Thread.sleep(1000);
		TravelsExtrasPage tep = new TravelsExtrasPage(driver);
		tep.Extras();
		Thread.sleep(2000);
		tep.Add();
		Thread.sleep(1000);
		tep.uploadImage("images\\slika.jpg");
		Thread.sleep(1000);
		tep.setName("Golf");
		Thread.sleep(1000);
		tep.setPrice("2000");
		Thread.sleep(1000);
		tep.Status();
		Thread.sleep(1000);
		tep.Save();
		Thread.sleep(1000);
		Assert.assertTrue(tep.carsExtrasAdded("Golf"));

	}
}