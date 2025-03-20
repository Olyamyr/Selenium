package lesson21;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Logingtesting extends BaseTest {

    SelenideElement usernameField=$(By.xpath("//input[@name='username']"));
    SelenideElement passwordField=$(By.xpath("//input[@name='password']"));
    SelenideElement loginButton=$(By.xpath("//button[@type='submit']"));

    @Test
    public void loginValidCreads(){
        usernameField.setValue("Admin");
        //usernameField.sendKeys("Admin");
        passwordField.setValue("admin123");
        loginButton.click();

    }

    @Test
    public void loginWithLongCread(){
        usernameField.setValue("AdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdmin");
        //usernameField.sendKeys("Admin");
        passwordField.setValue("admin123");
        loginButton.click();

    }

    @Test
    public void loginWithLongCreads(){
        usernameField.setValue("AdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdminAdmin");
        //usernameField.sendKeys("Admin");
        passwordField.setValue("admin123admin123admin123admin123admin123admin123admin123admin123admin123");
        loginButton.click();

    }
}