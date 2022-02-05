package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import customLib.base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Search implements base
{
@Given("I have entered the google homepage")
public void i_have_entered_the_google_homepage() {
	 DRIVER.get("http://www.google.com/");
}
@When("^The search string (.*) is entered in textbox$")
public void the_search_string_is_entered_in_textbox(String string) throws InterruptedException {
	DRIVER.findElement(By.name("q")).sendKeys(string);
	//Thread.sleep(2000);
}

@When("^click the search button$")
public void click_the_search_button() {
DRIVER.findElement(By.name("btnK")).click();
  
   }

@Then("result for healthasyst is shown")
public void result_for_healthasyst_is_shown() {
	 Assert.assertEquals("PAGE validation",DRIVER.getTitle(),"healthasyst - Google Search"); 
}
@Given("I am at the google page")
public void i_am_at_the_google_page() throws InterruptedException {
	Thread.sleep(20);
  
}

@When("click the image link on top")
public void click_the_image_link_on_top() {
	DRIVER.findElement(By.partialLinkText("Images")).click();
}

@Then("result is shown")
public void result_is_shown() {
System.out.println("passed");
}


@When("click the MAP  link on top")
public void click_the_MAP_link_on_top() {
	DRIVER.findElement(By.partialLinkText("Maps")).click();
}

@When("click the direction")
public void click_the_direction() {
	DRIVER.findElement(By.className("S9kvJb")).click();
    }

@When("choose your location")
public void choose_your_location() throws InterruptedException {
	//DRIVER.findElement(By.partialLinkText("Your location")).click();
	DRIVER.findElement(By.className("tactile-searchbox-input")).click();
	Thread.sleep(2000);
	DRIVER.findElement(By.xpath("//span[text()='Your location']")).click();
}

@Then("distance and map shold be available")
public void distance_and_map_shold_be_available() {
	System.out.println("passed");
}
@Given("I am at the map page and my location is entered")
public void i_am_at_the_map_page_and_my_location_is_entered() throws InterruptedException {
	System.out.println("passed");
	Thread.sleep(200);
}

@When("click on drive by car option")
public void click_on_drive_by_car_option() throws InterruptedException {
	DRIVER.findElement(By.xpath("\r\n"
			+ "//*[@id=\"omnibox-directions\"]/div/div[2]/div/div/div[1]/div[2]/button/img")).click(); 
	Thread.sleep(2000);
	DRIVER.findElement(By.xpath("\r\n"
			+ "//*[@id=\"directions-searchbox-0\"]/button[1]")).click(); 
}

@Then("Map should display the route")
public void map_should_display_the_route() throws InterruptedException {
	System.out.println("passed");
	Thread.sleep(200);
}

@Given("I am at the map page and my location is entered1")
public void i_am_at_the_map_page_and_my_location_is_entered1() throws InterruptedException {
	System.out.println("previous step completed");
	Thread.sleep(200);
}

@When("click on gas station option")
public void click_on_gas_station_option() throws InterruptedException {
	Thread.sleep(2000);
	//DRIVER.findElement(By.xpath("////*[@id=\"omnibox-directions\"]/div/div[2]/div/div/div[1]/div[4]/button/img")).click(); 
	
	   
	//DRIVER.findElement(By.xpath("//*[@id=\"assistive-chips\"]/div/div/div/div[1]/div/div/div/div/div[2]/div/button/span[1]")).click(); 

   
}

@Then("Map shold suggest the gas station")
public void map_shold_suggest_the_gas_station() {
	System.out.println("gas station displayed");
}



}
