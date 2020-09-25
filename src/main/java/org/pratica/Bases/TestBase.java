package org.pratica.Bases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.pratica.Relatorio;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class TestBase {

    public static AppiumDriver<MobileElement> driver;

    @BeforeSuite
    public void oneTimeBefore() {
        Relatorio.iniciaRelatorio();
    }


    @BeforeMethod(alwaysRun = true)
    public  void BeforeTest(Method method) throws IOException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9");
        desiredCapabilities.setCapability("deviceName", "Pixel_2_API_28");
        desiredCapabilities.setCapability("app", "C:\\Users\\Emerson\\Desktop\\apk\\appSample.apk");

        Relatorio.criaTesteRelatorio(method.getName());

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);


    }

    public static AppiumDriver<MobileElement> getDriver() {

        return driver;
    }
    @AfterMethod(alwaysRun = true)
    public void afterTest(ITestResult result){
        Relatorio.adicionaResultadoTeste(result);
        driver.quit();
    }
    @AfterSuite
    public void afterSuite(){
        Relatorio.geraRelatorio();
    }




}
