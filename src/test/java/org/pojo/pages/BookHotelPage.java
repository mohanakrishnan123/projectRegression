package org.pojo.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="first_name")
	private WebElement txtFName;
	
	@FindBy(id="last_name")
	private WebElement txtLName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCCNo;
	
	@FindBy(id="cc_type")
	private WebElement ddCCType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ddExpiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ddExpiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCVVNO;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;

	public WebElement getTxtFName() {
		return txtFName;
	}

	public WebElement getTxtLName() {
		return txtLName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCCNo() {
		return txtCCNo;
	}

	public WebElement getDdCCType() {
		return ddCCType;
	}

	public WebElement getDdExpiryMonth() {
		return ddExpiryMonth;
	}

	public WebElement getDdExpiryYear() {
		return ddExpiryYear;
	}

	public WebElement getTxtCVVNO() {
		return txtCVVNO;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	
	

}
