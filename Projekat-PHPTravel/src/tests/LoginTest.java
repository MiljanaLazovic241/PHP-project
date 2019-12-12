package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TitlePage;
import pages.TravelsExtrasPage;
import pages.TravelsCarsPage;
import pages.TravelsLoginPage;
import pages.TravelsMenuPage;

public class LoginTest extends BasicTest {

	private String baseUrl = "https://www.phptravels.net/admin";

	@Test(priority = 0)
	public void basicLogin() throws InterruptedException, IOException {
		driver.get(baseUrl);
		Thread.sleep(2000);

		TravelsLoginPage tlp = new TravelsLoginPage(driver);
		tlp.LogIn("admin@phptravels.com", "demoadmin");
	}
}