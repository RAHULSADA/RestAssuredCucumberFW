package com.example.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class GoogleMapsStepDefinations {

    @Given("{string} api body")
    public void api_body(String string) {
        System.out.println("Hello world!!");
    }

    @When("POST http method is hit")
    public void post_http_method_is_hit() {
        System.out.println("When");
    }

    @Then("{string} received is {string}")
    public void received_is(String string, String string2) {
        System.out.println("Then");
    }
}
