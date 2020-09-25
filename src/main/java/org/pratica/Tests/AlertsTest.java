package org.pratica.Tests;

import org.pratica.Bases.TestBase;
import org.pratica.Screens.HomeScreen;
import org.pratica.Screens.AlertsScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AlertsTest extends TestBase {
    HomeScreen homeScreen;
    AlertsScreen alertsScreen;

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

        driver.quit();

    }





}
