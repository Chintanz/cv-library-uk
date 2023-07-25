package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utilities.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = ("//input[@id='keywords']"))
    WebElement jobTitle;
    @CacheLookup
    @FindBy(xpath = ("//input[@id='location']"))
    WebElement location;
    @CacheLookup
    @FindBy(xpath = ("//select[@id='distance']"))
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = ("//div[@class='hp-search-more']"))
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = ("//input[@id='salarymin']"))
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = ("//input[@id='salarymax']"))
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = ("//select[@id='salarytype']"))
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = ("//select[@id='tempperm']"))
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = ("//input[@id='hp-search-btn']"))
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath = "//span[@class='mat-button-wrapper']//span[text()='Accept All']")
    WebElement acceptCookies;



public void enterJobTitle(String jobTitleField)
{sendTextToElement(jobTitle,jobTitleField);
    log.info("Enter Job title: " + jobTitle.toString());}

public void enterLocation(String locationField)
{sendTextToElement(location,locationField);
    log.info("Enter location: " + location.toString());}

public void selectDistance(String distance){
    selectByVisibleTextFromDropDown(distanceDropDown,distance);
    log.info("Select distance: " + distanceDropDown.toString());
}
    public void clickOnMoreSearchOptionLink(){
    clickOnElement(moreSearchOptionsLink);
    }
public void enterMinSalary(String minSalary)
{sendTextToElement(salaryMin,minSalary);
    log.info("Enter minimum salary : " + salaryMin.toString());}
public void enterMaxSalary(String maxSalary)
{sendTextToElement(salaryMax,maxSalary);
    log.info("Enter maximum salary : " + salaryMax.toString());}

public void selectSalaryType(String sType)
{selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
    log.info("Select Salary type : " + salaryTypeDropDown.toString());}

public void selectJobType(String jobType)
{clickOnElement(jobTypeDropDown);
    log.info("Select Job type : " + jobTypeDropDown.toString());
}
public void clickOnFindJobsButton()
{clickOnElement(findJobsBtn);}

ResultPage resultPage= new ResultPage();












}
