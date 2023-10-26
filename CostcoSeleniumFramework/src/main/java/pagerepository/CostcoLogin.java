package pagerepository;

	import org.openqa.selenium.By;
	import businessfunction.CostcoBaseClass;

	public class CostcoLogin extends CostcoBaseClass{
		static By signInName = By.name("Sign in name");
		static By password= By.name("Password");
		static By signIn = By.xpath("//*[@id=\"next\"]");
		
		public static void enterUserName(String myuserName)
		{
			driver.findElement(signInName).sendKeys(myuserName);
		}
		public static void enterPassword(String mypassword)
		{
			driver.findElement(password).sendKeys(mypassword);
			
		}
		
		public static void clickSignInButton()
		{
			driver.findElement(signIn).click();
		}

	}


