package com.tostanco.stepDefs;

import org.junit.Test;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.Test;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.tostanco.RunCukesTest;
import com.tostanco.pages.GooglePage;

import io.cucumber.java.en.Given;
import io.qameta.allure.*;


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

    
    // @DisplayName("Display name - trying to load first page")
    // @Description("Description - trying to load first page")
    // @Test    ///sprawdzić
    @Given("Page is loaded")
    @Epic("Tools QA")
    @Feature("Forms")
    @Story("Practice Form")
    @Description("Sprawdzenie poprawności placeholdera, po wypełnieniu i wyczyszczeniu pola")
    @TmsLink("JIRA-125") //link z Test Casem do Jiry
    public void googleBasicTest() throws InterruptedException {
        googlePage = new GooglePage(driver);

        googlePage.testBrowser();
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
