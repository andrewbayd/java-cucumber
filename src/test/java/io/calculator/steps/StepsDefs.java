package io.calculator.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.calculator.Functions;
import cucumber.api.java.en.Given;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepsDefs {

    private Functions functions;
    private int actualResult;

    @Given("^I create a new function object$")
    public void createNewObject() {
        functions = new Functions();
    }

    @When("^I pass (.*) and (.*) as parameters$")
    public void distractTwoNumbers(int a, int b) {
        actualResult = functions.distraction(a, b);
    }

    @Then("^I get (.*) as a result$")
    public void checkResult(int expectrdResult) {
        assertEquals(expectrdResult, actualResult);
    }

}
