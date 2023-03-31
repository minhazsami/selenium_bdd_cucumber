package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
    @Given("I have to access the login page")
    public void i_have_to_access_the_login_page() {
        System.out.println("Test 1");
    }
    @When("I enter a specific username {string}")
    public void i_enter_a_specific_username(String username) {
        System.out.println(username);
    }
    @And("I enter a correct password {string}")
    public void i_enter_a_correct_password(String password) {
        System.out.println(password);
    }
    @And("I click on the login CTA")
    public void i_click_on_the_login_cta() {
        System.out.println("Test 4");
    }
    @Then("I should be successful logged in message")
    public void i_should_be_successful_logged_in_message() {
        System.out.println("Test 5");
    }
}
