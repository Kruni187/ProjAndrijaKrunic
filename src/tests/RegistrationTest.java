package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BasicTest {

	
	@Test
	public void registerFunctionality() {
		this.driver.navigate().to(this.baseUrl + "/my-account/");
		
//		Assert.assertTrue(false);
	}
}
