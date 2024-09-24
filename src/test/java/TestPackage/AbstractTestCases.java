package TestPackage;

import com.shaft.driver.SHAFT;
import com.shaft.gui.browser.BrowserActions;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.Home;

public class AbstractTestCases {
    ThreadLocal<SHAFT.GUI.WebDriver> driver = new ThreadLocal<>();
    ThreadLocal<SHAFT.TestData.JSON> testData = new ThreadLocal<>();
    @BeforeClass(description = "Setup Test Data.")
    public void beforeClass(){
        testData.set(new SHAFT.TestData.JSON("simpleJSON.json"));

   }

    @BeforeMethod(description = "Setup Browser instance.")
    public void beforeMethod() {
        driver.set(new SHAFT.GUI.WebDriver());
    }

    @AfterMethod(description = "Teardown Browser instance.")
    public void afterMethod() {
        driver.get().quit();
    }
}

