package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPage {
	
	
    WebDriver driver; 
	
	public amazonPage(WebDriver dr) {
		
		driver = dr; 
		PageFactory.initElements(driver, this);
	}
	
	
	
 @FindBy(xpath = "//a[@id= 'nav-link-accountList']")
 WebElement signinButton;
 
 @FindBy(xpath= "//input[@id='ap_email']")
 WebElement emailBox;
 
 @FindBy(xpath = "//input[@id='continue']")
 WebElement continueButton;
 
 @FindBy(xpath = "//input[@id='ap_password']")
 WebElement passwordBox; 
 
 @FindBy(xpath = "//input[@id='signInSubmit']")
 WebElement signIn;
 
 @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
 WebElement accountName; 
 
 
 public void clickOnSignInButton() {
	 signinButton.click();
	 
 }
 
 public void enterEmailAddress(String User_Name) {
	 emailBox.sendKeys(User_Name);
	 continueButton.click();
 }
 
 public void enterPassword(String password) {
	 passwordBox.sendKeys(password);
 }
 
 public void clickonSignIn() {
	 signIn.click();
 }
 
 public String verifyAmazonAccount() {
	 
	 return accountName.getText();
 }
 
 
 
 
	

}
