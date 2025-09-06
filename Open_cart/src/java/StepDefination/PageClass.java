package StepDefination;

import java.time.Duration;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass 
{
	WebDriver driver;
	
	By acc=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"); 
	By regi=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	By log=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By name=By.id("input-email");
	By pass=By.id("input-password");
	By login=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	By search=By.cssSelector("input[placeholder=\"Search\"]");
	By searchb=By.xpath("//*[@id=\"search\"]/span/button");
	By mp3=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[8]");
	By all=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[8]/div/a");
	By sort=By.id("input-sort");
	By camera=By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[7]/a");
	By nikon=By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a");
	By add=By.id("button-cart");
	By checkitem=By.id("cart-total");
	By viewcart=By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]");
	By quantity=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input");
	By update=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[1]/i");
	By remove=By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]");
	By checkout=By.xpath("//span[text()='Checkout']");
	By outb=By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a");
	By myacc=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"); 
	By address=By.xpath("//*[@id=\"content\"]/ul[1]/li[3]/a");
	By edit=By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[2]/a[1]");
	By uname=By.id("input-firstname");
	By lname=By.id("input-lastname");
	By shipadd=By.id("input-address-1");
	By city=By.id("input-city");
	By zip=By.id("input-postcode");
	By country=By.id("input-country");
	By state=By.id("input-zone");
	By continueb=By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
	By order= By.linkText("Order History");
	By order_co=By.xpath("//*[@id=\"content\"]/div/div/a");
	By pay=By.xpath("//span[text()='Transactions']");
	By pay_co=By.xpath("//*[@id=\"content\"]/div/div/a");
	By tel=By.id("input-telephone");
	By passcon=By.id("input-confirm");
	By reglogin=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"); 
	By pol=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By logout=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a");
	By for_link=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a");
	By b=By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
	By checkoutButton = By.xpath("//span[text()='Checkout']");
	By newa=By.xpath("//*[text()='New Address']");
			
	public PageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void username()
	{
		driver.findElement(acc).click();
		
		driver.findElement(log).click();
		
		driver.findElement(name).click();
		driver.findElement(name).clear();
		driver.findElement(name).sendKeys("sulkshanad145@gmail.com");
	}
	public void password()
	{
		driver.findElement(pass).click();
		driver.findElement(pass).clear();
		driver.findElement(pass).sendKeys("Sulkshana14@");
	}
	public void login()
	{
		driver.findElement(login).click();
	}
	public void reg() 
	{
		driver.findElement(acc).click();
		driver.findElement(regi).click();
		
		driver.findElement(uname).click();
		driver.findElement(uname).clear();
		driver.findElement(uname).sendKeys("sulkshanad145");
		
		driver.findElement(lname).click();
		driver.findElement(lname).clear();
		driver.findElement(lname).sendKeys("sulkshanad145");
		
		driver.findElement(name).click();
		driver.findElement(name).clear();
		driver.findElement(name).sendKeys("sulkshanad145@gmail.com");
		
		driver.findElement(tel).click();
		driver.findElement(tel).clear();
		driver.findElement(tel).sendKeys("1234569872");
		
		driver.findElement(pass).click();
		driver.findElement(pass).clear();
		driver.findElement(pass).sendKeys("Sulkshana14@");
		
		driver.findElement(passcon).click();
		driver.findElement(passcon).clear();
		driver.findElement(passcon).sendKeys("Sulkshana14@");
		
		driver.findElement(pol).click();
		driver.findElement(reglogin).click();
		
		driver.findElement(acc).click();
		driver.findElement(logout).click();
	}
	public void forgetpass()
	{
		driver.findElement(acc).click();
		
		driver.findElement(log).click();
		driver.findElement(for_link).click();
		driver.findElement(name).click();
		driver.findElement(name).clear();
		driver.findElement(name).sendKeys("sulkshanad145@gmail.com");
		
		driver.findElement(b).click();
	}
	public void search()
	{
		driver.findElement(search).click();
		driver.findElement(search).sendKeys("iphone");
		
		driver.findElement(searchb).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void sort()
	{
		driver.findElement(mp3).click();
		
		driver.findElement(all).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement s=driver.findElement(sort);
		Select s1 = new Select(s);
		s1.selectByVisibleText("Name (A - Z)");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	public void add_to_cart() throws InterruptedException
	{
		username();
		password();
		login();
		
		driver.findElement(camera).click();
		driver.findElement(nikon).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		driver.findElement(add).click();
		
	}
	public void updatecart() throws InterruptedException
	{
		add_to_cart();
		
		driver.findElement(checkitem).click();
		driver.findElement(viewcart).click();
		Thread.sleep(5000);
		driver.findElement(quantity).click();
		driver.findElement(quantity).clear();
		driver.findElement(quantity).sendKeys("4");
		
		driver.findElement(update).click();
	}
	public void remove() throws InterruptedException
	{
		updatecart();
		Thread.sleep(5000);
		driver.findElement(remove).click();
	}
	public void checkout() throws InterruptedException
	{
		
		driver.findElement(checkoutButton).click();
	}
	public void address()
	{
		username();
		password();
		login();	
		driver.findElement(acc).click();
		driver.findElement(myacc).click();
		driver.findElement(address).click();
		//driver.findElement(edit).click();
		driver.findElement(newa).click();
		
		driver.findElement(uname).click();
		driver.findElement(uname).clear();
		driver.findElement(uname).sendKeys("sulkshana");
		
		driver.findElement(lname).click();
		driver.findElement(lname).clear();
		driver.findElement(lname).sendKeys("p");
		
		driver.findElement(shipadd).click();
		driver.findElement(shipadd).clear();
		driver.findElement(shipadd).sendKeys("Pune");
		
		driver.findElement(zip).click();
		driver.findElement(zip).clear();
		driver.findElement(zip).sendKeys("424308");
		
		driver.findElement(country).click();
		WebElement c=driver.findElement(country);
		Select c1 = new Select(c);
		c1.selectByVisibleText("India");
		
		driver.findElement(state).click();
		WebElement state1=driver.findElement(state);
		Select c2 = new Select(state1);
		c2.selectByVisibleText("Maharashtra");
		
		driver.findElement(continueb).click();
	}
	public void orders() 
	{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement orderHistoryLink = wait.until(ExpectedConditions.elementToBeClickable(order));
	    orderHistoryLink.click();
	}

	public void pyments()
	{
		driver.findElement(acc).click();
		driver.findElement(pay_co).click();
		driver.findElement(pay).click();
	}
}

