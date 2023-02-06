package steps;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.SoftAssertions;
import pages.PlayPage;

public class ThenSteps {

    @Steps
    PlayPage playPage;

    SoftAssertions softAssertions = new SoftAssertions();

    @Then("User gets redirected to Play page")
    public void userGetsRedirectedToPlayPage() {
        softAssertions.assertThat(playPage.getPlayPageUrl()).contains("tzoker/katathesi-deltiou-tzoker");
    }


    @Then("^Total cost is equal to (.*)$")
    public void totalCostIsEqualTo(String cost) throws InterruptedException {
        softAssertions.assertThat(playPage.getTotalCost()).contains(cost);
    }

    @Then("^Coupon with numbers (.*) and cost (.*) added in list$")
    public void couponWithNumbersAndCostAddedInList(String numbers, String cost) {
        String[] numbersArray = numbers.trim().split(",");
        for(int i=0;i<numbersArray.length;i++){
            numbersArray[i] = numbersArray[i].trim();
        }
        softAssertions.assertThat(playPage.isCouponAddedInList(numbersArray)).isTrue();
    }
}
