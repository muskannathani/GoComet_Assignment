package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoriesSteps {
	WebDriver driver=null;


	@Given("Browser with no verifications")
	public void browser_with_no_verifications() {
		
	
			System.out.println("Inside Step- Browser with no verification");
			   
			   String projectPath=System.getProperty("user.dir");
			   System.out.println("Project Path is: "+projectPath);
			
			   System.setProperty("webdriver.chrome.driver", projectPath+"https://www.demoblaze.com/index.html");
			   
			   driver=new ChromeDriver();
	}

	@When("user selects a mobile category product")
	public void user_selects_a_mobile_category_product() {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		driver.findElement(By.className("list-group-item")).click();
	}

	@Then("Mobile Products list displayed")
	public void mobile_products_list_displayed() {
		driver.findElement(By.className("list-group-item")).isDisplayed();

	}

	@When("user selects a laptop category product")
	public void user_selects_a_laptop_category_product() {
	    
		driver.navigate().to("https://www.demoblaze.com/index.html");
		driver.findElement(By.className("list-group-item")).click();
	}

	@Then("Laptop Products list displayed")
	public void laptop_products_list_displayed() {
		driver.findElement(By.className("list-group-item")).isDisplayed();

	}

	@When("user selects a monitors category product")
	public void user_selects_a_monitors_category_product() {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		driver.findElement(By.className("list-group-item")).click();
	}

	@Then("Monitors Products list displayed")
	public void monitors_products_list_displayed() {
		driver.findElement(By.className("list-group-item")).isDisplayed();
		driver.close();
		driver.quit();

	}
}
