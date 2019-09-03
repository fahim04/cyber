package com.stepdef;

import com.common.Screenshot;
import com.common.base;
import com.page.dropdownpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dropdown extends base {
	
	dropdownpage dd;
	
	@Given("^user able to go homwpage$")
	public void user_able_to_go_homwpage() throws Throwable {
	   
		driver= getdriver();
		
	}

	@When("^user able to click on all catagory$")
	public void user_able_to_click_on_all_catagory() throws Throwable {
	 
	  dd=new dropdownpage (driver);
		 dd.box();
		 
	    Screenshot.ss(driver, "drop");
	  
		  
	}

	@When("^user able to click on books$")
	public void user_able_to_click_on_books() throws Throwable {
	   
	   
	}

	@When("^user press search$")
	public void user_press_search() throws Throwable {
	   
	   
	}

	@Then("^user successfully go book page$")
	public void user_successfully_go_book_page() throws Throwable {
	   
	   
	}

}
