package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class NumOfProductSteps {
	WebDriver driver=null;

	@Then("user selects another product and add it into cart")
	public void user_selects_another_product_and_add_it_into_cart() {
		driver.findElement(By.className("btn btn-success btn-lg")).click();
		driver.close();
		driver.quit();
	}
}
