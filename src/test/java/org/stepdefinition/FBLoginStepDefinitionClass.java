package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;

public class FBLoginStepDefinitionClass extends BaseClass {


@Given("The user should launch the chrome browser")
public void the_user_should_launch_the_chrome_browser() {
	
   loadChrome();
}

@When("The user should type the url")
public void the_user_should_type_the_url() {
   loadUrl("https://www.facebook.com/");
}

@When("The user sholud maximize the window")
public void the_user_sholud_maximize_the_window() {
    winMax();
}

@When("The user should type the invalid username and passward")
public void the_user_should_type_the_invalid_username_and_passward() {
    WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
    fill(user, "sathish");
    WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
    fill(pass, "satz009");
}

@When("The user should click the login button")
public void the_user_should_click_the_login_button() throws InterruptedException {
    driver.findElement(By.xpath("//button[@name='login']")).click();
    Thread.sleep(3000);
}

@When("The user should get title of incorrect credential page")
public void the_user_should_get_title_of_incorrect_credential_page() {
    currentTitle();
}

@Then("The user should navigate to the incorrect credential page")
public void the_user_should_navigate_to_the_incorrect_credential_page() {
    
	String currentUrl = driver.getCurrentUrl();
	Assert.assertTrue("verify the url", currentUrl.contains("privacy"));
	System.out.println("testcase passed");
}



}
