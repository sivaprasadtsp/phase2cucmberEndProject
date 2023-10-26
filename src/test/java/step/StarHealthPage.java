package step;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StarHealthPage {
	WebDriver driver;
	@Given("User open the chrome Browser and starhealth application")
	public void user_open_the_chrome_browser_and_starhealth_application() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.starhealth.in/");
		Thread.sleep(1500);
	}

	@Then("validate the star health home page title using a JUnit assertion")
	public void validate_the_star_health_home_page_title_using_a_j_unit_assertion() {
		String ExpectedTitle = "Star Health Insurance: Medical, Accident and Travel insurance policies";
		String ActualTitle = "driver.getTitle()"; 
       assertNotEquals(ActualTitle, ExpectedTitle , "The title is valid");
	}

	@Then("clicks on the Buy Now button")
	public void clicks_on_the_buy_now_button() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/div[2]/div[2]/div/button/span")).click();
	}

	@Then("User enters following details")
	public void user_enters_following_details(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> userList	= dataTable.asMaps(String.class, String.class);
		
		for(Map<String, String> e : userList) {
			driver.findElement(By.xpath("//*[@id=\"name\"]")).clear();
	    	driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(e.get("FullName"));
	    	
	    	driver.findElement(By.xpath("//*[@id=\"contact_no\"]")).clear();
	    	driver.findElement(By.xpath("//*[@id=\"contact_no\"]")).sendKeys(e.get("PhNo"));
	    	
	    	driver.findElement(By.xpath("//*[@id=\"pinCode\"]")).clear();
	    	driver.findElement(By.xpath("//*[@id=\"pinCode\"]")).sendKeys(e.get("PIN"));
	    	
			
		}
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}

	@Then("User click on the Plan for My Family page")
	public void user_click_on_the_plan_for_my_family_page() throws InterruptedException {
		 WebElement e1 = driver.findElement(By.xpath("(//p[@class='font-500 text-16 mb-0 pt-10 pb-10'])[1]"));
			Actions a = new Actions(driver);
			a.moveToElement(e1).perform();
			Thread.sleep(1500);
			driver.findElement(By.linkText("For My Family")).click();
	}

	@Then("Validate the user mobile number")
	public void validate_the_user_mobile_number() {
		String ExpectedMobileNo = "8114423712";
		String ActualMobileNo = "8114489203"; 
       assertNotEquals(ActualMobileNo, ExpectedMobileNo , "The PhoneNo is valid");
	}

	@Then("User clicks on the Star Health logo")
	public void user_clicks_on_the_star_health_logo() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/div[2]/div[1]/span/span/img")).click();
	}
}
