package pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CheckoutOverView extends Page{
    By finishButton = By.id("finish");

    public CheckoutOverView(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    @Step("Complete the Process")
    public CheckoutComplete complete(){
        driver.element().click(finishButton);

        return new CheckoutComplete(driver);
    }

}
