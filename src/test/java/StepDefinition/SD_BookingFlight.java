package StepDefinition;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.AppPage.BookFlight;
import com.AppPage.LoginAction;
import com.AppPage.Registration;
import com.AppPage.SearchFlight;
import com.util.Libdriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_BookingFlight extends Libdriver {
	

	@Given("User do the registration using {string},{string},{string},{string},{string},{string}")
	public void user_do_the_registration_using(String email_id, String pwd, String pwd2, String name, String address, String city) {
		getDriver();
		Registration reg=new Registration();
	    String userRegistration=reg.userRegistration(email_id, pwd, pwd2, name, address, city);
	    org.testng.Assert.assertEquals("Pass", userRegistration);
	
	}

	@And("User login with registration credentials using {string}, {string}")
	public void user_login_with_registration_credentials_using(String email_id, String pwd) {
		LoginAction login=new LoginAction();
	    String userLogin=login.userLogin(email_id, pwd);
	    org.testng.Assert.assertEquals("Pass", userLogin);
	}

	@When("User search the flight")
	public void user_search_the_flight() {
		SearchFlight searchflight=new SearchFlight();
	    String SearchingFlight= searchflight.SearchingFlight();
	    org.testng.Assert.assertEquals("Pass", SearchingFlight);
	}

	@Then("User Book the flight")
	public void user_book_the_flight() {
		BookFlight booking=new BookFlight();
	    String bookingFlight=booking.bookingFlight();
	    org.testng.Assert.assertEquals("Pass", bookingFlight);
	}
}
