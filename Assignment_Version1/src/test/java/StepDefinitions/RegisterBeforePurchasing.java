package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RegisterBeforePurchasing {
	WebDriver driver=null;

	@Then("user fills registration form")
	public void user_fills_registration_form() {
		driver.findElement(By.className("orderModal")).isDisplayed();
		driver.findElement(By.className("form-control-label")).click();
		driver.findElement(By.id("name")).sendKeys("Muskan");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).sendKeys("Mumbai");
		driver.findElement(By.id("card")).sendKeys("54636");
		driver.findElement(By.id("month")).sendKeys("11");
		driver.findElement(By.id("year")).sendKeys("2053");
	}

	@And("user clicks submit button")
	public void user_clicks_submit_button() {
		driver.findElement(By.className("btn btn-primary")).click();
		driver.close();
		driver.quit();
	}
}
