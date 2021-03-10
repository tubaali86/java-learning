package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValUrl {
	
    WebDriver driver; 
	
	public ValUrl(WebDriver driver) {
		
		this.driver=driver; 
		
	}	

 public WebElement getwomen() {
	WebElement x=driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[2]/div/div/ul/li/a"));
	return x;
	
	
}
 public WebElement getspecials() {
	 WebElement x=driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[1]/a"));
	 return x;
	 
	 
 }
 public WebElement newproducts() {
	 WebElement x=driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[2]/a"));
	 return x;
 }
 public WebElement bestseller() {
	 WebElement x=driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[3]/a"));
	 return x;}
 
 public WebElement ourstores() {
	 WebElement x=driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[4]/a"));
	 return x;}
 
 public WebElement contactus() {
	 WebElement x=driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[5]/a"));
	 return x;}
 public WebElement termC() {
	 WebElement x=driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[6]/a"));
	 return x;}
 
 public WebElement about() {
	 WebElement x=driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[7]"));
	 return x;}
 public WebElement sitemap() {
	 WebElement x=driver.findElement(By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[8]/a"));
	 return x;}
 
 
 public WebElement myorders() {
	 WebElement x=driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[1]"));
	 return x;}
 
 public WebElement mycreditslip() {
	 WebElement x=driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[2]/a"));
	 return x;}
 
 public WebElement myaddresses() {
	 WebElement x=driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[3]/a"));
	 return x;}
 
 public WebElement myPinfo() {
	 WebElement x=driver.findElement(By.xpath("//*[@id=\"footer\"]/div/section[5]/div/ul/li[4]/a"));
	 return x;}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}