package tests;


import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.LoginStep;


import static com.codeborne.selenide.Selenide.*;

public class TestRailTests {

    @Test
    public void loginSuccessful(){
        Configuration.baseUrl="https://aqa5master.testrail.io/";
        Configuration.startMaximized=true;
        open("/");
        LoginStep loginStep =new LoginStep();
        loginStep.login("atrostyanko+master@gmail.com","QqtRK9elseEfAk6ilYcJ");
    }

    @Test
    public void loginMissingPassword(){
        Configuration.baseUrl="https://aqa5master.testrail.io/";
        Configuration.startMaximized=true;
        open("/");
        LoginStep loginStep =new LoginStep();
        loginStep.login("atrostyanko+master@gmail.com","");
        Assert.assertEquals(loginStep.getError(), "Password is required.");
    }

    @Test
    public void loginMissingEmail(){
        Configuration.baseUrl="https://aqa5master.testrail.io/";
        Configuration.startMaximized=true;
        open("/");
        LoginStep loginStep =new LoginStep();
        loginStep.login("","QqtRK9elseEfAk6ilYcJ");
        Assert.assertEquals(loginStep.getError(), "Email/Login is required.");
    }
}
