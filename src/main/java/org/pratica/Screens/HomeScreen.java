package org.pratica.Screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.pratica.Bases.PageBase;
import org.pratica.Bases.TestBase;

public class HomeScreen extends PageBase{

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"ReferenceApp\"]")
    private MobileElement menuButton;

    public void ClicarManu(){
        click(menuButton);
    }

}
