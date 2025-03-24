package tastPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AdminPage {
    //Переход на вкладку Admin
    public SelenideElement adminTab = $(By.xpath("//span[text()='Admin']"));

    //Нажимаем на кнопку "Add" для добавления нового пользователя
    public SelenideElement addUserButton = $(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']"));

    //Заполняем поля формы
    //Роль пользователя
   public SelenideElement roleField = $(By.xpath("//i[@class='oxd-icon bi-caret-down-fill " +
            "oxd-select-text--arrow']"));

    //Статус пользователя
    public SelenideElement statusField = $(By.xpath("//i[@class='oxd-icon bi-caret-down-fill " +
            "oxd-select-text--arrow']"));

    //Имя сотрудника
    public SelenideElement firstNameField = $(By.xpath("//div[@class='oxd-autocomplete-text-input " +
            "oxd-autocomplete-text-input--active']"));

    //Имя пользователя
    public SelenideElement usernameField = $(By.xpath("//input[@class='oxd-input " +
            "oxd-input--active oxd-input--error']"));

    //Пароль пользователя
    public SelenideElement passwordField = $(By.xpath("//input[@type='password']"));

    //Подтверждение пароля
    public SelenideElement confirmPasswordField = $(By.xpath("//input[@type='confirmpassword']"));

    //Клик по кнопке "Save"
    public SelenideElement saveButton = $(By.xpath("//button[@type='submit']"));

}