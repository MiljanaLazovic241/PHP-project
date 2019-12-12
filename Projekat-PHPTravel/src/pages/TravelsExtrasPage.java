package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelsExtrasPage extends BasicPage {

	private By extras = By.cssSelector("#Cars > li:nth-child(2) > a");
	private By Add = By.cssSelector(".btn.btn-success.xcrud-action");
	private By picture = By.name("xcrud-attach");
	private By name = By.cssSelector(
			"#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-view > div > div:nth-child(2) > div > input");
	private By status = By.name("cHRfZXh0cmFzLmV4dHJhc19zdGF0dXM-");
	private By price = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/div/input");
	private By save = By.cssSelector(
			"#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-top-actions.btn-group > a.btn.btn-primary.xcrud-action");
	
	
	public TravelsExtrasPage(WebDriver driver) {
		super(driver);

	}

	public void Extras() {
		this.driver.findElement(extras).click();
	}

	public void Add() {
		this.driver.findElement(Add).click();
	}

	public WebElement getUpload() {
		return this.driver.findElement(picture);

	}

	public void setName(String name) {
		this.driver.findElement(this.name).sendKeys(name);
	}

	public void setPrice(String price) {
		this.driver.findElement(this.price).sendKeys(price);
	}

	public void Save() {
		this.driver.findElement(save).click();
	}

	public void uploadImage(String path) {
		getUpload().sendKeys(new File(path).getAbsolutePath());

	}

	public void Status() {
		WebElement selectStatus = driver.findElement(this.status);
		Select sStatus = new Select(selectStatus);
		sStatus.selectByVisibleText("No");
	}
	
	public boolean carsExtrasAdded(String nameInput) {
		return this.driver.findElement(By.xpath("//td[contains(text(),'"+ nameInput +"')]")) != null;
	}
	
}