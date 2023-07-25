package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import uk.co.library.utilities.Utility;

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")

    WebElement verifyResultText;


    public void verifyTheResults(String  expected){
        Assert.assertEquals(getTextFromElement(verifyResultText),expected);
    }
}
