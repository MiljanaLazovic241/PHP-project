package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsCarsPage extends BasicPage{

	private By cars1 = By.cssSelector("#social-sidebar-menu > li:nth-child(10) > a");
	private By cars2 = By.cssSelector("#Cars > li:nth-child(1) > a");
	private By cars = By.cssSelector(".xcrud-row");
	private List<WebElement> listCars = driver.findElements(this.cars);
	private By orders = By.cssSelector(".form-control.input-sm");

	public TravelsCarsPage(WebDriver driver) {
		super(driver);

	}

	public WebElement getCars() {
		return this.driver.findElement(cars1);
	}

	public WebElement getCars2() {
		return this.driver.findElement(cars2);
	}

	public void ClickOnCars() {
		this.getCars().click();
	}

	public void ClickOnCars2() {
		this.getCars2().click();
	}

	public boolean isCars10() {
		boolean cars1 = false;
		WebElement cars = driver.findElement(this.cars);
		if (listCars.size() == 10) {
			cars1 = true;
		}
		return cars1;
	}

	public boolean isOrdersMoreThen50() {
		boolean orders = false;
		int sumOrder = 0;
		WebElement orderNumber = driver.findElement(this.orders);
		List<WebElement> cars = driver.findElements(this.orders);
		for (int i = 0; i < cars.size(); i++) {
			String str = cars.get(i).getAttribute("value");
			int number = Integer.valueOf(str);
			sumOrder += number;
		}
		if (sumOrder > 50) {
			orders = true;
		}
		return orders;
	}

}
