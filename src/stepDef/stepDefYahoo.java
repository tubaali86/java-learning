package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjectModel.YahooSignUP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class stepDefYahoo {
	
	WebDriver driver;
	YahooSignUP ys;
	
	@Given("^user is on the yahoo sign up page$")
	public void user_is_on_the_yahoo_sign_up_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tuba\\Desktop\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
		ys=new YahooSignUP(driver);
		driver.get("https://login.yahoo.com/account/create");
		
	}

	@When("^user enters firstname \"([^\"]*)\" in the textbox$")
	public void user_enters_firstname_in_the_textbox(String arg1) throws InterruptedException {
		ys.getfirstName().sendKeys(arg1);
		Thread.sleep(1000);
		
	}

	@When("^user enters lastname \"([^\"]*)\" in the textbox$")
	public void user_enters_lastname_in_the_textbox(String arg1) throws InterruptedException {
		
		ys.getlastName().sendKeys(arg1);
		Thread.sleep(1000);
		
	}

	@When("^user enters new email \"([^\"]*)\" in the textbox$")
	public void user_enters_new_email_in_the_textbox(String arg1) throws InterruptedException {
		
		ys.getemail().sendKeys(arg1);
		Thread.sleep(1000);
		
	}

	@When("^user enters new password \"([^\"]*)\" in the textbox$")
	public void user_enters_new_password_in_the_textbox(String arg1) throws InterruptedException {
		
		ys.getpassword().sendKeys(arg1);
		Thread.sleep(1000);
		
	}

	@When("^user is able to select \"([^\"]*)\" from the drop down menu$")
	public void user_is_able_to_select_from_the_drop_down_menu(int arg1) throws InterruptedException {
		
		Select code= new Select(ys.getccode());
		code.selectByIndex(arg1);
		Thread.sleep(1000);
		
	}
	@When("^user is able to enter \"([^\"]*)\"  within the text box$")
	public void user_is_able_to_enter_within_the_text_box(String arg1) throws InterruptedException {
		
		ys.getmobile().sendKeys(arg1);
		Thread.sleep(1000);
		
	}

	@When("^user is able to select \"([^\"]*)\" from  drop down menu$")
	public void user_is_able_to_select_from_drop_down_menu(int arg1) throws InterruptedException {
		
		Select birthm=new Select(ys.getbirthmon());
		birthm.selectByIndex(arg1);
		
		Thread.sleep(1000);
		
	}

	@When("^user is able to enter \"([^\"]*)\" in  text box$")
	public void user_is_able_to_enter_in_text_box(String arg1) throws InterruptedException {
		
		ys.getbirthday().sendKeys(arg1);
		Thread.sleep(1000);
		
	}

	@When("^user is able to enter \"([^\"]*)\" in the text box$")
	public void user_is_able_to_enter_in_the_text_box(String arg1) throws InterruptedException {
		
		
		ys.getbirthyear().sendKeys(arg1);
		Thread.sleep(1000);
		
		
		
	}

	@When("^user is able to enter \"([^\"]*)\" into the  text box$")
	public void user_is_able_to_enter_into_the_text_box(String arg1) throws InterruptedException {
		
		ys.getgender().sendKeys(arg1);
		Thread.sleep(1000);
		
		
		
	}

	
	@Then("^user should be able to close the browser$")
	public void user_should_be_able_to_close_the_browser() {
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

		
		
	

	
		
	


