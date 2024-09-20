package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	WebDriver ldriver;
	
	public AdminPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);//Used to initilize Web Element of respective page object class
	}
	
	//Java project
	//WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
	
	//Maven Project
	@FindBy(xpath = "//input[@id='Email']")
	 WebElement textEmail;//email
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement textPassword;//Password
	
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement btnLogin;//Login
	
	//User defined method to perform operation on above web element
	
	public void setEmail(String email) {
		textEmail.clear();
		textEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		textPassword.clear();
		textPassword.sendKeys(pwd);
	}
	
	public void ClickOnLogin() {
		btnLogin.click();
	}
	
	
}
