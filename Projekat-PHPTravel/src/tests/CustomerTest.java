package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TravelsCustomerPage;
import pages.TravelsLoginPage;

public class CustomerTest extends BasicTest{
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
	public void Customer() throws InterruptedException {

		TravelsCustomerPage tpc = new TravelsCustomerPage(driver);
		tpc.ClickOnAccounts();
		Thread.sleep(500);
		tpc.ClickOnCustomer();
		Thread.sleep(500);
		tpc.ClickEditCustomer();
		Thread.sleep(500);
		tpc.setFName("Marko");
		Thread.sleep(500);
		tpc.setLName("Jovanovic");
		Thread.sleep(500);
		tpc.setEmail("marko@gmail.com");
		Thread.sleep(500);
		tpc.setMobile("00000");
		Thread.sleep(500);
		tpc.setAddress1("UlicaiBroj");
		Thread.sleep(500);
		tpc.getCountry();
		Thread.sleep(500);
		tpc.Status();
		Thread.sleep(500);
		tpc.ClickOnEmailNews();
		Thread.sleep(500);
		tpc.ClickOnSubmit();
		Thread.sleep(2000);
		tpc.clickOnSearch();
		Thread.sleep(2000);
		tpc.setCeck("Marko");
		Thread.sleep(2000);
		tpc.ClickOnGo();
		Assert.assertFalse(tpc.getCustomer().getText().contains("Marko"));

	}
}