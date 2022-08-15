package com.tostanco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePage {

    WebDriver driver;
    
    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private static By odrzucButton = By.xpath("//*[text()='Odrzuć wszystko']");
    
    @FindBy(xpath = "//*[text()='Odrzuć wszystko']")
    WebElement odrzucBtn;
    
    // @BeforeAll
    // void setupAll() {
    //     WebDriverManager.chromedriver().setup();
    // }

    // @BeforeEach
    // void setup() {
    //     driver = new ChromeDriver();
    // }

    // @AfterEach
    // void teardown() {
    //     driver.quit();
    // }

    public void testBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://google.com");
        Actions at = new Actions(driver);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();

        driver.findElement(odrzucButton).click();
        // odrzucBtn.click();
        // driver.manage().timeouts().getPageLoadTimeout(5);
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();

        driver.quit();
    }
}
