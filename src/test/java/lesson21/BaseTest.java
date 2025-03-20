package lesson21;

import org.testng.annotations.BeforeTest;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeTest
    public void setup() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}
