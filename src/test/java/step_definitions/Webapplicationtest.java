package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper_classes.Setdriver;

public class Webapplicationtest {
	WebDriver driver;
	String color;
	String colorChange;

	public Webapplicationtest() {
		driver = Setdriver.webDriver;
	}

	@Given("^I launch the ec(\\d+)instances home page url$")
	public void i_launch_the_ec_instances_home_page_url(int arg1) throws Throwable {
		driver.get("https://ec2instances.info/");
		Thread.sleep(2000);
	}

	@When("^I click on the RDS link$")
	public void i_click_on_the_RDS_link() throws Throwable {
		driver.findElement(By.cssSelector("a[href='/rds/']")).click();
		Thread.sleep(8000);
	}

	@Then("^I see the RDS page$")
	public void i_see_the_RDS_page() throws Throwable {

		Assert.assertEquals(true, driver.getPageSource().contains("RDS"));
		Thread.sleep(4000);

	}

	@When("^I click on the M(\\d+) General Purpose Extra Large row$")
	public void i_click_on_the_M_General_Purpose_Extra_Large_row(int arg1) throws Throwable {
		color = driver.findElement(By.id("db.m1.xlarge")).getCssValue("background-color");
		System.out.println(color);
		driver.findElement(By.id("db.m1.xlarge")).click();
		Thread.sleep(2000);
		colorChange = driver.findElement(By.id("db.m1.xlarge")).getCssValue("background-color");
		Thread.sleep(4000);
	}

	@Then("^I verify the row background color$")
	public void i_verify_the_row_background_color() throws Throwable {
		Assert.assertNotEquals(color, colorChange);

	}

	@When("^I click M(\\d+) General Purpose Extra Large row$")
	public void i_click_M_General_Purpose_Extra_Large_row(int arg1) throws Throwable {
		driver.findElement(By.id("db.m1.xlarge")).click();
		Thread.sleep(4000);
	}

	@When("^I click on the ?Confirm selected? button$")
	public void i_click_on_the_Confirm_selected_button() throws Throwable {
		driver.findElement(By.cssSelector("button[class='btn btn-primary btn-compare']")).click();
		Thread.sleep(4000);
	}

	@Then("^I verify the  the button changes$")
	public void i_verify_the_the_button_changes() throws Throwable {
		Assert.assertEquals(true, driver.getPageSource().contains("End Compare"));

	}

	@Then("^the row is displayed$")
	public void the_row_is_displayed() throws Throwable {
		Assert.assertEquals(true, driver.getPageSource().contains("M1 General Purpose Extra Large"));

	}

}
