package implementation;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectModel.DriverSetup;
import pageObjectModel.FlipkartPageLocator;
public class A_Flipkarttest extends DriverSetup{
	@Test
	public void AFlipkarttest() throws InterruptedException {
		        //Create object for Flipkart page object
				FlipkartPageLocator FlipkartObject = new FlipkartPageLocator(driver);
				//Type ‘mobile’ in the search-box
				Thread.sleep(5000);
				FlipkartObject.GetSearchMenuGo().click();
				Thread.sleep(5000);
				FlipkartObject.GetSearchButtonInput().sendKeys("Mobile");
				FlipkartObject.GetSearchButton().click();
				//Click on the first search result
				Thread.sleep(5000);
				FlipkartObject.GetFirstSearchResult().click();
				//Click on ‘Add to cart’ button
				Thread.sleep(2000);
				FlipkartObject.GetAddToCartButton().click();
				//Click on ‘Go to cart’ button
				Thread.sleep(5000);
				FlipkartObject.GetGoToCartButton().click();
				
				//Verify you see ‘My Cart’ as heading of the activity
				Thread.sleep(5000);
				Boolean myCartisPresent = FlipkartObject.GetMyCart().isDisplayed();
				
				Assert.assertTrue(myCartisPresent);
				
		
		
		
	}

}