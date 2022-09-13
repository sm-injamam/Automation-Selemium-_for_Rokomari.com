package pageObj;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class PO001_signUp {

	WebDriver driver = null;

	public PO001_signUp(WebDriver driver) {
		this.driver = driver;

	}

	By signInBtn = By.xpath("//a[normalize-space()='Sign in']");
	By signInWithGoogleBtn = By
			.xpath("//div[@id='js--login-form']//button[@class='btn btn-social-google'][normalize-space()='Google']");
	By email = By.xpath("//input[@type='email']");
	By nextBtn = By.xpath("//div[@class='qhFLie']");
	By pass = By.name("password");
	By passNextBtn = By.xpath("//div[@class='qhFLie']");
	By author = By.xpath("//a[@id='js--authors']");
    By humayenAhmed = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
	
//	WebElement author = driver.findElement(By.xpath("//a[@id='js--authors']"));
//	WebElement humayenAhmed = driver.findElement(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]"));

	public void clickOnSignInBtn() {
		driver.findElement(signInBtn).click();
	}

	public void clickOnsignInWithGoogleBtn() {
		driver.findElement(signInWithGoogleBtn).click();
	}

	public void sendEmail() {
		driver.findElement(email).sendKeys("injamam15-11975@diu.edu.bd");
	}

	public void clickOnNextBtn() {
		driver.findElement(nextBtn).click();
	}

	public void enterPass() {
		driver.findElement(pass).sendKeys("imtheboss975");
	}

	public void clickOnPassNextBtn() {
		driver.findElement(passNextBtn).click();
	}

	
   
	
   
   
   public void clickOnHumayen() {
	   Actions action = new Actions(driver);
	   action.moveToElement((WebElement) author).moveToElement((WebElement) humayenAhmed).click().perform();
   }
}
