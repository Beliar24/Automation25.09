package mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static mobile.config.driver.DriverInit.getDriver;
import static mobile.config.driver.DriverInit.quit;

public class BaseTest {

    protected static AppiumDriver driver;

    @BeforeClass
    public void setUp() {
        driver = getDriver();
    }

    @AfterClass
    public void close() {
        quit();
    }
}
