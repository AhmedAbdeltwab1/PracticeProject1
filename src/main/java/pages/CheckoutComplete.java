package pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckoutComplete extends Page{

    By completeText = By.xpath("//div[@class='complete-text']");
    public CheckoutComplete(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    @Step("Check the cycle is complete")
    public void checkCompleteCycle(){
        String expectedText = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
        String actualText = driver.element().getText(completeText);
        Assert.assertEquals(actualText,expectedText);
    }


}
