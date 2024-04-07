package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepkg.BaseClass;



public class PageClass extends BaseClass{
	WebDriver driver;
	@FindBy(xpath="/html/body/main/header/div/div/section[7]/div[2]/div/div[3]/div/div/div[2]/div")
	WebElement ac;
	
	
	
	@FindBy(xpath="//*[@id=\"index\"]/div[1]/div[2]/div[2]/div[3]/input")
	WebElement email;
	
	
	@FindBy(xpath="//*[@id=\"index\"]/div[1]/div[2]/div[2]/div[5]")
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"index\"]/div[1]/div[2]/div[2]/div[6]")
	WebElement addcart;
	

	
	
	public PageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void account()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(750,0)");
		ac.click();
		
	}
	public void log()
	{
		email.click();
		
	}
	
	
	public void setvalues(String UN)
	{
		email.sendKeys(UN);
		
	}
	public void sign()
	{
		signin.click();
		
	}
	public void cart()
	{
		addcart.click();
		
	}

	public void clickLoginButton() throws InterruptedException
	{
		signin.click();
		driver.navigate().refresh();
		Thread.sleep(5000);
	}
	
	
	
}
