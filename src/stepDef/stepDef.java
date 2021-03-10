package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.ValUrl;

public class stepDef {

WebDriver driver;
ValUrl vu;

 


	@Given("^User is on the home page$")
	public void user_is_on_the_home_page() { 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tuba\\Desktop\\libraries\\chromedriver.exe");
	driver = new ChromeDriver();
	vu=new ValUrl(driver);
	driver.get("http://automationpractice.com/index.php");
	}
	
	
	
	@When("^User clicks on women in catagories section$")
	public void user_clicks_on_women_in_catagories_section()throws InterruptedException {
	vu.getwomen().click();
	}

	@Then("^User should be able to goto link page women$")
	public void user_should_be_able_to_goto_link_page_women()throws InterruptedException {
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.navigate().back();
	
	}

	@When("^User clicks on specials in information section$")
	public void user_clicks_on_specials_in_information_section()throws InterruptedException {
		vu.getspecials().click();
	}

	@Then("^User should be able to goto link page specials$")
	public void user_should_be_able_to_goto_link_page_specials()throws InterruptedException {
		
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.navigate().back();
	
	}

	@When("^User clicks on new products in information section$")
	public void user_clicks_on_new_products_in_information_section()throws InterruptedException {
		
		vu.newproducts().click();
	}

	@Then("^User should be able to goto link page new products$")
	public void user_should_be_able_to_goto_link_page_new_products()throws InterruptedException {
		
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.navigate().back();
	}

	@When("^User clicks on best sellers in information section$")
	public void user_clicks_on_best_sellers_in_information_section()throws InterruptedException {
		
		
		vu.bestseller().click();
}
	@Then("^User should be able to goto link page best sellers$")
	public void user_should_be_able_to_goto_link_page_best_sellers()throws InterruptedException {
		
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.navigate().back();
		
		
	}

	@When("^User clicks on our stores in information section$")
	public void user_clicks_on_our_stores_in_information_section() throws InterruptedException{
		
		vu.ourstores().click();
	}

	@Then("^User should be able to goto link page our stores$")
	public void user_should_be_able_to_goto_link_page_our_stores()throws InterruptedException {
		
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.navigate().back();
		
	}

	@When("^User clicks on contact us in information section$")
	public void user_clicks_on_contact_us_in_information_section() throws InterruptedException{
		
		vu.contactus().click();
	}

	@Then("^User should be able to goto link page contact us$")
	public void user_should_be_able_to_goto_link_page_contact_us()throws InterruptedException {
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.navigate().back();
		
		
		
	}

	@When("^User clicks on terms and conditions of use in information section$")
	public void user_clicks_on_terms_and_conditions_of_use_in_information_section()throws InterruptedException {
		
		vu.termC().click();
	}

	@Then("^User should be able to goto link page terms and conditions of use$")
	public void user_should_be_able_to_goto_link_page_terms_and_conditions_of_use() throws InterruptedException{
		
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.navigate().back();
		
	}

	@When("^User clicks on about us in information section$")
	public void user_clicks_on_about_us_in_information_section() throws InterruptedException{
		
		vu.about().click();
	}

	@Then("^User should be able to goto link page about us$")
	public void user_should_be_able_to_goto_link_page_about_us()throws InterruptedException{
		
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.navigate().back();
		
		
	}

	@When("^User clicks on site map in information section$")
	public void user_clicks_on_site_map_in_information_section()throws InterruptedException{
		
		vu.sitemap().click();

		
		
	}

	@Then("^User should be able to goto link page site map$")
	public void user_should_be_able_to_goto_link_page_site_map()throws InterruptedException {
		
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.navigate().back();
		
		
	}

	@When("^User clicks on my orders in my account section$")
	public void user_clicks_on_my_orders_in_my_account_section()throws InterruptedException{
		
		vu.myorders().click();
		
	}

	@Then("^User should be able to goto link page my orders$")
	public void user_should_be_able_to_goto_link_page_my_orders()throws InterruptedException{
		
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.navigate().back();
		
		
	}

	@When("^User clicks on my credit slips in my account section$")
	public void user_clicks_on_my_credit_slips_in_my_account_section() throws InterruptedException{
		
		vu.mycreditslip().click();
	}

	@Then("^User should be able to goto link page my credit slips$")
	public void user_should_be_able_to_goto_link_page_my_credit_slips()throws InterruptedException {
		
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.navigate().back();
		
		
	}

	@When("^User clicks on my addresses in my account section$")
	public void user_clicks_on_my_addresses_in_my_account_section()throws InterruptedException {
		
		vu.myaddresses().click();
		
	}

	@Then("^User should be able to goto link page my addresses$")
	public void user_should_be_able_to_goto_link_page_my_addresses()throws InterruptedException {
		
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.navigate().back();
		
	}

	@When("^User clicks on my personal info in my account section$")
	public void user_clicks_on_my_personal_info_in_my_account_section() throws InterruptedException{
		
		vu.myPinfo().click();
		
	}

	@Then("^User should be able to goto link page my my personal info$")
	public void user_should_be_able_to_goto_link_page_my_my_personal_info()throws InterruptedException {
		
		driver.getCurrentUrl();
		driver.getTitle();
		
		driver.navigate().back();
		
		
	}

	@Then("^Use is able to quit driver$")
	public void use_is_able_to_quit_driver(){
		
		driver.quit();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
