package learnTESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class yahoosignupMAIN {
	
	
	
	WebDriver driver;
	
	YahoosignupPO ys;

	@BeforeTest
	public void setupTest()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tuba\\Desktop\\libraries\\chromedriver.exe");
		driver = new ChromeDriver();
        ys = new YahoosignupPO(driver);
        
      driver.get("https://login.yahoo.com/account/create");


}
	@AfterTest
	public void endtest() {
		
		driver.quit();
	}
	
	@Test
	public void validateForm() {
		
		  ys.getfirstName().sendKeys("Tuba");
			
			ys.getlastName().sendKeys("Ali");
			
		//	ys.getemail().sendKeys("alituba31");

		//	ys.getpassword().sendKeys("Saadshamsi");
			
			Select code= new Select(ys.getccode());
			code.selectByIndex(1);
			

			ys.getmobile().sendKeys("3468575652");
			
	    	Select birthm= new Select(ys.getbirthmon());
			
				birthm.selectByVisibleText("May")	;
				
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}