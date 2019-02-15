package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample4 {
	@Test(priority=1,groups="sm")
	public void CreateTask()
	{
		Reporter.log("user is created",true);
	}
  @Test(priority=2,groups= {"sm","sy"})
  public void editTask()
  {
	  Reporter.log("user is edited",true);
  }
  @Test(priority=3,groups="sy")
  public void deleteTask()
  {
	  Reporter.log("user is deleted",true);
  }
}
	