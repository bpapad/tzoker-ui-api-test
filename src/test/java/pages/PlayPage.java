package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlayPage extends PageObject {

    @FindBy(xpath = ".//span[contains(text(), 'Select Numbers')]/ancestor::button")
    WebElement selectNumbersButton;

    @FindBy(xpath = ".//section[contains(@class ,'opap-modal')]")
    WebElement opapModal;

    @FindBy(xpath = ".//div[@id = 'ptz-select-numbers-modal__number']")
    WebElement totalCostDiv;

    @FindBy(xpath = ".//span[text() = 'Add']//ancestor::button")
    WebElement addButton;


    public String getPlayPageUrl(){
        return this.getDriver().getCurrentUrl();
    }

    public void clickSelectNumbersButton(){
        WebDriverWait wait = new WebDriverWait(this.getDriver(), Duration.ofMillis(10000));
        wait.until(ExpectedConditions.elementToBeClickable(selectNumbersButton));
        selectNumbersButton.click();
    }

    public void waitForModal(){
        WebDriverWait wait = new WebDriverWait(this.getDriver(), Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOf(opapModal));
    }

    public void selectNumberInSection(String number, String section){
        WebDriver driver = this.getDriver();
        switch (section){
            case "main":
                driver.findElement(By.xpath(".//div[contains(@class, 'main__numbers')]//div[text() = '"+number+"']")).click();
                break;
            case "tzoker":
                driver.findElement(By.xpath(".//div[contains(@class, 'tzoker__numbers')]//div[text() = '"+number+"']")).click();
                break;
            case "systems":
                break;
        }
    }

    public String getTotalCost() throws InterruptedException {
        Thread.sleep(1000);
        return totalCostDiv.getText();
    }

    public void clickAddButton(){
        WebDriverWait wait = new WebDriverWait(this.getDriver(), Duration.ofMillis(10000));
        wait.until(ExpectedConditions.elementToBeClickable(addButton));
//        addButton.click();
        Actions actions = new Actions(this.getDriver());
        actions.moveToElement(addButton).click().perform();
    }

    public Boolean isCouponAddedInList(String[] numbers){
        WebDriver driver =  this.getDriver();
        try{
            return driver.findElement(By.xpath(".//div[text() = '"+numbers[0]+"']/ancestor::button/..//div[text() = '"+numbers[1]+"']/ancestor::button/..//div[text() = '"+numbers[2]+"']/ancestor::button/..//div[text() = '"+numbers[3]+"']/ancestor::button/..//div[text() = '"+numbers[4]+"']/ancestor::button/..//div[text() = '"+numbers[5]+"']")).isDisplayed();
        }catch(Exception e){
            return Boolean.FALSE;
        }
    }



}
