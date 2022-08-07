package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class CheckBannerSteps {
	WebDriver driver=null;

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		driver.findElement(By.className("d-block img-fluid")).isDisplayed();

	}

	@Then("user clicks on banner below header option")
	public void user_clicks_on_banner_below_header_option() {
		driver.findElement(By.className("d-block img-fluid")).click();
		System.out.println("No response");
		
		driver.close();
		driver.quit();
	}
}
