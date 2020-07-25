package steps;


import io.qameta.allure.Step;
import page.LoginPage;


public class LoginStep {


    @Step
    public void login(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.setEmail(username);
        loginPage.setPassword(password);
        loginPage.loginButtonClick();
    }

    @Step
    public String getError() {
        LoginPage loginPage = new LoginPage();
        return loginPage.getError();
    }

}
