package com.co.territorium.stepsdefinitions;

import com.co.territorium.models.Credentials;
import com.co.territorium.tasks.Exit;
import com.co.territorium.tasks.Index;
import com.co.territorium.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class StepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("James");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^He user is on the page$")
    public void heUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://sena.territorio.la/index.php?login=true"));
    }

    @When("^the user enter the credentials$")
    public void theUserEnterTheCredentials(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(credentials));
    }

    @And("^He could see the index$")
    public void heCouldSeeIndex() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://sena.territorio.la/content_mooc.php?idMateria=1468117&social=17518467"));
    }

    @And("^He use the main menu$")
    public void HeUseTheMainMenu(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Index.enter(credentials));
    }

    @And("^He see the another page with info$")
    public void HeSeeAnotherPage() throws InterruptedException {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.youtube.com/"));
    }

    @And("^He see the document$")
    public void HeGoWhereTheDocument() throws InterruptedException {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.youtube.com/"));
    }

    @And("^He see the index page final$")
    public void HeSeeAnotherFinalPage() throws InterruptedException {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://sena.territorio.la/init.php"));
    }

    @Then("^User logs out$")
    public void TheUserLogsOff(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Exit.enter(credentials));
    }
}
