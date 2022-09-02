package com.co.territorium.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class    LoginPage {

    public static final Target TXT_DOCUMENT = Target.the("select the typedocument")
            .locatedBy("//select[@id='typeDocument']");
    public static final Target TXT_USERDOCUMENT = Target.the("select the typedocument")
            .locatedBy("//select[@id='typeDocument']/option[@value='TI']");

    public static final Target TXT_NUMBERDOCUMENT = Target.the("enter the username")
            .locatedBy("//input[@id='document']");

    public static final Target TXT_PASSWORD = Target.the("enter the password")
            .locatedBy("//input[@id='passwd']");

    public static final Target BTN_LOGIN = Target.the("click the button")
            .locatedBy("//input[@id='ingresar']");

    public static final Target BTN_LOGIN2 = Target.the("click another button")
            .locatedBy("//span[@id='cierra']");

    public static final Target TXT_INFO = Target.the("click the text info")
            .locatedBy("//a[@class='letras1']");
}
