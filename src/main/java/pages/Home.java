package pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Home extends Page{
    By userName = By.id("user-name");
    By password = By.id("password");
    By logInButton = By.id("login-button");
    String url = "https://www.saucedemo.com/";
    public Home(SHAFT.GUI.WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    @Step("When I navigate to the Home page.")
    public Home navigate(){
        driver.browser().navigateToURL(url);
        return this;
    }
    @Step("Login Successfull ")
    public Inventory logIn(){
        userName();
        password();
        driver.element().click(logInButton);
        return new Inventory(driver);
    }
    private void userName(){
        driver.element().type(userName,testData.getTestData("userName"));
    }
    private void password(){
        driver.element().type(password,testData.getTestData("password"));
    }

}
