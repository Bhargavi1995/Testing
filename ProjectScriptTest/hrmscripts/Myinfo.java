package hrmscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.actions.ActionDriver;

public class Myinfo extends ActionDriver 
{
	@Test
	public void Apply() throws IOException, InterruptedException
	{
		click("html/body/div[1]/div[2]/ul/li[3]/a/b", "My Info");
		click(".//*[@id='sidenav']/li[3]/a", "Emergency Contacts");
		Thread.sleep(2000);
		click(".//*[@id='btnAddContact']", "Add");
	//  click(".//*[@id='checkAll']", "click");
		type(".//*[@id='emgcontacts_name']", "abcde", "Name");
		type(".//*[@id='emgcontacts_relationship']", "single", "Relationship");
		type(".//*[@id='emgcontacts_homePhone']", "123465789", "Home Telephone");
		type(".//*[@id='emgcontacts_mobilePhone']", "2223336655","Mobile");
		type(".//*[@id='emgcontacts_workPhone']", "65236547", "Work Telephone");
		click(".//*[@id='btnSaveEContact']", "Save");
		
		click(".//*[@id='attachmentsCheckAll']", "CheckAll");
		
		List<WebElement> checkBoxes = driver.findElements(By.xpath(".//input[@type='checkbox']"));
		  
		 int checkedCount=0, uncheckedCount=0;
		
	        for(int i=0; i<checkBoxes.size(); i++)
	        {
//	            System.out.println(i+" check Box is selected "+checkBoxes.get(i).isSelected());
	          
	            if(checkBoxes.get(i).isSelected())
	            {
	                checkedCount++;
	            }
	            else
	            {
	                uncheckedCount++;
	            }
	        }
	        System.out.println("number of selected checkbox: "+checkedCount);
	        System.out.println("number of unselected checkbox: "+uncheckedCount);
	        
	        
		click(".//*[@id='tblAttachments']/tbody/tr[1]/td[8]/a", "Edit");
		type(".//*[@id='txtAttDesc']", "hi hello ssup..??", "Comment");
		click(".//*[@id='cancelButton']", "Cancle");
		click(".//*[@id='welcome']", "Welcome");
//		click(".//*[@id='welcome-menu']/ul/li[3]/a", "Logout");
		System.out.println("logged out");
		
	}
}