package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample3 {
	@Test(priority=1,groups="sm")
	public void CreateUser()
	{
		Reporter.log("user is created",true);
	}
  @Test(priority=2,groups= {"sm","sy"})
  public void edituser()
  {
	  Reporter.log("user is edited",true);
  }
  @Test(priority=3,groups="sy")
  public void deleteuser()
  {
	  Reporter.log("user is deleted",true);
  }
  
 
  }