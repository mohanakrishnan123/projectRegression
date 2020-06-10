Feature: Booking a Hotel in Adactin webstie

Scenario: Verifying login details
Given user is on adactinwebpage
When user enters email and password
And user clicks login button
Then user verifying the error msg

Scenario: User Search for Hotel
Given User in search page for booking hotel
When user select dd for location,hotels,roomtype,noofRooms
And user enters check_in and check_out dates
And user select dd for adultproom,childproom and click search button
Then user verifying moved to nxt page

Scenario: User Selects Hotel from Available List
Given User is on select hotel page
When User should select hotel and click continue
Then User verify moved to BookHotel Page

Scenario: User should fill personal and transactional details
Given User in on BookHotel Page
When User enters fname,lname,billingAddress
And User enters creditcard details
And User clicks BookNow button
Then User verfy move to BookingConfirm page

Scenario: User gets OrderId after successfull transaction
Given User is on Booking Confirmation page
Then User gets order id