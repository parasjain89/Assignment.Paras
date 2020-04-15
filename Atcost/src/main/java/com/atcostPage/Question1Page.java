package com.atcostPage;

import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Question1Page extends com.atcost.Base.BaseTest{
	@FindBy(how = How.XPATH, using = "//*[@class='LM6RPg']")
	private WebElement searchBtn;
	//LM6RPg
	@FindBy(how = How.XPATH, using = "//*[@class='_2AkmmA _29YdH8']")
	private WebElement cross;
	@FindBy(how = How.LINK_TEXT, using = "mobiles")
	private WebElement item;
	
	public Question1Page () {
		PageFactory.initElements(driver, this);
	}
			
	private boolean existsElement() {
	    try {
	    	cross.click();
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	    return true;
	}
		public void highlight ()  {
			System.out.println(" Start question 1st answer /ighlight search bar item/");

			driver.get(pro.getProperty("url1"));
			 driver.manage().window().maximize(); 
			 existsElement();	 
		    searchBtn.click();
 
		Actions action = new Actions(driver); 
			action.moveToElement(item).build()
			.perform();
			waitclass();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='5px solid red'", item);
		
		System.out.println(" Successfull question 1st answer /ighlight search bar item/");
		
				}
		
}
