package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class PurchasingProductSteps {
	
	WebDriver driver=null;

	@Then("Order Placed Successfully")
	public void order_placed_successfully() {
		driver.findElement(By.className("btn btn-primary")).click();
		driver.findElement(By.className("sa-icon sa-success animate")).isDisplayed();

		System.out.println("Order Placed!!!");

		driver.close();
		driver.quit();
	}

}
