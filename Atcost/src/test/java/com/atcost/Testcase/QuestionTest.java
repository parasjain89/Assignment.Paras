package com.atcost.Testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.atcost.Base.BaseTest;
import com.atcost.util.Xls_Reader;
import com.atcostPage.HomePage;
import com.atcostPage.Question3Page;
import com.atcostPage.Question4Page;
import com.atcostPage.Question6Page;

public class QuestionTest extends BaseTest {
	Question3Page question3Page;
	com.atcostPage.LoginPage loginPage;
	Question4Page question4Page;
	Question6Page question6Page;
	HomePage homePage;
	
	public QuestionTest() {
		super();
	}
	@BeforeMethod
	public void first() {
		inbokebrowser();
		question3Page =new Question3Page();
		question4Page =new Question4Page();
		question6Page =new Question6Page();
	     homePage =new HomePage();
	     
	}
	@Test
	public void Question3() {
		 homePage.cilikonLoginlink();
		 question3Page.Slectitem();
		
		 waitclass();
		//String itemquentity=question3Page.checkitemequantity();
		
		//System.out.println(itemquentity);
		
		String itemname=question3Page.checkitemname();
		System.out.println(itemname);
		String itemprice=question3Page.checkitemeprice();
		itemprice = itemprice.replace("?", "");
		System.out.println(itemprice);
		SoftAssert softAssert =new SoftAssert(); 
		Xls_Reader xlsreader = new Xls_Reader("./src/main/java/com/atcost/util/Projectdata.xlsx");
		String sheetName = "Items";
		  
			 int rowcount =xlsreader.getRowCount(sheetName);
			 for(int rowNum=2;rowNum<=rowcount;rowNum++) {
			 String itemnam=	xlsreader.getCellData(sheetName,"ItemName",rowNum);
			 softAssert.assertEquals(itemname, itemnam);
			 }
		for(int rowNum=2;rowNum<=rowcount;rowNum++) {
			 String Itemprice=	xlsreader.getCellData(sheetName,"Itemprice",rowNum);
			 softAssert.assertEquals(itemprice, Itemprice);
			 }
		for(int rowNum=2;rowNum<=rowcount;rowNum++) {
			 String Itemcount=	xlsreader.getCellData(sheetName,"Itemcount",rowNum);
			// softAssert.assertEquals(itemquentity, Itemcount);
			 }
		question3Page.removeorder();

		System.out.println(" Successfully complete question 3rd answer /Slectitem and add to chart/");
		}
	
	@Test
	public void Question4() {
		homePage.cilikonLoginlink();
		question4Page.Slecitem();
		
		System.out.println(" Successfully complete question 4th answer /Slectitem and add to chart/");
		}
		
	@Test
	public void Question6() {
		
		homePage.cilikonLoginlink();
		SoftAssert softAssert =new SoftAssert(); 
		question6Page.producnamenverify();
		String ActualDescrition= question6Page.Descritionverify();
		 Xls_Reader xlsreader = new Xls_Reader("./src/main/java/com/atcost/util/Projectdata.xlsx");
		 String sheetName = "Items";
		 int rowcount =xlsreader.getRowCount(sheetName);
		 for(int rowNum=2;rowNum<=rowcount;rowNum++) {
		String description=	xlsreader.getCellData(sheetName,"Description",rowNum);
		 softAssert.assertEquals(description, ActualDescrition);
		 }
		
		System.out.println(" Successfully complete question 6th answer /Slectitem and add to chart/");
		}	

	
	@AfterMethod
	public void close() {
		driver.quit();
		
	}

}
