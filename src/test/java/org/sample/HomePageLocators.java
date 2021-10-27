package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLocators extends LibGlobal {
	public HomePageLocators() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(id = "location")
	private WebElement location;
	@CacheLookup
	@FindBy(id = "hotels")
	private WebElement hotels;
	@CacheLookup
	@FindBy(id = "room_type")
	private WebElement roomType;
	@CacheLookup
	@FindBy(id = "room_nos")
	private WebElement roomsCount;

	@CacheLookup
	@FindBy(id = "datepick_in")
	private WebElement checkInDate;

	@CacheLookup
	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;

	@CacheLookup
	@FindBy(id = "adult_room")
	private WebElement adultPerRoom;

	@CacheLookup
	@FindBy(id = "child_room")
	private WebElement childPerRoom;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomsCount() {
		return roomsCount;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	@CacheLookup
	@FindBy(id = "Submit")
	private WebElement searchBtn;

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	@CacheLookup
	@FindBy(id = "continue")
	private WebElement cntBtn;

	@CacheLookup
	@FindBy(id = "radiobutton_0")
	private WebElement radioBtn;

	public WebElement getCntBtn() {
		return cntBtn;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	@CacheLookup
	@FindBy(id = "first_name")
	private WebElement firstName;

	@CacheLookup
	@FindBy(id = "last_name")
	private WebElement lastName;
	@CacheLookup
	@FindBy(id = "address")
	private WebElement address;

	@CacheLookup
	@FindBy(id = "cc_num")
	private WebElement CcNum;

	@CacheLookup
	@FindBy(id = "cc_type")
	private WebElement ccType;

	@CacheLookup
	@FindBy(id = "cc_exp_month")
	private WebElement expmonthDdn;

	@CacheLookup
	@FindBy(id = "cc_exp_year")
	private WebElement expyearDdn;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return CcNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpmonthDdn() {
		return expmonthDdn;
	}

	public WebElement getExpyearDdn() {
		return expyearDdn;
	}

	public WebElement getCvvTxtBox() {
		return cvvTxtBox;
	}

	public WebElement getBookBtn() {
		return bookBtn;
	}

	@CacheLookup
	@FindBy(id = "cc_cvv")
	private WebElement cvvTxtBox;
	@CacheLookup
	@FindBy(id = "book_now")
	private WebElement bookBtn;

	@CacheLookup
	@FindBy(xpath = "//input[@id='order_no']")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;

	}

}
