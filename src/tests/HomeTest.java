package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BasicTest {

	
	@Test(priority=0)
	public void homeFunctionality() {
		this.driver.navigate().to(this.baseUrl + "/my-account/");
		
		Assert.assertTrue(false);
	}
}
