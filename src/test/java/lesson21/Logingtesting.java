package lesson21;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tastPages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Logingtesting extends BaseTest {
    LoginPage loginPage = new LoginPage();

    //Авторизация
    @Test
    public void loginValidCreads() {
        loginPage.usernameField.setValue("Admin");
        //usernameField.sendKeys("Admin");
        loginPage.passwordField.setValue("admin123");
        loginPage.loginButton.click();
    }
}