package lesson21;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tastPages.AdminPage;

import static com.codeborne.selenide.Selenide.$;

public class AdminTest extends BaseTest {

    AdminPage adminPage = new AdminPage();

    //Переход на вкладку Admin
    @Test(priority = 1)
    public void searchAdmin() {
        adminPage.adminTab.click();
    }

    //Создание пользователя
    @Test(priority = 2)
    public void creatingAUser() {
        //Нажимаем на кнопку "Add" для добавления нового пользователя
        adminPage.addUserButton.click();

        //Заполняем поля формы
        //Роль пользователя
        adminPage.roleField.selectOptionByValue("ESS");

        //Статус пользователя
        adminPage.statusField.selectOptionByValue("Enabled");

        //Имя сотрудника
        adminPage.firstNameField.setValue("Test");

        //Имя пользователя
        adminPage.usernameField.setValue("TestUser");

        //Пароль пользователя
        adminPage.passwordField.setValue("12345");

        //Подтверждение пароля
        adminPage.confirmPasswordField.setValue("12345");

        //Клик по кнопке "Save"
        adminPage.saveButton.click();
    }
}