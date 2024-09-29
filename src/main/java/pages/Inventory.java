package pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class Inventory extends Page{
    By shoppingCartContainer= By.id("shopping_cart_container");
    SHAFT.GUI.WebDriver driver;
    public Inventory(SHAFT.GUI.WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    @Step("Add The Products")
    public Inventory addProduct(String nameOfProduct){
        driver.element().click(By.xpath("//div[text()='"+nameOfProduct+"']/ancestor::div[@class='inventory_item']//button[text()='Add to cart']"));
        return this;
    }
    @Step("Go to Cart Page")
    public Cart goToCartPage() {
        driver.element().click(shoppingCartContainer);
        return new Cart(driver);
    }
}
