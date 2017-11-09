package hrmscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.actions.ActionDriver;

public class ApplyLeave extends ActionDriver {
	@Test
	public void Apply() throws IOException, InterruptedException
	{
		click(".//*[@id='menu_leave_viewLeaveModule']/b", "LeaveTab");
		click(".//*[@id='menu_leave_applyLeave']", "ApplyButton");
		Thread.sleep(2000);
		//type(".//*[@id='applyleave_txtLeaveType']", "Annual Leave", "Select Leave type");
		//Thread.sleep(1000);
		Select Ltype = new Select(driver.findElement(By.xpath(".//*[@id='applyleave_txtLeaveType']")));
		Ltype.selectByVisibleText("Personal Leave");
		
		
		type("//input[@id='applyleave_txtFromDate']", "2017-11-29", "FromDate");
		Thread.sleep(2000);
		type("//input[@id='applyleave_txtToDate']", "2017-11-29", "ToDate");
		Thread.sleep(2000);
		type(".//*[@id='applyleave_duration_duration']", "Full Day", "Duration");
		Thread.sleep(2000);
		type("//*[@id='applyleave_txtComment']", "Request for leave", "Comments");
		Thread.sleep(2000);
		click("//input[@id='applyBtn']", "ApplyButton");
		
	}
	/*public void logout() throws InterruptedException
	{
		
		click(".//*[@id='welcome']", "WelcomeCRM");
		Thread.sleep(3000);
		click(".//*[@id='welcome-menu']/ul/li[3]/a", "Logout");
		Thread.sleep(5000);
		/*if (driver.findElement(By.xpath(".//*[@id='txtUsername']")).isDisplayed()) {
			return "pass";			
		}
		else
		{
			return "fail";
		}
		
	}*/

}


