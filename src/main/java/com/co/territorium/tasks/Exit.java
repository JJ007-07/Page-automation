package com.co.territorium.tasks;

import com.co.territorium.models.Credentials;
import com.co.territorium.userinterfaces.ExitMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Keys;


public class Exit implements Task {
    Credentials credentials;
    String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);

    public Exit(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ExitMenu.CERRAR));
        actor.attemptsTo(Click.on(ExitMenu.COSA1));
        actor.attemptsTo(Click.on(ExitMenu.COSA2));
    }


    public static Exit enter(Credentials credentials) {
        return Tasks.instrumented(Exit.class, credentials);
    }

}
