package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample7 {
	final int a=10;
		@Test(priority=a)
		public void CreateTask()
		{
			Reporter.log("user is created",true);
		}
	  @Test(priority=2)
	  public void editTask()
	  {
	Assert.fail();
		  Reporter.log("user is edited",true);
	  }
	  @Test(priority=3)
	  public void deleteTask()
	  {
		  Reporter.log("user is deleted",true);
	  }
	}
		


