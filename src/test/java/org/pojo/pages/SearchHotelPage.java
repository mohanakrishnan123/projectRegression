package org.pojo.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass{
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement ddLocation;
	
	@FindBy(id="hotels")
	private WebElement ddHotels;
	
	@FindBy(id="room_type")
	private WebElement ddRoomType;
	
	@FindBy(id="room_nos")
	private WebElement ddNoofRooms;
	
	@FindBy(id="datepick_in")
	private WebElement txtBoxDatePickIn;
	
	@FindBy(id="datepick_out")
	private WebElement txtBoxDatePickOut;
	
	@FindBy(id="adult_room")
	private WebElement ddAdultPerRoom;
	
	@FindBy(id="child_room")
	private WebElement ddChildPerRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;

	public WebElement getDdLocation() {
		return ddLocation;
	}

	public WebElement getDdHotels() {
		return ddHotels;
	}

	public WebElement getDdRoomType() {
		return ddRoomType;
	}

	public WebElement getDdNoofRooms() {
		return ddNoofRooms;
	}

	public WebElement getTxtBoxDatePickIn() {
		return txtBoxDatePickIn;
	}

	public WebElement getTxtBoxDatePickOut() {
		return txtBoxDatePickOut;
	}

	public WebElement getDdAdultPerRoom() {
		return ddAdultPerRoom;
	}

	public WebElement getDdChildPerRoom() {
		return ddChildPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	

}
