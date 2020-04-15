package com.atcost.Testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atcost.Base.BaseTest;
import com.atcostPage.Question2Page;

public class Question2Test extends BaseTest {
	Question2Page question2Page;
	
	
	public Question2Test() {
		super();
	}
	@BeforeMethod
	public void first() {
		inbokebrowser();
		question2Page =new Question2Page();

	}
	@Test
	public void verifyiteminchart() {
		question2Page.Handledynamictable();
			
		}
	@AfterMethod
	public void close() {
		driver.quit();
		
	}

}
