package pages;

import com.amazonaws.event.DeliveryMode;
import com.shaft.driver.SHAFT;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class Cart extends Page{

    By continueShopping = By.id("continue-shopping");
    By checkout = By.id("checkout");
    public Cart(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    @Step("Remove Product")
    public Cart removeProduct(String nameOfProduct){
        System.out.println("//div[text()='"+nameOfProduct+"']/ancestor::div[@class='inventory_item']//button[text()='Remove']");
        driver.element().click(By.xpath("//div[text()='"+nameOfProduct+"']/ancestor::div[@class='inventory_item']//button[text()='Remove']"));

        return this;
    }
    @Step("Continue Shopping")
    public Inventory continueShopping(){
        driver.element().click(continueShopping);
        return new Inventory(driver);
    }
    @Step("Go To Checkout Page")
    public Checkout goToCheckoutPAge(){
        driver.element().click(checkout);
        return new Checkout(driver);
    }

}
