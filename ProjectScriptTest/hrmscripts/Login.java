package hrmscripts;

import java.io.IOException;

//import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.actions.ActionDriver;
@Test
public class Login extends ActionDriver {
	
	public void ValidLogin() throws IOException
	{
		System.out.println("Valid Login");
		type("//input[@id='txtUsername']", "user01", "Username");
		type("//input[@id='txtPassword']", "pass1234", "Password");
		click("//input[@id='btnLogin']", "Login");
		
		
	}
}