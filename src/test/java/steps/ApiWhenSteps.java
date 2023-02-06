package steps;

import converter.ActiveDrawConverter;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;
import rest.RestService;

public class ApiWhenSteps {

    @Steps
    RestService restService;

    @When("^A simple GET api call to (.*) is made$")
    public void aSimpleGETApiCall(String url) {
        restService.simpleGetRequest(url);
    }

}
