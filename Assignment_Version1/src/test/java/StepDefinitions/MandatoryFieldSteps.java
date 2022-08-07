package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MandatoryFieldSteps {
	WebDriver driver=null;

	@When("user selects a product and add it into cart")
	public void user_selects_a_product_and_add_it_into_cart() {
		driver.findElement(By.className("col-lg-4 col-md-6 mb-4")).click();
		driver.findElement(By.className("btn btn-success btn-lg")).click();

	}

	@Then("user clicks on cart")
	public void user_clicks_on_cart() {
		   driver.navigate().to("https://www.demoblaze.com/cart.html");

	}

	@And("user clicks on placed order")
	public void user_clicks_on_placed_order() {
		driver.findElement(By.className("success")).isDisplayed();
		driver.findElement(By.className("btn btn-success")).click();
	}

	@And("Mandatory fields are not marked")
	public void mandatory_fields_are_not_marked() {
	   System.out.println("No implementation");
	}

	@And("user fills registration form and clicks submit")
	public void user_fills_registration_form_and_clicks_submit() {
		driver.findElement(By.className("orderModal")).isDisplayed();
		driver.findElement(By.className("form-control-label")).click();
		driver.findElement(By.className("btn btn-primary")).click();

	
		driver.close();
		driver.quit();
	}

}
