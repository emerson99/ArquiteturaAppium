package org.pratica.Screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.pratica.Bases.PageBase;

public class CrashBugScreen extends PageBase {

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Row Category Image\"])[6]")
    private MobileElement menuCrash;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/bug_fragment_message")
    private MobileElement textoCrash;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/crash_button")
    private MobileElement botaoCrash;


    public void ClicarManuCrash(){
        click(menuCrash);
    }

    public String retornaTextoNav(){
        return getText(textoCrash);
    }
    public void ClicarBotaoCrash(){
        click(botaoCrash);
    }


}
