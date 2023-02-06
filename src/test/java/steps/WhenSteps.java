package steps;

import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import pages.PlayPage;
import pages.StartPage;

public class WhenSteps {

    @Steps
    StartPage startPage;

    @Steps
    PlayPage playPage;

    EnvironmentVariables environmentVariables;

    @When("^User navigates to (.*) webpage$")
    public void userNavigatesToTzokerWebpage(String url) {
        if(url.contains("tzoker")){
            startPage.openUrl(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("webdriver.baseurl"));
        }
        else{
            startPage.openUrl(url);
        }
    }

    @When("User selects to Create slip")
    public void userSelectsToCreateSlip() {
        startPage.clickCreateSlipButton();
    }

    @When("User clicks on Select numbers button")
    public void userClicksOnSelectNumbersButton() {
        playPage.clickSelectNumbersButton();
        playPage.waitForModal();
    }

    @When("^Users inputs the number (.*) in section (.*)$")
    public void usersInputsTheNumberNumberInSectionSection(String number, String section) {
        playPage.selectNumberInSection(number, section);
    }

    @When("User clicks on Add button")
    public void userClicksOnAddButton() throws InterruptedException {
        playPage.clickAddButton();
        Thread.sleep(1000);
    }

}
