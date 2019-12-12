package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsCustomerPage extends BasicPage {

	private By accounts = By.cssSelector("#social-sidebar-menu > li:nth-child(5) > a");
	private By customer = By.cssSelector("#ACCOUNTS > li:nth-child(3) > a");
	private By editCustomer = By
			.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[5]/td[8]/span/a[1]/i");
	private By fname = By.name("fname");
	private By lname = By.name("lname");
	private By email = By.name("email");
	private By password = By.name("password");
	private By mobile = By.name("mobile");
	private By country = By.xpath("//*[@id=\"s2id_autogen1\"]/a/span[1]");
	private By country1 = By.className("select2-input");
	private By address1 = By
			.cssSelector("#content > form > div > div.panel-body > div > div:nth-child(8) > div > input");
	private By status = By.name("status");
	private By emailNewsletter = By.name("newssub");
	private By submit = By.cssSelector("#content > form > div > div.panel-footer > button");
	private By search = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[3]/a");
	private By putName = By.cssSelector("#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-nav > span.xcrud-search.form-inline > input");
	private By go = By.cssSelector("a.xcrud-action.btn.btn-primary");
	private By customer2 = By.cssSelector("tr.xcrud-row");
	
	public TravelsCustomerPage(WebDriver driver) {
		super(driver);
	}

	public void ClickOnAccounts() {
		this.driver.findElement(accounts).click();
	}

	public void ClickOnCustomer() {
		this.driver.findElement(customer).click();
	}

	public void ClickEditCustomer() {
		this.driver.findElement(editCustomer).click();
	}

	public void setFName(String fname) {
		this.driver.findElement(this.fname).clear();
		this.driver.findElement(this.fname).sendKeys(fname);
	}

	public void setLName(String lname) {
		this.driver.findElement(this.lname).clear();
		this.driver.findElement(this.lname).sendKeys(lname);
	}

	public void setEmail(String email) {
		this.driver.findElement(this.email).clear();
		this.driver.findElement(this.email).sendKeys(email);
	}

	public void setMobile(String mobile) {
		this.driver.findElement(this.mobile).clear();
		this.driver.findElement(this.mobile).sendKeys(mobile);

	}

	public void setAddress1(String address1) {
		this.driver.findElement(this.address1).sendKeys(address1);
	}

	public void getStatus() {
		this.driver.findElement(status).click();
	}

	public void ClickOnEmailNews() {
		this.driver.findElement(emailNewsletter).click();
	}

	public void ClickOnSubmit() {
		this.driver.findElement(submit).click();
	}

	public void Status() {
		WebElement selectStatus = driver.findElement(this.status);
		Select sStatus = new Select(selectStatus);
		sStatus.selectByVisibleText("Disabled");
	}

	public void getCountry() {
		this.driver.findElement(this.country).click();
		WebElement zemlja = driver.findElement(this.country1);
		zemlja.sendKeys("Italy");
		zemlja.sendKeys(Keys.ENTER);
	}

	public void clickOnSearch() {
		this.driver.findElement(this.search).click();
	}

	public void setCeck(String name) {
		this.driver.findElement(this.putName).sendKeys(name);
	}

	public void ClickOnGo() {
		this.driver.findElement(this.go).click();
	}

	public WebElement getCustomer() {
		return this.driver.findElement(this.customer);
	}

}
