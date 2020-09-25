package org.pratica.Tests;

import org.pratica.Bases.TestBase;
import org.pratica.Screens.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AppSampleTests extends TestBase {

    HomeScreen homeScreen;
    InputControlsScreen inputControlsScreen;
    NestedScreen nestedScreen;
    CrashBugScreen crashBugScreen;
    AlertsScreen alertsScreen;
    LoginPageScreen loginPageScreen;

    @Test
    public void InputControls()throws IOException,InterruptedException {
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();

        String textfild = "treinamento";
        String textcheck = "Checked";
        String textradio = "Web";

        homeScreen.ClicarManu();
        inputControlsScreen.clicarMenuInput();
        inputControlsScreen.DigitaCampoTexttfild(textfild);
        Assert.assertEquals(textfild,inputControlsScreen.retornaTextoDig());
        inputControlsScreen.clicarMenuCheckBox();
        inputControlsScreen.clicarCaixaCheck();
        Assert.assertEquals(textcheck,inputControlsScreen.retornaTextoCheck());
        inputControlsScreen.clicarMenuRadioButton();
        inputControlsScreen.clicarCaixaRadioButton();
        Assert.assertEquals(textradio,inputControlsScreen.retornaTextoRadio());

    }

    @Test
    public void NestedViews()throws IOException,InterruptedException {
        homeScreen = new HomeScreen();
        nestedScreen = new NestedScreen();

        String textoNav = "Navigation";
        String textoPress = "Press to go to the next level";
        String textoFinal = "Final Level";

        homeScreen.ClicarManu();
        nestedScreen.ClicarManuNested();
        Assert.assertEquals(textoNav,nestedScreen.retornaTextoNav());
        nestedScreen.ClicarButtonUp();
        Assert.assertEquals(textoPress,nestedScreen.retornaTextoPress());
        nestedScreen.ClicarButtonNext();
        Assert.assertEquals(textoFinal,nestedScreen.retornaTextoFinal());

    }

    @Test
    public void CrashBug()throws IOException,InterruptedException {
        homeScreen = new HomeScreen();
        crashBugScreen = new CrashBugScreen();

        String textoCrash = "Pressing this button will crash the app";

        homeScreen.ClicarManu();
        crashBugScreen.ClicarManuCrash();

        Assert.assertEquals(textoCrash,crashBugScreen.retornaTextoNav());

        crashBugScreen.ClicarBotaoCrash();

    }

    @Test
    public void AlertsTest()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        alertsScreen = new AlertsScreen();

        String alert = "This is the alert message";

        homeScreen.ClicarManu();
        alertsScreen.ClicarManuAlert();
        alertsScreen.ClicarAlert();
        Thread.sleep(5000);
        Assert.assertEquals(alert,(alertsScreen.retornaTextoAlert()));
        alertsScreen.ClicarOK();
    }

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

    }
}
