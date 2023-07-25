package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.co.library.pages.HomePage;

public class JobSearchSteps {
    @Given("enter job title {string}")
    public void enterJobTitleJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }


    @When("I enter Location {string}")
    public void iEnterLocationLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @When("I select distance {string}")
    public void iSelectDistanceDistance(String distance) {
        new HomePage().enterLocation(distance);
    }

    @When("I click on moreSearchOptionsLink")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @When("I enter salaryMin {string}")
    public void iEnterSalaryMinSalaryMin(String salaryMin) {
        new HomePage().enterMinSalary(salaryMin);
    }

    @When("I enter salaryMax {string}")
    public void iEnterSalaryMaxSalaryMax(String salaryMax) {
        new HomePage().enterMaxSalary(salaryMax);
    }

    @When("I select salaryType {string}")
    public void iSelectSalaryTypeSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("I select jobType {string}")
    public void iSelectJobTypeJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on {string} button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I verify the result {string}")
    public void iVerifyTheResultResult(String result) {

    }
}
