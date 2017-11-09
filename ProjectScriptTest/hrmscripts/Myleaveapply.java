package hrmscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.actions.ActionDriver;

@Test(priority = 0)
public class Myleaveapply extends ActionDriver {
	public void Experience() throws IOException, InterruptedException {
		click(".//*[@id='menu_pim_viewMyDetails']/b", "Myinfo");
		click(".//*[@id='sidenav']/li[9]/a", "Qualifications");
		click(".//*[@id='addWorkExperience']", "Add");
		type(".//*[@id='experience_employer']", " something", " Company");
		type(".//*[@id='experience_jobtitle']", "se", "jobtitle");
		type(".//*[@id='experience_from_date']", "2016-08-20", "From");
		type(".//*[@id='experience_to_date']", "2017-08-22", "To");
		type(".//*[@id='experience_comments']", "jsdhjfh jdsfh dshf", "Comment");
		click(".//*[@id='btnWorkExpSave']", "save");
	}

	@Test(priority = 1)
	public void qualifica() throws IOException, InterruptedException {
		click(".//*[@id='addEducation']", "ADDBUT");
		Select Ltype = new Select(driver.findElement(By.xpath(".//*[@id='education_code']")));
		Ltype.selectByVisibleText("B.Tech");
		type(".//*[@id='education_institute']", "tm", "Institute");
		type(".//*[@id='education_major']", "tjhgdf", "major");
		type(".//*[@id='education_major']", "tjhgdf", "major");
		type(".//*[@id='education_year']", "2017", "year");
		type(".//*[@id='education_gpa']", "dsjdsfh", "score");
		type(".//*[@id='education_start_date']", "2016-09-23", "date");
		type(".//*[@id='education_end_date']", "2017-09-25", "enddate");
		click(".//*[@id='btnEducationSave']", "save");

		Thread.sleep(2000);
		click("//a[@id='welcome']", "Welcome");
		Thread.sleep(2000);
		click("//*[@id='welcome-menu']/ul/li[3]/a", "Logout");

	}

}
