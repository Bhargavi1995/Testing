package hrmscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import base.actions.ActionDriver;

public class MyLeave extends ActionDriver {
	@Test
	public void MyLeavelist() throws IOException, InterruptedException{
		click("//a[@id='menu_leave_viewMyLeaveList']", "MyLeaveTab");
		Thread.sleep(1000);
		type("//input[@id='calFromDate']", "2017-11-29", "From");
		Thread.sleep(1000);
		type("//input[@id='calToDate']", "2017-11-29", "To");
		Thread.sleep(1000);
		click("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']", "All");
		Thread.sleep(1000);
		click("//input[@id='leaveList_chkSearchFilter_-1']", "Rejected");
		Thread.sleep(1000);
		click("//input[@id='leaveList_chkSearchFilter_0']", "Cancelled");
		click("//input[@id='leaveList_chkSearchFilter_1']", "PendingApproval");
		click("//input[@id='leaveList_chkSearchFilter_2']", "Scheduled");
		click("//input[@id='leaveList_chkSearchFilter_3']", "Taken");
		Thread.sleep(2000);
		click("//input[@id='btnSearch']", "Search");
		Thread.sleep(2000);
		click("//input[@id='btnReset']", "Reset");
		
	}	

	
}
