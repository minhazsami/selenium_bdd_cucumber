package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Login {
    @Given("I have to access the login page")
    public void i_have_to_access_the_login_page() {
        driver.get("https://www.webdriveruniversity.com/Login-Portal/index.html?");
    }
    @When("I enter a specific username {string}")
    public void i_enter_a_specific_username(String username) {
        driver.findElement(By.id("text")).sendKeys(username);
    }

    @When("I enter a username {word}")
    public void i_enter_a_username(String username) {
        driver.findElement(By.id("text")).sendKeys(username);
    }

    @And("I enter a correct password {}")
    public void i_enter_a_correct_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("I enter a password {}")
    public void i_enter_a_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("I click on the login CTA")
    public void i_click_on_the_login_cta() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should be successful logged in message")
    public void i_should_be_successful_logged_in_message() {
        String Login_message = driver.switchTo().alert().getText();
        Assert.assertEquals(Login_message, "validation succeeded");
    }

    @Then("I should be Unsuccessful logged in message")
    public void i_should_be_unsuccessful_logged_in_message() {
        String Login_message = driver.switchTo().alert().getText();
        Assert.assertEquals(Login_message, "validation failed");
    }

    @Then("I should be following validation message {}")
    public void i_should_be_following_validation_message(String expectedMessage) {
        String Login_message = driver.switchTo().alert().getText();
        Assert.assertEquals(Login_message, expectedMessage);
    }
}
