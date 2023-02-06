package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends PageObject {

    @FindBy(xpath = ".//a[contains(text(), 'Create slip')]")
    WebElement createSlipButton;


    public void clickCreateSlipButton(){
        createSlipButton.click();
    }

}
