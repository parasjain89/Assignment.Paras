package com.atcostPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends com.atcost.Base.BaseTest {
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Login')]")
	private WebElement Loginlink;
	
	
	@FindBy(how = How.XPATH, using = "//*[@name='email']")
	private WebElement user;

	@FindBy(how = How.XPATH, using = "//*[@name='password']")
	private WebElement Pass;
	@FindBy(how = How.XPATH, using = "(//*[@class='pull-left col-md-3'])[2]")
	private WebElement Submitbutton;
	
 
	public HomePage () {
		PageFactory.initElements(driver, this);
	}
			
	public Question3Page cilikonLoginlink ()  {
		driver.get(pro.getProperty("url"));
		bwaitclass();
		 driver.manage().window().maximize(); 
		 waitclass();
		 
			

		return new Question3Page() ;
		
		 }
	
	}
