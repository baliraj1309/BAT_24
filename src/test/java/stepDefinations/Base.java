package stepDefinations;

import org.openqa.selenium.WebDriver;

import pageObjects.Vendor;
import pageObjects.AddNewCustPage;
import pageObjects.AdminPage;
import utilities.ReadConfig;

public class Base {

	WebDriver driver;
	
	AdminPage admin;
	
	ReadConfig readConfig;
	
	AddNewCustPage addCust;
	
	Vendor vendor;
	
	
}
