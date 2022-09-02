package com.co.territorium.tasks;

import com.co.territorium.interactions.WaitElement;
import com.co.territorium.models.Credentials;
import com.co.territorium.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


public class Login implements Task {
    Credentials credentials;
    String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);

    public Login(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginPage.TXT_DOCUMENT));
        actor.attemptsTo(Click.on(LoginPage.TXT_USERDOCUMENT));
        actor.attemptsTo(Enter.theValue(credentials.getNumberdocument()).into(LoginPage.TXT_NUMBERDOCUMENT));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(WaitElement.untilBeEnable(LoginPage.BTN_LOGIN));
        actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
        actor.attemptsTo(WaitElement.untilBeEnable(LoginPage.BTN_LOGIN2));
        actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN2));
        actor.attemptsTo(Click.on(LoginPage.TXT_INFO));
    }


    public static Login enter(Credentials credentials) {
        return Tasks.instrumented(Login.class, credentials);
    }

}
