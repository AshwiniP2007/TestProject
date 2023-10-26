package test;




import businessfunction.CostcoBaseClass;
import businessfunction.CostcoUtils;
import configuration.CofigCostco;


public class CostcoSignInTest extends CostcoBaseClass {
	
	public static void main(String[]args)
	{
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_561/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid+offline_access&response_type=code+id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=8g7h2g8nv0yu0c55&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		CostcoBaseClass.launchapplication();
		//LoginPage.enterUserName("Ash_test@gmail.com");
		//LoginPage.enterPassword("Test@123");
		//LoginPage.clickSignInButton();
		
		CostcoUtils.login(CofigCostco.getPropVal("username"), CofigCostco.getPropVal("password"));
		
		CostcoBaseClass.closeapplication();
		//driver.close();
		//driver.quit();
	}

}
