package org.pratica.Screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.pratica.Bases.PageBase;

public class AlertsScreen extends PageBase {


    @AndroidFindBy( xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[7]")
    private MobileElement botaoMenuAlert;


    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/notifications_alert_button")
    private MobileElement botaoAlert;



    @AndroidFindBy(id = "android:id/message")
    private MobileElement msgAlert;



    @AndroidFindBy(id = "android:id/button1")
    private MobileElement botaoOk;




    public void ClicarManuAlert(){
        click(botaoMenuAlert);
    }


    public void ClicarAlert(){
        click(botaoAlert);
    }


    public String retornaTextoAlert(){

        return getText(msgAlert);
    }

    public void ClicarOK(){
        click(botaoOk);
    }







}
