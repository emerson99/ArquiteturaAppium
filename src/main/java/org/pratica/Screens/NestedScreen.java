package org.pratica.Screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.pratica.Bases.PageBase;

public class NestedScreen extends PageBase {

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Row Category Image\"])[5]")
    private MobileElement menuNested;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/nested_textview")
    private MobileElement textoNav;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/nested_up_button")
    private MobileElement botaoUp;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/up_navigation_content_text")
    private MobileElement textoPress;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/nested_up_button")
    private MobileElement botaoNext;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/up_navigation_content_text")
    private MobileElement textoFinal;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private MobileElement botaoVolt;



    public void ClicarManuNested(){
        click(menuNested);
    }
    public String retornaTextoNav(){
        return getText(textoNav);
    }
    public void ClicarButtonUp(){
        click(botaoUp);
    }
    public String retornaTextoPress(){
        return getText(textoPress);
    }
    public void ClicarButtonNext(){
        click(botaoNext);
    }
    public String retornaTextoFinal(){
        return getText(textoFinal);
    }



}
