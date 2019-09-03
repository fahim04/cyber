package com.stepdef;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Screenshot;
import com.common.base;
import com.page.myhomepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class search extends base {
	
	myhomepage pf;


@Given("^user on the homeopage$")
public void user_on_the_homeopage() throws Throwable {
    
    driver=getdriver();
   
    pf=PageFactory.initElements(driver, myhomepage.class);
    
}

@When("^user select the textbox$")
public void user_select_the_textbox() throws Throwable {
  
	pf.getText().sendKeys("iphone");
	
	 Screenshot.ss(driver, "iphone");
    
}

@When("^user type iphone$")
public void user_type_iphone() throws Throwable {
   Actions ac=new Actions(driver);
   //ac.sendKeys(Keys.ENTER);
   
   Screenshot.ss(driver, "case");
    
}

@When("^click enter$")
public void click_enter() throws Throwable {
    pf.getSearch().click();
    
    Screenshot.ss(driver, "enter");
}

@Then("^user successfully one the iphone catagory page$")
public void user_successfully_one_the_iphone_catagory_page() throws Throwable {
   Assert.assertEquals(driver.getTitle(), "iphone | eBay"); 
   System.out.println(driver.getTitle());
  
   driver.quit();
   
}

	
}
