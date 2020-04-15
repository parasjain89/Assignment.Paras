package com.atcostPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.atcost.Base.BaseTest;
import com.atcost.util.Xls_Reader;

public class LoginPage  extends BaseTest {
	
	
	@FindBy(how = How.XPATH, using = "//*[@name='email']")
	private WebElement user;

	@FindBy(how = How.XPATH, using = "//*[@name='password']")
	private WebElement Pass;
	@FindBy(how = How.XPATH, using = "(//*[@class='pull-left col-md-3'])[2]")
	private WebElement Submitbutton;
	
	@FindBy(how = How.LINK_TEXT, using = "Login")
	private WebElement Loginlink;
	
 
	public LoginPage () {
		PageFactory.initElements(driver, this);
	}
			
	public Question3Page Loginprocess ()   {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Loginlink.click();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.switchTo().frame(0);
	 
		 Xls_Reader xlsreader = new Xls_Reader("./src/main/java/com/atcost/util/Projectdata.xlsx");
		 String sheetName = "Sheet2";
		 int rowcount =xlsreader.getRowCount(sheetName);
		 for(int rowNum=2;rowNum<=rowcount;rowNum++) {
		String User=	xlsreader.getCellData(sheetName,"Username",rowNum);
		String pswd=	xlsreader.getCellData(sheetName,"Password",rowNum);
		waitclass();
		user.sendKeys(User);
		Pass.sendKeys(pswd);
		Submitbutton.click();
		 }
		return new Question3Page();
		 
	
	}}
