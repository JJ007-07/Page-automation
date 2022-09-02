package com.co.territorium.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class IndexPage {

    public static final Target OPTION1 = Target.the("click the first button")
            .locatedBy("//a[@id='li[34941167]a']");

    public static final Target OPTION2 = Target.the("click the second button")
            .locatedBy("//a[@id='li[34941177]a']");

    public static final Target OPTION3 = Target.the("click the third button")
            .locatedBy("//a[@id='li[309533317]a']");

    public static final Target OPTION4 = Target.the("click the another button")
            .locatedBy("//a[@id='li[309533317]a']");
}
