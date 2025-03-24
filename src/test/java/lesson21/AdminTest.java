package lesson21;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class AdminTest extends BaseTest {
    //Переход на вкладку Admin
    @Test(priority = 1)
    public void searchAdmin() {
        $(By.xpath("//span[text()='Admin']")).click();
    }

    //Создание пользователя
    @Test(priority = 2)
    public void creatingAUser() {
        //Нажимаем на кнопку "Add" для добавления нового пользователя
        SelenideElement addUserButton = $(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']"));
        addUserButton.click();

        //Заполняем поля формы
        //Роль пользователя
        SelenideElement roleField = $(By.xpath("//i[@class='oxd-icon bi-caret-down-fill " +
                "oxd-select-text--arrow']"));
        roleField.selectOptionByValue("ESS");

        //Статус пользователя
        SelenideElement statusField = $(By.xpath("//i[@class='oxd-icon bi-caret-down-fill " +
                "oxd-select-text--arrow']"));
        statusField.selectOptionByValue("Enabled");

        //Имя сотрудника
        SelenideElement firstNameField = $(By.xpath("//div[@class='oxd-autocomplete-text-input " +
                "oxd-autocomplete-text-input--active']"));
        firstNameField.setValue("Test");

        //Имя пользователя
        SelenideElement usernameField = $(By.xpath("//input[@class='oxd-input " +
                "oxd-input--active oxd-input--error']"));
        usernameField.setValue("TestUser");

        //Пароль пользователя
        SelenideElement passwordField = $(By.xpath("//input[@type='password']"));
        passwordField.setValue("12345");

        //Подтверждение пароля
        SelenideElement confirmPasswordField = $(By.xpath("//input[@type='confirmpassword']"));
        confirmPasswordField.setValue("12345");

        //Клик по кнопке "Save"
        SelenideElement saveButton = $(By.xpath("//button[@type='submit']"));
        saveButton.click();
    }
}