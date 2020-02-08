package pages;

import base.ProjectSpecMethod;

public class Dashboard extends ProjectSpecMethod{
	
	public void title() {
		
		String Header = driver.getTitle();
		System.out.println(Header);
		
		if (Header.contains("ACME")) {
			
			driver.close();
		}
		
	}

}
