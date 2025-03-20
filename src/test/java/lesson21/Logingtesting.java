package lesson21;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

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

    //Переход на вкладку Admin
    @Test(dependsOnMethods = {"loginValidCreads"})
    public void searchAdmin() {
        SelenideElement adminTab = $(By.className("//span[text()='Admin']"));
        adminTab.click();
    }

    //Клик по кнопке
    @Test(dependsOnMethods = {"loginValidCreads"})
    public void clickButton() {
        SelenideElement reloadPage = $(By.cssSelector("//button[@type='button']"));
        reloadPage.click();
    }



//    @Test
//    public void loginWithLongCread() {
//        loginPage.usernameField.setValue("AdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdmin");
//        //usernameField.sendKeys("Admin");
//        loginPage.passwordField.setValue("admin123");
//        loginPage.loginButton.click();
//    }
//
//    @Test
//    public void loginWithLongCreads() {
//        loginPage.usernameField.setValue("AdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdmin");
//        //usernameField.sendKeys("Admin");
//        loginPage.passwordField.setValue("admin123admin123admin123admin123admin123admin123admin123admin123admin123");
//        loginPage.loginButton.click();
//    }
}