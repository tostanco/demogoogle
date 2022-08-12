package com.tostanco.stepDefs;

import org.junit.Test;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.Test;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tostanco.pages.GooglePage;

import io.cucumber.java.en.*;
import io.netty.util.internal.logging.Log4JLoggerFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class GoogleTest {

    WebDriver driver = null;
    GooglePage googlePage;
    // Class<Log4JLoggerFactory> loggerFactory = Log4JLoggerFactory.class;
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
    // @Epic("Tools QA")
    // @Feature("Forms")
    // @Story("Practice Form")
    @Description("Sprawdzenie ładowania strony")
    // @TmsLink("JIRA-125") //przykładowy link z Test Casem do Jiry
    @Step("Ładowanie")
    public void googleBasicTest() throws InterruptedException {
        googlePage = new GooglePage(driver);

        googlePage.testBrowser();
    }

    @When("I click button")
    public void I_click_button() {
        
        System.out.println("Button clicked");
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("notification will disappear")
    public void notification_will_disappear() {
        // logger.atInfo();
        System.out.println("Whole page is visible");
        // Write code here that turns the phrase above into concrete actions
    }

   

    // @Given("Page is loaded")
    // public void Page_is_loaded() {
    // // Write code here that turns the phrase above into concrete actions
    // }

    // @Test
    // void testBrowser() throws InterruptedException {
    // driver.get("https://google.com");
    // Actions at = new Actions(driver);
    // at.sendKeys(Keys.PAGE_DOWN).build().perform();

    // driver.findElement(By.xpath("//*[text()='Odrzuć wszystko']")).click();
    // // driver.manage().timeouts().getPageLoadTimeout(5);
    // // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    // try {
    // Thread.sleep(2000);
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }

    // driver.close();
    // }

}
