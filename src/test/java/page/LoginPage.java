package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private By ERRORSELECTOR = By.cssSelector(".loginpage-message-image.loginpage-message");
    private By EMAILSELECTOR = By.id("name");
    private By PASSWORDSELECTOR = By.id("password");
    private By LOGINBUTTONSELECTOR = By.id("button_primary");

    public String getError() {
       String message = $(ERRORSELECTOR).getText();
        return message;
    }

    public void setEmail(String email) {
        $(EMAILSELECTOR).setValue(email);
    }

    public void setPassword(String password) {
        $(PASSWORDSELECTOR).setValue(password);
    }

    public void loginButtonClick() {
        $(LOGINBUTTONSELECTOR).click();
    }
}
