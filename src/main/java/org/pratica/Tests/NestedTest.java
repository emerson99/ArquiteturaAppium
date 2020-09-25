package org.pratica.Tests;

import org.pratica.Bases.TestBase;
import org.pratica.Screens.HomeScreen;
import org.pratica.Screens.NestedScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class NestedTest extends TestBase {

    HomeScreen homeScreen;
    NestedScreen nestedScreen;

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
        driver.quit();
    }
}
