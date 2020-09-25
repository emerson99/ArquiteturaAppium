package org.pratica.Tests;

import org.pratica.Bases.TestBase;
import org.pratica.Screens.CrashBugScreen;
import org.pratica.Screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class CrashTest extends TestBase {

    CrashBugScreen crashBugScreen;
    HomeScreen homeScreen;

    @Test
    public void CrashBug()throws IOException,InterruptedException {
        homeScreen = new HomeScreen();
        crashBugScreen = new CrashBugScreen();

        String textoCrash = "Pressing this button will crash the app";

        homeScreen.ClicarManu();
        crashBugScreen.ClicarManuCrash();

        Assert.assertEquals(textoCrash,crashBugScreen.retornaTextoNav());

        crashBugScreen.ClicarBotaoCrash();
        driver.quit();
    }
}
