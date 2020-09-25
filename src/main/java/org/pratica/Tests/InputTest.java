package org.pratica.Tests;

import org.pratica.Bases.TestBase;
import org.pratica.Screens.HomeScreen;
import org.pratica.Screens.InputControlsScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class InputTest extends TestBase {

    HomeScreen homeScreen;
    InputControlsScreen inputControlsScreen;

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
        driver.quit();
    }
}
