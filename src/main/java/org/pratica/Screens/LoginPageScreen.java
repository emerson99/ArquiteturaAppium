package org.pratica.Screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.pratica.Bases.PageBase;

public class LoginPageScreen extends PageBase {



    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Row Category Image\"])[8]")
    private MobileElement menuLogin;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/username_text_input")
    private MobileElement campoUser;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/password_text_input")
    private MobileElement campoPass;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/login_button")
    private MobileElement botaoLogin;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/login_alt_message_textView")
    private MobileElement textoUserPass;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/login_alt_message_textView")
    private MobileElement botaoTry;



    public void ClicarManuLogin(){
        click(menuLogin);
    }

    public void DigitaCampoUser(String campo){
        sendKeys(campoUser,campo);
    }

    public void DigitaCampoPass(String campo){
        sendKeys(campoPass,campo);
    }

    public void ClicarEmLogin(){
        click(botaoLogin);
    }

    public String retornaTextoDigUserPass( ){
        return getText(textoUserPass);
    }

    public void ClicarButtonTry(){
        click(botaoTry);
    }


}
