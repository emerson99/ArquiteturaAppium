package org.pratica.Tests;

import org.pratica.Bases.TestBase;
import org.pratica.Screens.HomeScreen;
import org.pratica.Screens.LoginPageScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends TestBase {

    LoginPageScreen loginPageScreen;
    HomeScreen homeScreen;

    @Test
    public void LoginPage()throws IOException,InterruptedException {
        homeScreen = new HomeScreen();
        loginPageScreen = new LoginPageScreen();

        String usuario = "emerson";
        String senha = "123456";
        String msg = "You gave me the wrong username and password";

        homeScreen.ClicarManu();

        loginPageScreen.ClicarManuLogin();
        loginPageScreen.DigitaCampoUser(usuario);
        loginPageScreen.DigitaCampoPass(senha);
        loginPageScreen.ClicarEmLogin();
        Assert.assertEquals(msg,loginPageScreen.retornaTextoDigUserPass());
        loginPageScreen.ClicarButtonTry();
        driver.quit();
    }
}
