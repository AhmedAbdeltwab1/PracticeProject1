package TestPackage;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Home;

public class TestClass extends AbstractTestCases{

    @Test
    public void doAllTheCycle1(){
    new Home(driver.get())
            .navigate()
            .logIn()
            .addProduct("Sauce Labs Backpack")
            .addProduct("Sauce Labs Bike Light")
            .addProduct("Sauce Labs Bolt T-Shirt")
            .addProduct("Sauce Labs Fleece Jacket")
            .goToCartPage()
            .removeProduct("Sauce Labs Bike Light")
            .continueShopping()
            .addProduct("Test.allTheThings() T-Shirt (Red)")
            .goToCartPage()
            .goToCheckoutPAge()
            .addTheCustomerDetails("Ahmed","Abdeltwab","12566")
            .goToCheckoutOverviewPAge()
            .complete()
            .checkCompleteCycle();

    }
    @Test
    public void doAllTheCycle2(){
        new Home(driver.get())
                .navigate()
                .logIn()
                .addProduct("Sauce Labs Backpack")
                .addProduct("Sauce Labs Bike Light")
                .addProduct("Sauce Labs Bolt T-Shirt")
                .addProduct("Sauce Labs Fleece Jacket")
                .goToCartPage()
                .removeProduct("Sauce Labs Bike Light")
                .continueShopping()
                .addProduct("Test.allTheThings() T-Shirt (Red)")
                .goToCartPage()
                .goToCheckoutPAge()
                .addTheCustomerDetails("Ahmed","Abdeltwab","12566")
                .goToCheckoutOverviewPAge()
                .complete()
                .checkCompleteCycle();

    }
    @Test
    public void doAllTheCycle3(){
        new Home(driver.get())
                .navigate()
                .logIn()
                .addProduct("Sauce Labs Backpack")
                .addProduct("Sauce Labs Bike Light")
                .addProduct("Sauce Labs Bolt T-Shirt")
                .addProduct("Sauce Labs Fleece Jacket")
                .goToCartPage()
                .removeProduct("Sauce Labs Bike Light")
                .continueShopping()
                .addProduct("Test.allTheThings() T-Shirt (Red)")
                .goToCartPage()
                .goToCheckoutPAge()
                .addTheCustomerDetails("Ahmed","Abdeltwab","12566")
                .goToCheckoutOverviewPAge()
                .complete()
                .checkCompleteCycle();

    }
    @Test
    public void doAllTheCycle4(){
        new Home(driver.get())
                .navigate()
                .logIn()
                .addProduct("Sauce Labs Backpack")
                .addProduct("Sauce Labs Bike Light")
                .addProduct("Sauce Labs Bolt T-Shirt")
                .addProduct("Sauce Labs Fleece Jacket")
                .goToCartPage()
                .removeProduct("Sauce Labs Bike Light")
                .continueShopping()
                .addProduct("Test.allTheThings() T-Shirt (Red)")
                .goToCartPage()
                .goToCheckoutPAge()
                .addTheCustomerDetails("Ahmed","Abdeltwab","12566")
                .goToCheckoutOverviewPAge()
                .complete()
                .checkCompleteCycle();

    }
    @Test
    public void doAllTheCycle5(){
        new Home(driver.get())
                .navigate()
                .logIn()
                .addProduct("Sauce Labs Backpack")
                .addProduct("Sauce Labs Bike Light")
                .addProduct("Sauce Labs Bolt T-Shirt")
                .addProduct("Sauce Labs Fleece Jacket")
                .goToCartPage()
                .removeProduct("Sauce Labs Bike Light")
                .continueShopping()
                .addProduct("Test.allTheThings() T-Shirt (Red)")
                .goToCartPage()
                .goToCheckoutPAge()
                .addTheCustomerDetails("Ahmed","Abdeltwab","12566")
                .goToCheckoutOverviewPAge()
                .complete()
                .checkCompleteCycle();

    }

}

