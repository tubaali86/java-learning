package learnTESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahoosignupPO {
	
	
		
		WebDriver driver; 

			
			public YahoosignupPO(WebDriver x) {
				
			driver=x;	
				
			}
			
			 public WebElement getfirstName() {
					
					WebElement firstname = driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]"));
					return firstname; 
				}
			       
			       
			       public WebElement getlastName() {
					
					WebElement lastname = driver.findElement(By.xpath("//*[@id=\"usernamereg-lastName\"]"));
					return lastname; 
				}

			     
				public WebElement getemail() {
				
				WebElement email = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
				return email; 
			} 
			      
			      
			      
			      public WebElement getpassword () {
				
				WebElement password = driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]"));
				return password; }

			      public WebElement getccode () {
			    	  WebElement ccode=driver.findElement(By.xpath("//*[@id=\"regform\"]/div[3]/div[2]/div/select"));
			      
			      return ccode;}

			        public WebElement getmobile() {
					
					WebElement mobile = driver.findElement(By.xpath("//*[@id=\"usernamereg-phone\"]"));
					return mobile; 
					
					
				} public WebElement getbirthmon() {
					
					WebElement birthmon = driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]"));
					return birthmon; 
					
					
				}  public WebElement getbirthday () {
					
					WebElement birthday = driver.findElement(By.xpath("//*[@id=\"usernamereg-day\"]"));
					return birthday; }
				    
				public WebElement getbirthyear() {
						
						WebElement birthyear = driver.findElement(By.xpath("//*[@id=\"usernamereg-year\"]"));
						return birthyear; 
				}
				public WebElement getgender() {
						
						WebElement gender = driver.findElement(By.xpath("//*[@id=\"usernamereg-freeformGender\"]"));
						return gender; 
				}
				public WebElement getconti() {
					WebElement conti = driver.findElement(By.xpath("//*[@id=\"reg-submit-button\"]"));
					return conti;
				}
				

	}
