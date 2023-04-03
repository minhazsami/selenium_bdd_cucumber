package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Login {
    private WebDriver driver;
    @Before("@login")
    public void setup (){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/divers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }
    @After("@login")
    public void teardown(){
        driver.quit();
    }
    @Given("I have to access the login page")
    public void i_have_to_access_the_login_page() {
        driver.get("https://www.webdriveruniversity.com/Login-Portal/index.html?");
    }
    @When("I enter a specific username {string}")
    public void i_enter_a_specific_username(String username) {
        driver.findElement(By.id("text")).sendKeys(username);
    }
    @And("I enter a correct password {}")
    public void i_enter_a_correct_password(String password) {
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
}
