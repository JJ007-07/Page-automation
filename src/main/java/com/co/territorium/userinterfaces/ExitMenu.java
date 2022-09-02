package com.co.territorium.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ExitMenu {

    public static final Target CERRAR = Target.the("click another button")
            .locatedBy("//span[@id='cierra']");

    public static final Target COSA1 = Target.the("click the button")
            .locatedBy("//i[@id='MenuUsuario']");

    public static final Target COSA2 = Target.the("click the button")
            .locatedBy("//a[@title='Salir']");
}
