package pages;

import com.shaft.driver.SHAFT;

public class Page {
    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON testData = new SHAFT.TestData.JSON("simpleJSON.json");
    public Page(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }





}
