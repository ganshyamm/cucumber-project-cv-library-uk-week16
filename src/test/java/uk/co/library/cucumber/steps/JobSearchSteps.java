package uk.co.library.cucumber.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("^I am on HomePage$")
    public void iAmOnHomePage() {


    }

    @And("^I accept Iframe alert$")
    public void iAcceptIframeAlert() throws InterruptedException {
        new HomePage().acceptIFrameAlert();
    }

    @And("^I enter \"([^\"]*)\" in JobTitle field$")
    public void iEnterInJobTitleField(String jobtitle) {
        new HomePage().addJobTitle(jobtitle);


    }

    @And("^I enter \"([^\"]*)\" in Location field$")
    public void iEnterInLocationField(String location) {
        new HomePage().addLocation(location);


    }

    @And("^I select \"([^\"]*)\" from Distance dropdown$")
    public void iSelectFromDistanceDropdown(String distance) {
        new HomePage().selectDistance(distance);


    }

    @And("^I click on more search options$")
    public void iClickOnMoreSearchOptions() {
        new HomePage().clickOnMoreSearchOption();
    }

    @And("^I enter \"([^\"]*)\" in SalaryMin field$")
    public void iEnterInSalaryMinField(String minSalary) {
        new HomePage().enterMinSalary(minSalary);


    }

    @And("^I enter \"([^\"]*)\" in SalaryMax field$")
    public void iEnterInSalaryMaxField(String maxSalary) {
        new HomePage().enterMaxSalary(maxSalary);

    }

    @And("^I select \"([^\"]*)\" from Salary Type dropdown$")
    public void iSelectFromSalaryTypeDropdown(String salaryType) {
        new HomePage().selectSalaryType(salaryType);


    }

    @And("^I select \"([^\"]*)\" from Job Type dropdown$")
    public void iSelectFromJobTypeDropdown(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("^I click on Find Jobs button$")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobButton();
    }

    @Then("^I can verify Search \"([^\"]*)\"$")
    public void iCanVerifySearch(String result) {
        new ResultPage().verifyTheResults(result);
    }
}
