package businessfunction;

import pagerepository.CostcoLogin;

public class CostcoUtils extends CostcoBaseClass 
{
	public static void login(String uname, String passwd)
	{
		CostcoLogin.enterUserName(uname);
		CostcoLogin.enterPassword(passwd);
		CostcoLogin.clickSignInButton();
	}

}
