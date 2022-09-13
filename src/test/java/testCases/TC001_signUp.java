package testCases;



import java.time.Duration;

import org.testng.annotations.Test;

import base.DriverSetup;
import pageObj.PO001_signUp;

public class TC001_signUp extends DriverSetup{
	
	
	@Test
	public void signUp() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String baseUrl = "https://www.rokomari.com/book";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		PO001_signUp signUp = new PO001_signUp(driver);
		
		
		
		signUp.clickOnSignInBtn();
		Thread.sleep(3000);
		signUp.clickOnsignInWithGoogleBtn();
		Thread.sleep(3000);
		signUp.sendEmail();
		Thread.sleep(3000);
		signUp.clickOnNextBtn();
		Thread.sleep(3000);
		signUp.enterPass();
		Thread.sleep(3000);
		signUp.clickOnPassNextBtn();
		Thread.sleep(3000);
		signUp.clickOnHumayen();
		Thread.sleep(3000);
	}

}
