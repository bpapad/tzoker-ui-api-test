package steps;

import converter.ActiveDrawConverter;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.SoftAssertions;
import rest.RestService;
import view.ActiveDraw;

public class ApiThenSteps {

    @Steps
    RestService restService;

    SoftAssertions softAssertions = new SoftAssertions();


    @Then("^Response status code is (.*)$")
    public void responseStatusCodeIs(String code) {
        softAssertions.assertThat(RestService.response.getStatusCode()).isEqualTo(Integer.parseInt(code));
    }


    @Then("^Active draw (.*) is (.*)$")
    public void activeDrawStatusIsActive(String field, String value) {
        ActiveDraw activeDraw = ActiveDrawConverter.convert(RestService.response.getBody().asString());
        System.out.println("Current Active Draw Number: "+activeDraw.getDrawId());
        switch (field){
            case "status":
                softAssertions.assertThat(activeDraw.getStatus()).isEqualTo(value);
                break;
//            .
//            .
//            .
        }
    }
}
