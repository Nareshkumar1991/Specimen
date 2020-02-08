package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecMethod;
import pages.Loginpage;

public class TC001_LoginPage extends ProjectSpecMethod {

	
	@Test
	public void ACMETest() {
		
		new Loginpage().username().password().Clicklogin().title();
	}
}
