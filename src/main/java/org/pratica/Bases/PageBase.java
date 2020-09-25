package org.pratica.Bases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

public class PageBase {

    public AppiumDriver driver = null;
    public WebDriverWait wait = null;


    public PageBase(){
        driver = TestBase.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait = new WebDriverWait (driver, 60);

    }

    protected void waitForElement(MobileElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    protected void waitForBy(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void click(MobileElement element){
        waitForElement(element);
        element.click();
    }







    protected void click2(MobileElement element){
        waitForElement(element);
        TouchActions action = new TouchActions(driver);
        action.doubleTap(element);
        action.perform();
    }

    protected void sendKeys(MobileElement element, String text){
        waitForElement(element);
        element.sendKeys(text);
    }
    protected String getText(MobileElement element){
        waitForElement(element);
        String text = element.getText();
        return text;
    }


}
