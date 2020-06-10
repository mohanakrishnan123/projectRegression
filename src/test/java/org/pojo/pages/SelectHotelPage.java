package org.pojo.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass{
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement rdoBtn;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getRdoBtn() {
		return rdoBtn;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	

}
