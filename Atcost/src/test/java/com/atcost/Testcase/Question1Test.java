package com.atcost.Testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atcostPage.Question1Page;

public class Question1Test extends com.atcost.Base.BaseTest {
		
		Question1Page question1Page;
		com.atcostPage.LoginPage loginPage;
		
		public Question1Test() {
			super();
		}
		@BeforeMethod
		public void first() {
			inbokebrowser();
			loginPage =new com.atcostPage.LoginPage();
			question1Page =new Question1Page();
			
			
		}
		@Test
		public void verifySigninlink() {
			question1Page.highlight();
				
			}	
		
		@AfterMethod
		public void close() {
			driver.quit();
			
		}
	}



