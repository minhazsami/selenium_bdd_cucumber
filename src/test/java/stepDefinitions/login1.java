package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObject.Base_PO;

public class login1 extends Base_PO {

    private WebDriver driver = getDriver();

    @Given("I have to access the Deshboard page")
    public void i_have_to_access_the_deshboard_page() {
        navigateTo_URL("http://159.89.38.11/login");
    }
    @When("I enter a valid username {string}")
    public void i_enter_a_valid_username(String email) {
        sendKeys(By.xpath("//input[@id='email-1']"), email);
    }
    @And("I enter a valid password {}")
    public void i_enter_a_valid_password_8kh8n_te_jdk(String password) {
        sendKeys(By.xpath("//input[@id='password-1']"), password);
    }
    @And("I click on the lOGIN CTA")
    public void i_click_on_the_l_ogin_cta() {
        driver.findElement(By.xpath("//button[@id='m_login_signin_submit']")).click();
    }

    @And("I have to click on contact manager option")
    public void i_have_to_click_on_contact_manager_option() {
        WebElement e = driver.findElement(By.cssSelector("a[title='Contact Manage']"));
        Actions act = new Actions(driver);
        act.moveToElement(e).perform();
        e.click();
    }
    @And("After that I have to click Add Member CTA")
    public void after_that_i_have_to_click_add_member_cta() {
        driver.findElement(By.xpath("(//a[normalize-space()='Add Contact'])[1]")).click();
    }
    @Then("I successfully login into the page")
    public void i_successfully_login_into_the_page() {

    }
}
