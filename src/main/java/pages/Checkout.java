package pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class Checkout extends Page{
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueButton = By.id("continue");
    public Checkout(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    @Step("Checkout")
    public Checkout addTheCustomerDetails(String firstName, String lastName, String zipCode){
        addFirtName(firstName);
        addLastName(lastName);
        addPostalCode(zipCode);
        return this;
    }
    public CheckoutOverView goToCheckoutOverviewPAge(){
        driver.element().click(continueButton);
        return new CheckoutOverView(driver);
    }



    private void addFirtName(String addFirstName){
        driver.element().type(firstName,addFirstName);
    }
    private void addLastName(String addLastName){
        driver.element().type(lastName,addLastName);
    }
    private void addPostalCode(String addPostalCode){
        driver.element().type(postalCode,addPostalCode);
    }

}
