package org.pratica.Screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.pratica.Bases.PageBase;
import org.pratica.Bases.TestBase;

public class InputControlsScreen extends PageBase {

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[4]")
    private MobileElement botaoImput;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_edit_text")
    private MobileElement campoTextFild;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_edit_text")
    private MobileElement TextFild;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.TextView[2]")
    private MobileElement botaoCheckBox;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_checkbox")
    private MobileElement caixaCheckBox;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_checkbox_status")
    private MobileElement textoCheckBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.TextView[3]")
    private MobileElement botaoRadioButton;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/radio_button_2")
    private MobileElement caixaRadioButton;


    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/radio_button_2")
    private MobileElement textoRadioButton;



    public void clicarMenuInput(){
        click(botaoImput);
    }

    public void DigitaCampoTexttfild(String campo){
        sendKeys(campoTextFild,campo);
    }

    public String retornaTextoDig(){
        return getText(TextFild);
    }

    public void clicarMenuCheckBox(){
        click(botaoCheckBox);
    }

    public void clicarCaixaCheck(){
        click(caixaCheckBox);
    }

    public String retornaTextoCheck(){
        return getText(textoCheckBox);
    }

    public void clicarMenuRadioButton(){
        click(botaoRadioButton);
    }

    public void clicarCaixaRadioButton(){
        click(caixaRadioButton);
    }

    public String retornaTextoRadio(){
        return getText(textoRadioButton);
    }

}
