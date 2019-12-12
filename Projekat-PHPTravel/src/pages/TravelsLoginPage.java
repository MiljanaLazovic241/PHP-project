package pages;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsLoginPage extends BasicPage{

	private By email = By.name("email");
	private By password = By.name("password");
	private By checkbox = By.name("remember");
	private By forgetPassword = By.cssSelector("#link-forgot > strong");
	private By logButton = By.cssSelector("body > div:nth-child(5) > form.form-signin.form-horizontal.wow.fadeIn.animated.animated > button");
	
	public TravelsLoginPage(WebDriver driver) {
		super(driver);
	}

	public WebElement setEmail() {
		return this.driver.findElement(email);
	}
	
	public WebElement setPassword() {
		return this.driver.findElement(password);
	}
	
	public WebElement getCheckbox() {
		return this.driver.findElement(checkbox);
	}
	
	public WebElement getForgetPass() {
		return this.driver.findElement(forgetPassword);
	}
	
	public WebElement getLogIn() {
		return this.driver.findElement(logButton);
	}
	
	public void LogIn (String email, String password) {
		this.setEmail().sendKeys(email);
		this.setPassword().sendKeys(password);
		this.getCheckbox().click();
		this.getLogIn().click();
	}

	
}
