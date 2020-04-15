package com.atcostPage;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.atcost.util.Xls_Reader;

public class Question3Page extends com.atcost.Base.BaseTest {
	
	
	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[1]")
	private WebElement searchBtn;

	@FindBy(how = How.XPATH, using = "//*[@class='form-control']")
	private WebElement categories;
	@FindBy(how = How.XPATH, using = "//*[@class='icon-search button-search hover_icon']")
	private WebElement searcbutton;
	@FindBy(how = How.XPATH, using = "//*[@id='button-search']")
	private WebElement searcbutton1;
	@FindBy(how = How.XPATH, using = "//div[@class='item product-layout container-product-grid']")
	private WebElement itenselect;
	@FindBy(how = How.XPATH, using = "//*[@class='quantity_button plus arrow_icon']")
	private WebElement quantity_buttonplus;
	@FindBy(how = How.XPATH, using = "(//*[@name='quantity'])")
	private WebElement quantity;
	
	@FindBy(how = How.XPATH, using = "//*[@id='button-cart']")
	private WebElement AddtoCart;
	@FindBy(how = How.XPATH, using = "//*[@class='cart_holder']")
	private WebElement cartholder;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='name'])[2]")
	private WebElement iteminchart;
	@FindBy(how = How.XPATH, using = "(//*[@class='price total mobile_hide'])[1]")
	private WebElement itempriceinchart;
	@FindBy(how = How.XPATH, using = "(//*[@type='text'])[3]")
	private WebElement itemequantity;
	@FindBy(how = How.XPATH, using = "(//*[@class='fa fa-times'])[2]")
	private WebElement rmovebutton;
	@FindBy(how = How.XPATH, using = "(//*[@class='live_name'])[1]")
	private WebElement live_name;
	
	
	public Question3Page () {
		PageFactory.initElements(driver, this);
	}
		

	public void Slectitem ()  {
		System.out.println(" Start question 3rd answer /Slectitem and add to chart/");
		waitclass();
		 Xls_Reader xlsreader = new Xls_Reader("./src/main/java/com/atcost/util/Projectdata.xlsx");
		 String sheetName = "Items";
		 int rowcount =xlsreader.getRowCount(sheetName);
		 for(int rowNum=2;rowNum<=rowcount;rowNum++) {
		String items=	xlsreader.getCellData(sheetName,"ItemName",rowNum);
		//String description=	xlsreader.getCellData(sheetName,"Description",rowNum);
		String item=	xlsreader.getCellData(sheetName,"itemcte",rowNum);
		waitclass();
		searchBtn.sendKeys(items);
	 
	Select itemkl =new Select(driver.findElement(By.xpath("//*[@name='category_id']")));
	itemkl.selectByVisibleText(item);
	searcbutton.click();
		itenselect.click();	
		quantity_buttonplus.click();
		AddtoCart.click();
		cartholder.click();	
		waitclass();
		driver.navigate().back();
		waitclass();
		cartholder.click();	
		waitclass();
		System.out.println(iteminchart.getText());
		System.out.println(itempriceinchart.getText());
		System.out.println(itemequantity.getAttribute("value"));
	}}
	
	
	public String checkitemname ()  {
		System.out.println("10");
			return iteminchart.getText();
	}
	


public String checkitemeprice ()  {
	System.out.println("110");
	
return itempriceinchart.getText();
}

public String checkitemequantity ()  {
	System.out.println("12");

	return itemequantity.getAttribute("value");
}


public void removeorder ()  {
	try {
		rmovebutton.click();
	}
	catch(org.openqa.selenium.StaleElementReferenceException ex)
	{
		rmovebutton.click();
	}}}

