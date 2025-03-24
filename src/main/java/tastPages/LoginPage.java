package tastPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement usernameField = $(By.xpath("//input[@name='username']"));
    public SelenideElement passwordField = $(By.xpath("//input[@name='password']"));
    public SelenideElement loginButton = $(By.xpath("//button[@type='submit']"));
}
