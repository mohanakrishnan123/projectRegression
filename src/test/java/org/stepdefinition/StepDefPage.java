package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.pojo.pages.BookHotelPage;
import org.pojo.pages.BookingConfirmationPage;
import org.pojo.pages.LoginpagePOJO;
import org.pojo.pages.SearchHotelPage;
import org.pojo.pages.SelectHotelPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefPage extends BaseClass {
	
	
	
	@Given("user is on adactinwebpage")
	public void user_is_on_adactinwebpage() {
		launchBrowser();
		launchUrl("https://adactin.com/HotelApp/");
	
	}

	@When("user enters email and password")
	public void user_enters_email_and_password() {
		LoginpagePOJO l=new LoginpagePOJO();
		type(l.getUser(),"Mohan321");
		type(l.getPass(),"qwerty");
	 
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		LoginpagePOJO l=new LoginpagePOJO();
		click(l.getButton());
	
	}

	@Then("user verifying the error msg")
	public void user_verifying_the_error_msg() {
		Assert.assertTrue("Verify user details",driver.getCurrentUrl().contains("SearchHotel"));
		System.out.println("Login successfully");
	 
	}
	
	@Given("User in search page for booking hotel")
	public void user_in_search_page_for_booking_hotel() {
		Assert.assertTrue("Verify user details",driver.getCurrentUrl().contains("SearchHotel"));
		System.out.println("user successfully move into searchhotel page");
	}

	@When("user select dd for location,hotels,roomtype,noofRooms")
	public void user_select_dd_for_location_hotels_roomtype_noofRooms() {
		SearchHotelPage s=new SearchHotelPage();
		selectByIndex(s.getDdLocation(),2);
		selectByIndex(s.getDdHotels(),2);
		selectByIndex(s.getDdRoomType(),1);
		selectByIndex(s.getDdNoofRooms(),1);
	}

	@When("user enters check_in and check_out dates")
	public void user_enters_check_in_and_check_out_dates() {
		SearchHotelPage s=new SearchHotelPage();
		type(s.getTxtBoxDatePickIn(),"30/03/2020");
		type(s.getTxtBoxDatePickOut(),"31/03/2020");
	
	}

	@When("user select dd for adultproom,childproom and click search button")
	public void user_select_dd_for_adultproom_childproom_and_click_search_button() {
		SearchHotelPage s=new SearchHotelPage();
		selectByText(s.getDdAdultPerRoom(),"2 - Two");
		selectByText(s.getDdChildPerRoom(),"2 - Two");
		click(s.getBtnSearch());
		
	}

	@Then("user verifying moved to nxt page")
	public void user_verifying_moved_to_nxt_page() {
	Assert.assertTrue(driver.getCurrentUrl().contains("SelectHotel"));
	System.out.println("search done ");
	}
	
	@Given("User is on select hotel page")
	public void user_is_on_select_hotel_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("SelectHotel"));
		System.out.println("user successfully move into select hotel page ");
	}

	@When("User should select hotel and click continue")
	public void user_should_select_hotel_and_click_continue() {
		SelectHotelPage page3=new SelectHotelPage();
		click(page3.getRdoBtn());
		click(page3.getBtnContinue());
	    
	}

	@Then("User verify moved to BookHotel Page")
	public void user_verify_moved_to_BookHotel_Page() {
		
		Assert.assertTrue(driver.getCurrentUrl().contains("BookHotel"));
		System.out.println("Hotel selection done");
	}
	

	@Given("User in on BookHotel Page")
	public void user_in_on_BookHotel_Page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("BookHotel"));
		System.out.println("user successfully move into Book Hotel page");
	}

	@When("User enters fname,lname,billingAddress")
	public void user_enters_fname_lname_billingAddress() {
		BookHotelPage page4=new BookHotelPage();
		type(page4.getTxtFName(),"Mohan");
		type(page4.getTxtLName(),"Krishnan");
		type(page4.getTxtAddress(),"Chennai");
 
	}

	@When("User enters creditcard details")
	public void user_enters_creditcard_details() {
		BookHotelPage page4=new BookHotelPage();
		type(page4.getTxtCCNo(),"9876543212345678");
		selectByIndex(page4.getDdCCType(),4);
		selectByIndex(page4.getDdExpiryMonth(),9);
		selectByIndex(page4.getDdExpiryYear(),12);
		type(page4.getTxtCVVNO(),"434");
 
	}

	@When("User clicks BookNow button")
	public void user_clicks_BookNow_button() {
		BookHotelPage page4=new BookHotelPage();
		click(page4.getBtnBookNow());
  
	}

	@Then("User verfy move to BookingConfirm page")
	
	public void user_verfy_move_to_BookingConfirm_page() throws InterruptedException {
		
		Thread.sleep(5000);
		Assert.assertTrue(driver.getCurrentUrl().contains("BookingConfirm"));
		System.out.println("Booking proccessed");
	}
	
	@Given("User is on Booking Confirmation page")
	public void user_is_on_Booking_Confirmation_page() {
		Assert.assertTrue(driver.getCurrentUrl().contains("BookingConfirm"));
		System.out.println("Booking done");
	}

	@Then("User gets order id")
	public void user_gets_order_id() {
	   BookingConfirmationPage page5=new BookingConfirmationPage();
	   String att = getAtt(page5.getTxtOrderId(),"value");
	   
	   System.out.println(att);

}
}