package pages;

import base.ProjectSpecMethod;

public class Loginpage extends ProjectSpecMethod {

	public Loginpage username() {

		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");

		return this;
	}

	public Loginpage password() {

		driver.findElementById("password").sendKeys("leaf@12");
		return this;

	}

	public Dashboard Clicklogin() {

		driver.findElementById("buttonLogin").click();
		return new Dashboard();
	}
}
