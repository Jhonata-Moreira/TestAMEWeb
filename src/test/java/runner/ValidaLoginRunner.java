package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/valida_pagina_de_login.feature"}, glue = "src/test/java/ame/web/stepsDefinitions/validaLoginStepsDefs.java")
public class ValidaLoginRunner {
}
