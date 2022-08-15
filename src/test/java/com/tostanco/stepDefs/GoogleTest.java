package com.tostanco.stepDefs;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;

import com.tostanco.pages.GooglePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class GoogleTest {

    WebDriver driver = null;
    GooglePage googlePage;
    // @BeforeAll
    // static void setupAll() {
    // WebDriverManager.chromedriver().setup();
    // }

    // @BeforeEach
    // void setup() {
    // driver = new ChromeDriver();
    // }

    // @AfterEach
    // void teardown() {
    // driver.quit();
    // }

    // @DisplayName //<<<< removed!!!!!!
    // @Test // import z JUnit; powoduje ponowne odpalenie testów
    @Given("Page is loaded")
    @Epic("Testing first page")
    @Feature("Deny")
    @Story("Deny Form")
    @Description("Sprawdzenie ładowania strony")
    // @TmsLink("JIRA-125") //przykładowy link z Test Casem do Jiry
    @Step("Ładowanie")
    public void googleBasicTest() throws InterruptedException {
        googlePage = new GooglePage(driver);
        googlePage.testBrowser();
        System.out.println("Page is loaded!!!");
    }

    @When("I click button")
    public void I_click_button() {
        
        System.out.println("Button clicked!!!!!");
    }

    @Then("notification will disappear")
    public void notification_will_disappear() {
        // logger.atInfo();
        System.out.println("Whole page is visible");
    }    
}
