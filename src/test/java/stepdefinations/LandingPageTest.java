package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LandingPageTest {

	WebDriver driver;
	
	@Given("Browser opened and url entered")
	public void browser_opened_and_url_entered() {
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.get("https://www.amazon.in");
	}

	@When("Landing page is loaded and I validate the title")
	public void Landing_page_is_loaded_and_I_validate_the_title() {
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

	@Then("I closed the browser")
	public void I_closed_the_browser() {
	   driver.quit();
	}
	
}
