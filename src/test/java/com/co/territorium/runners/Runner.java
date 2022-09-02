package com.co.territorium.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/territorium.feature",
snippets = SnippetType.CAMELCASE,
glue = "com.co.territorium.stepsdefinitions")

public class Runner {
}