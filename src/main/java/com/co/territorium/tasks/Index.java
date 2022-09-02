package com.co.territorium.tasks;

import com.co.territorium.models.Credentials;
import com.co.territorium.userinterfaces.IndexPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Keys;


public class Index implements Task {
    Credentials credentials;
    String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);

    public Index(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(IndexPage.OPTION1));
        actor.attemptsTo(Click.on(IndexPage.OPTION2));
        actor.attemptsTo(Click.on(IndexPage.OPTION3));
        actor.attemptsTo(Click.on(IndexPage.OPTION4));
    }

    public static Index enter(Credentials credentials) {
        return Tasks.instrumented(Index.class, credentials);
    }

}
